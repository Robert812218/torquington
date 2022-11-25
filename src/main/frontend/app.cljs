(ns frontend.app
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]))

(defn atom-input [value]
  [:input {:type "text"
           :value @value
           :on-change #(reset! value (-> % .-target .-value))}])

(defn shared-state []
  (let [val (r/atom "foo")]
    (fn []
      [:div
        [:p "The value is now: " @val]
        [:p "Change it here: " [atom-input val]]])))


(defn ^:dev/after-load start []
  (rdom/render
    [shared-state]
   (.-body js/document)))

(defn init []
  (start))

(defn ^:dev/before-load stop []
  (js/console.log "stop"))


