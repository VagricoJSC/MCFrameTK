package mcframe.clientMAUD.MAUDP1010;

import mcframe.clientCore.beans.MCCallerPanelBridge;
import mcframe.commonCore.annotation.EI;

@EI
public class MAUDP_BatchCaller<P extends MAUDP_RLBase, O extends MCCallerPanelBridge> extends
MAUDP_BatchCaller_MC<P, O>{

	public MAUDP_BatchCaller(P panel, O bridge) {
		super(panel, bridge);
	}
	

}

