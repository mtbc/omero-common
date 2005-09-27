package ome.model;

import ome.util.BaseModelUtils;
import ome.util.Filterable;
import ome.util.Filter;


import java.util.*;




/**
 * Feature generated by hbm2java
 */
public class
Feature 
implements java.io.Serializable ,
ome.api.OMEModel,
ome.util.Filterable {

    // Fields    

     private Integer featureId;
     private String name;
     private String tag;
     private Image image;
     private Set features;
     private Feature feature;


    // Constructors

    /** default constructor */
    public Feature() {
    }
    
    /** constructor with id */
    public Feature(Integer featureId) {
        this.featureId = featureId;
    }
   
    
    

    // Property accessors

    /**
     * 
     */
    public Integer getFeatureId() {
        return this.featureId;
    }
    
    public void setFeatureId(Integer featureId) {
        this.featureId = featureId;
    }

    /**
     * 
     */
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     */
    public String getTag() {
        return this.tag;
    }
    
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * 
     */
    public Image getImage() {
        return this.image;
    }
    
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * 
     */
    public Set getFeatures() {
        return this.features;
    }
    
    public void setFeatures(Set features) {
        this.features = features;
    }

    /**
     * 
     */
    public Feature getFeature() {
        return this.feature;
    }
    
    public void setFeature(Feature feature) {
        this.feature = feature;
    }






  public boolean acceptFilter(Filter filter){


	  // Visiting: FeatureId ------------------------------------------
	  Integer _FeatureId = null;
	  try {
	     _FeatureId = getFeatureId();
	  } catch (Exception e) {
		 setFeatureId(null);
	  }
// TODO catch class cast?
	  setFeatureId((Integer) filter.filter("org.hibernate.mapping.RootClass(ome.model.Feature):FeatureId",_FeatureId)); 

	  // Visiting: Name ------------------------------------------
	  String _Name = null;
	  try {
	     _Name = getName();
	  } catch (Exception e) {
		 setName(null);
	  }
// TODO catch class cast?
	  setName((String) filter.filter("org.hibernate.mapping.RootClass(ome.model.Feature):Name",_Name)); 

	  // Visiting: Tag ------------------------------------------
	  String _Tag = null;
	  try {
	     _Tag = getTag();
	  } catch (Exception e) {
		 setTag(null);
	  }
// TODO catch class cast?
	  setTag((String) filter.filter("org.hibernate.mapping.RootClass(ome.model.Feature):Tag",_Tag)); 

	  // Visiting: Image ------------------------------------------
	  Image _Image = null;
	  try {
	     _Image = getImage();
	  } catch (Exception e) {
		 setImage(null);
	  }
// TODO catch class cast?
	  setImage((Image) filter.filter("org.hibernate.mapping.RootClass(ome.model.Feature):Image",_Image)); 

	  // Visiting: Features ------------------------------------------
	  Set _Features = null;
	  try {
	     _Features = getFeatures();
	  } catch (Exception e) {
		 setFeatures(null);
	  }
// TODO catch class cast?
	  setFeatures((Set) filter.filter("org.hibernate.mapping.RootClass(ome.model.Feature):Features",_Features)); 

	  // Visiting: Feature ------------------------------------------
	  Feature _Feature = null;
	  try {
	     _Feature = getFeature();
	  } catch (Exception e) {
		 setFeature(null);
	  }
// TODO catch class cast?
	  setFeature((Feature) filter.filter("org.hibernate.mapping.RootClass(ome.model.Feature):Feature",_Feature)); 
   	 return true;
  }
  
  public String toString(){
	return "Feature"+(featureId==null ? ":Hash_"+this.hashCode() : ":Id_"+featureId);
  }
  


}