HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(String s : transactions){
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }
            else{
                map.put(s,1);
            }
        }
        TreeMap<String,Integer> tree = new TreeMap<>(map);
        ArrayList<String> list = new ArrayList<String>();
        Set<String> key = tree.keySet();
        for(String keys : key){
            String k = Integer.toString(map.get(keys));
            list.add(keys+" "+k);
        }
        return list;
