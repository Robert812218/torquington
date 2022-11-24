(ns frontend.app
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]))

(defn simple-component []
  [:div
   [:p "I am a component!"]
   [:p.someclass
    "I have " [:strong "bold"]
    [:span {:style {:color "red"}} " and red "] "text."]])


(defn init []
  (rdom/render
   [simple-component]
   (.-body js/document)))

