package ds.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by skupunarapu on 10/16/2015.
 */
public class Address {

    public static void main(String[] args) {
        AddrNode addrNodeCountry = new AddrNode();
        addrNodeCountry.setValue("India");
        addrNodeCountry.setAncestor(null);

        AddrNode addrNodeSAP = new AddrNode();
        addrNodeSAP.setValue("Andhra Pradesh");
        addrNodeSAP.setAncestor(addrNodeCountry);

        AddrNode addrNodeSTel = new AddrNode();
        addrNodeSTel.setValue("Telangana");
        addrNodeSTel.setAncestor(addrNodeCountry);

        AddrNode addrNodeSTN = new AddrNode();
        addrNodeSTN.setValue("Tamil Nadu");
        addrNodeSTN.setAncestor(addrNodeCountry);

        AddrNode addrNodeDHyd = new AddrNode();
        addrNodeDHyd.setValue("Hyderabad");
        addrNodeDHyd.setAncestor(addrNodeSTel);
        addrNodeDHyd.setChildNodes(null);

        AddrNode addrNodeDRR = new AddrNode();
        addrNodeDRR.setValue("RangaReddy");
        addrNodeDRR.setAncestor(addrNodeSTel);
        addrNodeDRR.setChildNodes(null);

        AddrNode addrNodeDGun = new AddrNode();
        addrNodeDGun.setValue("Guntur");
        addrNodeDGun.setAncestor(addrNodeSAP);
        addrNodeDGun.setChildNodes(null);

        AddrNode addrNodeDAmr = new AddrNode();
        addrNodeDAmr.setValue("Amaravati");
        addrNodeDAmr.setAncestor(addrNodeSAP);
        addrNodeDAmr.setChildNodes(null);

        AddrNode addrNodeDVlrr = new AddrNode();
        addrNodeDVlrr.setValue("Vellore");
        addrNodeDVlrr.setAncestor(addrNodeSTN);
        addrNodeDVlrr.setChildNodes(null);

        AddrNode addrNodeDSal = new AddrNode();
        addrNodeDSal.setValue("Salem");
        addrNodeDSal.setAncestor(addrNodeSTN);
        addrNodeDSal.setChildNodes(null);

        List<AddrNode> TNDistricts = new ArrayList<AddrNode>();
        TNDistricts.add(addrNodeDVlrr);
        TNDistricts.add(addrNodeDSal);

        List<AddrNode> APDistricts = new ArrayList<AddrNode>();
        APDistricts.add(addrNodeDAmr);
        APDistricts.add(addrNodeDGun);

        List<AddrNode> TelDistricts = new ArrayList<AddrNode>();
        TelDistricts.add(addrNodeDHyd);
        TelDistricts.add(addrNodeDRR);

        addrNodeSAP.setChildNodes(APDistricts);
        addrNodeSTel.setChildNodes(TelDistricts);
        addrNodeSTN.setChildNodes(TNDistricts);

        List<AddrNode> IndiaStates = new ArrayList<AddrNode>();
        IndiaStates.add(addrNodeSAP);
        IndiaStates.add(addrNodeSTel);
        IndiaStates.add(addrNodeSTN);

        addrNodeCountry.setChildNodes(IndiaStates);

        getAncestor(addrNodeDRR);
    }



    public static class AddrNode{
        private List<AddrNode> childNodes;
        private String value;
        private AddrNode ancestor;

        public List<AddrNode> getChildNodes() {
            return childNodes;
        }

        public void setChildNodes(List<AddrNode> childNodes) {
            this.childNodes = childNodes;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public AddrNode getAncestor() {
            return ancestor;
        }

        public void setAncestor(AddrNode ancestor) {
            this.ancestor = ancestor;
        }
    }

    public static void getAncestor(AddrNode currentNode){
        if(currentNode != null){
            System.out.println("current node: " + currentNode.value);
            if(currentNode.ancestor != null){
                System.out.println("parent node :" + currentNode.ancestor.value);
                getAncestor(currentNode.ancestor);
            }else return;
        }
    }
}
