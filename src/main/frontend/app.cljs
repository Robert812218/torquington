(ns frontend.app
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]))

(def click-count (r/atom 0))

(defn counting-component []
  [:div
   "The atom " [:code "click-count"] " has value: "
   @click-count ". "
   [:input {:type "button" :value "Click me!"
            :on-click #(swap! click-count inc)}]])
;; Init Stuff

(defn ^:dev/after-load start []
  (rdom/render
   [counting-component]
   (.-body js/document)))

(defn init []
  (start))

(defn ^:dev/before-load stop []
  (js/console.log "stop"))
