package Convertors;

import misterymob475.StringCache;

public class Nether extends DimensionConverter {

    /**
     * Creates an instance of Nether
     * Because of the super call, there is no need to implement modifier here
     *
     * @param stringCache instance of {@link StringCache}
     */
    public Nether(StringCache stringCache) {
        super(stringCache, "/DIM1/region", new String[]{"_Converted/DIM1", "_Converted/DIM1/region"}, "Error during nether dimension fix", " nether dimension region files", "Converted the nether dimension");
    }


}
