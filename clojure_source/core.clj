(ns clojure-source.core
  (:import (com.badlogic.gdx.backends.lwjgl LwjglApplication)
           AppConfig
           Game))
(defn render
  []
  )

(def GameApp (Game. render))

(add-watch #'render :$-key (fn [key reference old-state new-state]
                             (.reLoad GameApp)))

(defn world-controller-init
  [])

(defn world-controller-update
  [delta-time])

(def App (LwjglApplication.
           GameApp
           (AppConfig.)))