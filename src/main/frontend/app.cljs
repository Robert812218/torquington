(ns frontend.app
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]
	    [clojure.string :as str]))

(defn text-1 []
	[:div
		[:p "This is the attention building efficiency man protocol bananza application machine (for your brain (TM(!))"]
		[:p "How bunged up is your brain compartment rn?"]])

(defn language-select []
	[:div
		[:h3 "What language do you want to learn?"
			[:button "French"]
			[:button "Spanish"]
			[:button "German"]
			[:button "Portugese"]
			[:button "Mandarin"]
		]
		[:h3 ""]
		])
(defn create-account []
	[:div
		[:input {:type "text"}]])

(defn login []
	[:div
		[:input "assdasd" {:type "text"}]])

(defn account-section []
	[:div {:style {:display :flex
				:flex-direction :column
				:width :20vw}} 
		[:h4 {:style {:class :account-header}}
		"Account"]
		[:div
			[:button "Create Account"]
			[:button "Login"]
			[:button "Settings"]
		]])

(defn front-page []
	[:div

		[account-section]
		[text-1]
		[language-select]
		])


(defn ^:dev/after-load start []
	(rdom/render
		[front-page]
	(.-body js/document)))

(defn init []
  (start))

(defn ^:dev/before-load stop []
  (js/console.log "stop"))


