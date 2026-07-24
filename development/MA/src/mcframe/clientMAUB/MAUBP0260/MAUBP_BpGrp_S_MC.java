package mcframe.clientMAUB.MAUBP0260;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_BpGrp_S"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_BpGrp_S_MC extends MAUBP_BpGrp_S_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_BpGrp_S_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_BpGrp_S_MC(mcframe.clientMAUB.MAUBP0260.BpGrpR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_BpGrp START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_BpGrp END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	@Override
	public void doBpGrp_bp_grp_flg1_NC(MCEventInfo info) {
		super.doBpGrp_bp_grp_flg1_NC(info);

		if (!getBpGrpR().bp_grp_flg1()) {
			getBpGrpR().bp_grp_cd1(null);
			getBpGrpR().bp_grp_nm1(null);
		}
		setCdNmMode(BpGrp_bp_grp_cd1, BpGrp_bp_grp_nm1, getBpGrpR().bp_grp_flg1());
	}

	@Override
	public void doBpGrp_bp_grp_flg2_NC(MCEventInfo info) {
		super.doBpGrp_bp_grp_flg2_NC(info);

		if (!getBpGrpR().bp_grp_flg2()) {
			getBpGrpR().bp_grp_cd2(null);
			getBpGrpR().bp_grp_nm2(null);
		}
		setCdNmMode(BpGrp_bp_grp_cd2, BpGrp_bp_grp_nm2, getBpGrpR().bp_grp_flg2());
	}

	@Override
	public void doBpGrp_bp_grp_flg3_NC(MCEventInfo info) {
		super.doBpGrp_bp_grp_flg3_NC(info);

		if (!getBpGrpR().bp_grp_flg3()) {
			getBpGrpR().bp_grp_cd3(null);
			getBpGrpR().bp_grp_nm3(null);
		}
		setCdNmMode(BpGrp_bp_grp_cd3, BpGrp_bp_grp_nm3, getBpGrpR().bp_grp_flg3());
	}

	@Override
	public void doBpGrp_bp_grp_flg4_NC(MCEventInfo info) {
		super.doBpGrp_bp_grp_flg4_NC(info);

		if (!getBpGrpR().bp_grp_flg4()) {
			getBpGrpR().bp_grp_cd4(null);
			getBpGrpR().bp_grp_nm4(null);
		}
		setCdNmMode(BpGrp_bp_grp_cd4, BpGrp_bp_grp_nm4, getBpGrpR().bp_grp_flg4());
	}

	@Override
	public void doBpGrp_bp_grp_flg5_NC(MCEventInfo info) {
		super.doBpGrp_bp_grp_flg5_NC(info);

		if (!getBpGrpR().bp_grp_flg5()) {
			getBpGrpR().bp_grp_cd5(null);
			getBpGrpR().bp_grp_nm5(null);
		}
		setCdNmMode(BpGrp_bp_grp_cd5, BpGrp_bp_grp_nm5, getBpGrpR().bp_grp_flg5());
	}

	@Override
	public void doBpGrp_bp_grp_flg6_NC(MCEventInfo info) {
		super.doBpGrp_bp_grp_flg6_NC(info);

		if (!getBpGrpR().bp_grp_flg6()) {
			getBpGrpR().bp_grp_cd6(null);
			getBpGrpR().bp_grp_nm6(null);
		}
		setCdNmMode(BpGrp_bp_grp_cd6, BpGrp_bp_grp_nm6, getBpGrpR().bp_grp_flg6());
	}

	@Override
	public void doBpGrp_bp_grp_flg7_NC(MCEventInfo info) {
		super.doBpGrp_bp_grp_flg7_NC(info);

		if (!getBpGrpR().bp_grp_flg7()) {
			getBpGrpR().bp_grp_cd7(null);
			getBpGrpR().bp_grp_nm7(null);
		}
		setCdNmMode(BpGrp_bp_grp_cd7, BpGrp_bp_grp_nm7, getBpGrpR().bp_grp_flg7());
	}

	@Override
	public void doBpGrp_bp_grp_flg8_NC(MCEventInfo info) {
		super.doBpGrp_bp_grp_flg8_NC(info);

		if (!getBpGrpR().bp_grp_flg8()) {
			getBpGrpR().bp_grp_cd8(null);
			getBpGrpR().bp_grp_nm8(null);
		}
		setCdNmMode(BpGrp_bp_grp_cd8, BpGrp_bp_grp_nm8, getBpGrpR().bp_grp_flg8());
	}

	@Override
	public void doBpGrp_bp_grp_flg9_NC(MCEventInfo info) {
		super.doBpGrp_bp_grp_flg9_NC(info);

		if (!getBpGrpR().bp_grp_flg9()) {
			getBpGrpR().bp_grp_cd9(null);
			getBpGrpR().bp_grp_nm9(null);
		}
		setCdNmMode(BpGrp_bp_grp_cd9, BpGrp_bp_grp_nm9, getBpGrpR().bp_grp_flg9());
	}

	@Override
	public void doBpGrp_bp_grp_flg10_NC(MCEventInfo info) {
		super.doBpGrp_bp_grp_flg10_NC(info);

		if (!getBpGrpR().bp_grp_flg10()) {
			getBpGrpR().bp_grp_cd10(null);
			getBpGrpR().bp_grp_nm10(null);
		}
		setCdNmMode(BpGrp_bp_grp_cd10, BpGrp_bp_grp_nm10, getBpGrpR().bp_grp_flg10());
	}

	@Override
	public void setMode(java.lang.String status) {
		super.setMode(status);

		setCdNmMode();
	}

	protected void setCdNmMode() {
		setCdNmMode(BpGrp_bp_grp_cd1, BpGrp_bp_grp_nm1, getBpGrpR().bp_grp_flg1());
		setCdNmMode(BpGrp_bp_grp_cd2, BpGrp_bp_grp_nm2, getBpGrpR().bp_grp_flg2());
		setCdNmMode(BpGrp_bp_grp_cd3, BpGrp_bp_grp_nm3, getBpGrpR().bp_grp_flg3());
		setCdNmMode(BpGrp_bp_grp_cd4, BpGrp_bp_grp_nm4, getBpGrpR().bp_grp_flg4());
		setCdNmMode(BpGrp_bp_grp_cd5, BpGrp_bp_grp_nm5, getBpGrpR().bp_grp_flg5());
		setCdNmMode(BpGrp_bp_grp_cd6, BpGrp_bp_grp_nm6, getBpGrpR().bp_grp_flg6());
		setCdNmMode(BpGrp_bp_grp_cd7, BpGrp_bp_grp_nm7, getBpGrpR().bp_grp_flg7());
		setCdNmMode(BpGrp_bp_grp_cd8, BpGrp_bp_grp_nm8, getBpGrpR().bp_grp_flg8());
		setCdNmMode(BpGrp_bp_grp_cd9, BpGrp_bp_grp_nm9, getBpGrpR().bp_grp_flg9());
		setCdNmMode(BpGrp_bp_grp_cd10, BpGrp_bp_grp_nm10, getBpGrpR().bp_grp_flg10());
	}

	protected void setCdNmMode(MCModeBeans cdBeans, MCModeBeans nmBeans, boolean flg) {
		if (flg) {
			setDefaultMode(cdBeans);
			setDefaultMode(nmBeans);
		}
		else {
			cdBeans.setMode(MCMode.READ_ONLY);
			nmBeans.setMode(MCMode.READ_ONLY);
		}
	}

}