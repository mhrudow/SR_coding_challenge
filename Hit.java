public class Hit {
    private Integer[] hit;
    private Integer[] hitRanges;
    private Integer[] returnHit;
    
    public Hit(Integer[] hit, Integer[] returnHit) {
        this.hit = hit;
        this.returnHit = returnHit;
        this.hitRanges = new Integer[4];
        hitRanges[0] = hit[0];
        for (int i = 1; i < hitRanges.length; i++) {
            hitRanges[i] = hitRanges[i-1] + hit[i];
        }
    }
    
    public char hit() { 
        int probability = (int) Math.round(100*Math.random());
        int pos = 0;
        for (int i = 0; i < hitRanges.length; i++) {
            if (probability <= hitRanges[i]) { 
                pos = i; 
                break;
            }
        }
        if (pos == 0) { return 'f'; }
        else if (pos == 1) { return 's'; }
        else if (pos == 2) { return 't'; }
        else { return 'u'; }
    }

    public boolean returnHit(char c, int serve) {
        int probability = (int) Math.round(100 * Math.random());

        if (c == 'f') { return (returnHit[0] - serve) <= probability; }
        else if (c == 'c') { return (returnHit[1] - serve) <= probability; }
        else { return (returnHit[2]  - serve) <= probability; }
    }
}
