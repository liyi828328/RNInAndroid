find ./app/src/main/assets -type f  -name 'index*.*' | xargs rm;
react-native bundle --platform android --dev false --entry-file ./js/hello_world.js --bundle-output ./app/src/main/assets/index_hello_world.bundle --assets-dest ./app/src/main/res/