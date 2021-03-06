(defproject jepsen.etcd "0.2.1"
  :description "etcd Jepsen test"
  :url "https://github.io/jepsen/etcd"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [jepsen "0.2.1-SNAPSHOT"]
                 [tech.droit/clj-diff "1.0.1"]
                 ; jetcd has a bunch of dep ranges we have to pin
                 [io.etcd/jetcd-core "0.4.1"
                  :exclusions [io.grpc/grpc-api
                               com.google.errorprone/error_prone_annotations
                               io.grpc/grpc-netty
                               io.grpc/grpc-core]]
                 [io.grpc/grpc-core "1.24.0"
                  :exclusions [io.grpc/grpc-api
                               com.google.errorprone/error_prone_annotations]]
                 [io.grpc/grpc-api "1.24.0"]
                 [io.grpc/grpc-netty "1.24.0"
                  :exclusions [io.grpc/grpc-core
                               io.netty/netty-codec-http2]]
                 [io.netty/netty-codec-http2 "4.1.38.Final"]
                 [com.google.errorprone/error_prone_annotations "2.3.3"]]
  :jvm-opts ["-Djava.awt.headless=true"
             "-server"]
  :repl-options {:init-ns jepsen.etcd}
  :main jepsen.etcd)
