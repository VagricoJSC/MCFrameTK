package mcframe.clientMAUD.MAUDP1010;

import mcframe.clientMAUD.MAUDP0010.MAUDP_CallerNoPanel;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.param.MCDef;
import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCParam;
import mcframe.commonMA.constant.*;

public class MAUDP_RLUtil_MC extends mcframe.clientMAUD.MAUDP0030.MAUDP_RLUtil {

	// //////////////////////////
	// 以降Panelとの連携メソッド
	// //////////////////////////

	public String defGetUPD_ADMINStatus() {
		return "UPD_ADMIN";
	}
	public String defGetREFStatus() {
		return "REF";
	}
	public String defGetMODStatus() {
		return "MOD";
	}

	/**
	 * パネルクラスが IfRLBase の場合は、ステータスがUPDのときのみfillSpaceします。<br>
	 * それ以外は、上位クラスのメソッドを参照
	 */
	@Override
	public void defFillSpace() {
		if (getImplRLBase() instanceof IfRLBase) {
			IfRLBase p = (IfRLBase) getImplRLBase();
			if (getPanel().getStatus().equals(p.getUPDStatus()) 
					|| getPanel().getStatus().equals(p.getUPD_ADMINStatus())) {
				getDtlTable().fillSpace();
				getDtlTable().selectRowNoFocus(0);
			}
		}
		else {
			super.defFillSpace();
		}
	}

	// ////////////////
	// Dtlブロック関係
	// ////////////////

	/**
	 * アプリケーションが使用するデフォルトのセルコンフィグ
	 * @deprecated 共通親クラスのみがオーバーライド呼び出し可能
	 */
	@Deprecated
	public MAUDP_RLBaseCellConfig defCreateDefaultAppCellConfig() {
		MAUDP_RLBaseCellConfig cellConf = new MAUDP_RLBaseCellConfig((MAUDP_RLBase) getPanel());
		return cellConf;
	}

	public String getMstSetTypNm(MAC_MST_NM typ) {
		MCRow r = getMstSetTypR(typ);
		if (r == null) {
			return null;
		}
		return r.getString("mst_set_typ_nm");
	}

	public String getMstSetTyp(MAC_MST_NM typ) {
		MCRow r = getMstSetTypR(typ);
		if (r == null) {
			return null;
		}
		return r.getString("mst_set_typ");
	}

	public MCRow getMstSetTypR(MAC_MST_NM typ) {
		if (typ == null) {
			return null;
		}
		MCOperationInfo MA_MAUDL6010_Srch01_INFO = new MCOperationInfo("MA", "MAUDL6010",
				"Srch01", "000000", null);
		MCParam p = new MCParam(MA_MAUDL6010_Srch01_INFO);
		MCRow up = MCRow.create();
		up.addStringColumn("mst_nm", typ.value());
		MCRow down = MCRow.create();
		down.addStringColumn("mst_set_typ");
		down.addStringColumn("mst_set_typ_nm");
		p.addUpBlock(up);
		p.addDownBlock(down);
		_createCaller(p).exec();

		return down;
	}

	/**
	 * サーバ通信用のCallerを返します。
	 * 
	 * @param p MCParam
	 * @return Caller
	 */
	protected mcframe.clientCore.requester.MCCaller _createCaller(MCParam p) {
		return new MAUDP_CallerNoPanel(p);
	}
}

