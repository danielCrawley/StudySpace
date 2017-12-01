public LatLng getLocation()
    {
     // Get the location manager
     LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
     Criteria criteria = new Criteria();
     String bestProvider = locationManager.getBestProvider(criteria, false);
     Location location = locationManager.getLastKnownLocation(bestProvider);
     Double lat,lon;
     try {
       lat = location.getLatitude ();
       lon = location.getLongitude ();
       return new LatLng(lat, lon);
     }
     catch (NullPointerException e){
         e.printStackTrace();
       return null;
     }
    }