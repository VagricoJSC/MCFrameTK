package mcframe.clientMSUB.MSUBP0010;

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
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientCore.beans.list.MCListType;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSUBP_WrkNo_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUBP_WrkNo_H_MC extends MSUBP_WrkNo_H_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUBP_WrkNo_H_MC() {
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
	protected MSUBP_WrkNo_H_MC(mcframe.clientMSUB.MSUBP0010.WrkNoR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_WrkNo START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_WrkNo END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	@Override
	protected void partsInit() {
		super.partsInit();

		partsInitSub();
	}

	protected void partsInitSub() {
		int sno_typ = getSnoTyp(this);
		if (sno_typ == 0) {
			setComponentInvisibleAllStatus(WrkNo_wrk_no, WrkNo_wrk_nm);
		}
	}

	@Override
	public void setENABLE_FREEStatus() {
		super.setENABLE_FREEStatus();

		setLstTyp();
	}

	@Override
	public void setENABLE_SRCHStatus() {
		super.setENABLE_SRCHStatus();

		setLstTyp();
	}

	@Override
	public void setENABLEStatus() {
		super.setENABLEStatus();

		setLstTyp();
	}

	/**
	 * 案件ＮＯのモードを設定する。
	 */
	protected void setLstTyp() {
		if (isSame(getStatus(), ENABLE_SRCH)) {
			WrkNo_wrk_no.setListType(MCListType.FREE);
			setPluralValueEnable(WrkNo_wrk_no, true);
		}
		else if (isSame(getStatus(), ENABLE)) {
			WrkNo_wrk_no.setListType(MCListType.STRICT);
			setPluralValueEnable(WrkNo_wrk_no, false);
		}
		else if (isSame(getStatus(), ENABLE_FREE)) {
			WrkNo_wrk_no.setListType(MCListType.FREE);
			setPluralValueEnable(WrkNo_wrk_no, false);
		}
	}

}