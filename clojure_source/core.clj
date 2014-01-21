(ns clojure-source.core
  (:import (com.badlogic.gdx.backends.lwjgl LwjglApplication)
           (java_source AppConfig Game)))

;WorldController

(println "hi")

(defn world-controller-init
  [])

(defn world-controller-update
  [delta-time])

(def App (LwjglApplication.
           (Game.)
           (AppConfig.)))