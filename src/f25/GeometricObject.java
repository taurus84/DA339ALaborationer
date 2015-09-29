package f25; 

public abstract class GeometricObject implements Comparable {
    public abstract double area();
    
    public double difference(GeometricObject geo){
        return this.area()- geo.area();
    }    
    
    public int compareTo(Object obj) {
    	GeometricObject go = (GeometricObject)obj;
    	double res = this.difference(go);
    	if(res<0)
    		return 1;
    	else if(res==0)
    		return 0;
    	else
    		return -1;
    }
}
