package mcframe.clientMAUB.MAUBP0250;

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
 * 画面"MAUBP_ItmGrp_S"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_ItmGrp_S_MC extends MAUBP_ItmGrp_S_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_ItmGrp_S_MC() {
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
	protected MAUBP_ItmGrp_S_MC(mcframe.clientMAUB.MAUBP0250.ItmGrpR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_ItmGrp START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_ItmGrp END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	@Override
	public void doItmGrp_itm_grp_flg1_NC(MCEventInfo info) {
		super.doItmGrp_itm_grp_flg1_NC(info);

		if (!getItmGrpR().itm_grp_flg1()) {
			getItmGrpR().itm_grp_cd1(null);
			getItmGrpR().itm_grp_nm1(null);
		}
		setCdNmMode(ItmGrp_itm_grp_cd1, ItmGrp_itm_grp_nm1, getItmGrpR().itm_grp_flg1());
	}
	@Override
	public void doItmGrp_itm_grp_flg2_NC(MCEventInfo info) {
		super.doItmGrp_itm_grp_flg2_NC(info);

		if (!getItmGrpR().itm_grp_flg2()) {
			getItmGrpR().itm_grp_cd2(null);
			getItmGrpR().itm_grp_nm2(null);
		}
		setCdNmMode(ItmGrp_itm_grp_cd2, ItmGrp_itm_grp_nm2, getItmGrpR().itm_grp_flg2());
	}
	@Override
	public void doItmGrp_itm_grp_flg3_NC(MCEventInfo info) {
		super.doItmGrp_itm_grp_flg3_NC(info);

		if (!getItmGrpR().itm_grp_flg3()) {
			getItmGrpR().itm_grp_cd3(null);
			getItmGrpR().itm_grp_nm3(null);
		}
		setCdNmMode(ItmGrp_itm_grp_cd3, ItmGrp_itm_grp_nm3, getItmGrpR().itm_grp_flg3());
	}
	@Override
	public void doItmGrp_itm_grp_flg4_NC(MCEventInfo info) {
		super.doItmGrp_itm_grp_flg4_NC(info);

		if (!getItmGrpR().itm_grp_flg4()) {
			getItmGrpR().itm_grp_cd4(null);
			getItmGrpR().itm_grp_nm4(null);
		}
		setCdNmMode(ItmGrp_itm_grp_cd4, ItmGrp_itm_grp_nm4, getItmGrpR().itm_grp_flg4());
	}
	@Override
	public void doItmGrp_itm_grp_flg5_NC(MCEventInfo info) {
		super.doItmGrp_itm_grp_flg5_NC(info);

		if (!getItmGrpR().itm_grp_flg5()) {
			getItmGrpR().itm_grp_cd5(null);
			getItmGrpR().itm_grp_nm5(null);
		}
		setCdNmMode(ItmGrp_itm_grp_cd5, ItmGrp_itm_grp_nm5, getItmGrpR().itm_grp_flg5());
	}
	@Override
	public void doItmGrp_itm_grp_flg6_NC(MCEventInfo info) {
		super.doItmGrp_itm_grp_flg6_NC(info);

		if (!getItmGrpR().itm_grp_flg6()) {
			getItmGrpR().itm_grp_cd6(null);
			getItmGrpR().itm_grp_nm6(null);
		}
		setCdNmMode(ItmGrp_itm_grp_cd6, ItmGrp_itm_grp_nm6, getItmGrpR().itm_grp_flg6());
	}
	@Override
	public void doItmGrp_itm_grp_flg7_NC(MCEventInfo info) {
		super.doItmGrp_itm_grp_flg7_NC(info);

		if (!getItmGrpR().itm_grp_flg7()) {
			getItmGrpR().itm_grp_cd7(null);
			getItmGrpR().itm_grp_nm7(null);
		}
		setCdNmMode(ItmGrp_itm_grp_cd7, ItmGrp_itm_grp_nm7, getItmGrpR().itm_grp_flg7());
	}
	@Override
	public void doItmGrp_itm_grp_flg8_NC(MCEventInfo info) {
		super.doItmGrp_itm_grp_flg8_NC(info);

		if (!getItmGrpR().itm_grp_flg8()) {
			getItmGrpR().itm_grp_cd8(null);
			getItmGrpR().itm_grp_nm8(null);
		}
		setCdNmMode(ItmGrp_itm_grp_cd8, ItmGrp_itm_grp_nm8, getItmGrpR().itm_grp_flg8());
	}
	@Override
	public void doItmGrp_itm_grp_flg9_NC(MCEventInfo info) {
		super.doItmGrp_itm_grp_flg9_NC(info);

		if (!getItmGrpR().itm_grp_flg9()) {
			getItmGrpR().itm_grp_cd9(null);
			getItmGrpR().itm_grp_nm9(null);
		}
		setCdNmMode(ItmGrp_itm_grp_cd9, ItmGrp_itm_grp_nm9, getItmGrpR().itm_grp_flg9());
	}
	@Override
	public void doItmGrp_itm_grp_flg10_NC(MCEventInfo info) {
		super.doItmGrp_itm_grp_flg10_NC(info);

		if (!getItmGrpR().itm_grp_flg10()) {
			getItmGrpR().itm_grp_cd10(null);
			getItmGrpR().itm_grp_nm10(null);
		}
		setCdNmMode(ItmGrp_itm_grp_cd10, ItmGrp_itm_grp_nm10, getItmGrpR().itm_grp_flg10());
	}
	@Override
	public void setMode(java.lang.String status) {
		super.setMode(status);

		setCdNmMode();
	}
	protected void setCdNmMode() {
		setCdNmMode(ItmGrp_itm_grp_cd1, ItmGrp_itm_grp_nm1, getItmGrpR().itm_grp_flg1());
		setCdNmMode(ItmGrp_itm_grp_cd2, ItmGrp_itm_grp_nm2, getItmGrpR().itm_grp_flg2());
		setCdNmMode(ItmGrp_itm_grp_cd3, ItmGrp_itm_grp_nm3, getItmGrpR().itm_grp_flg3());
		setCdNmMode(ItmGrp_itm_grp_cd4, ItmGrp_itm_grp_nm4, getItmGrpR().itm_grp_flg4());
		setCdNmMode(ItmGrp_itm_grp_cd5, ItmGrp_itm_grp_nm5, getItmGrpR().itm_grp_flg5());
		setCdNmMode(ItmGrp_itm_grp_cd6, ItmGrp_itm_grp_nm6, getItmGrpR().itm_grp_flg6());
		setCdNmMode(ItmGrp_itm_grp_cd7, ItmGrp_itm_grp_nm7, getItmGrpR().itm_grp_flg7());
		setCdNmMode(ItmGrp_itm_grp_cd8, ItmGrp_itm_grp_nm8, getItmGrpR().itm_grp_flg8());
		setCdNmMode(ItmGrp_itm_grp_cd9, ItmGrp_itm_grp_nm9, getItmGrpR().itm_grp_flg9());
		setCdNmMode(ItmGrp_itm_grp_cd10, ItmGrp_itm_grp_nm10, getItmGrpR().itm_grp_flg10());
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