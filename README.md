# ride

[![js-standard-style](https://img.shields.io/badge/code%20style-standard-brightgreen.svg?style=flat)](http://standardjs.com/)

## TODO:

- Do all the installation on a mac
- https://rnfirebase.io/docs/v4.2.x/installation/initial-setup
- https://rnfirebase.io/docs/v4.2.x/installation/ios
- https://rnfirebase.io/docs/v4.2.x/auth/ios
- https://rnfirebase.io/docs/v4.2.x/firestore/ios
- https://rnfirebase.io/docs/v4.2.x/config/ios
- https://github.com/facebook/react-native-fbsdk native install
- https://github.com/react-native-community/react-native-google-signin native install 

## Secrets / .env

This project uses [react-native-config](https://github.com/luggit/react-native-config) to expose config variables to your javascript code in React Native. You can store API keys
and other sensitive information in a `.env` file:

```
API_URL=https://myapi.com
GOOGLE_MAPS_API_KEY=abcdefgh
```

and access them from React Native like so:

```
import Secrets from 'react-native-config'

Secrets.API_URL  // 'https://myapi.com'
Secrets.GOOGLE_MAPS_API_KEY  // 'abcdefgh'
```

The `.env` file is ignored by git keeping those secrets out of your repo.

### Get started:
1. Copy .env.example to .env
2. Add your config variables
3. Follow instructions at [https://github.com/luggit/react-native-config#setup](https://github.com/luggit/react-native-config#setup)
4. Done!
