(ns clojure-source.core
  (:import (com.badlogic.gdx.backends.lwjgl LwjglApplication)
           (java_source AppConfig Game)))

;WorldController

(defn world-controller-init
  [])

(defn world-controller-update
  [delta-time])

(def App (LwjglApplication.
           (Game.)
           (AppConfig.)))