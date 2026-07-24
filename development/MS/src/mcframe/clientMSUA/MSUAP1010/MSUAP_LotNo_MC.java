package mcframe.clientMSUA.MSUAP1010;

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

import mcframe.clientFXBA.FXBAP0130.*;
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP5250.*;

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
import static mcframe.commonMSUA.MSUAC0070.MSUAC_List.LotNoCols;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSUAP_LotNo"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUAP_LotNo_MC extends MSUAP_LotNo_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUAP_LotNo_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSUAP_LotNo_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callListSrch();
	}
	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callListSrch();
	}

	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		for (RsltR row : RsltTable.getViewRows()) {
			setValueEx(columnRslt_check, row.getGUIIndex(), true);
		}
	}

	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		for (RsltR row : RsltTable.getViewRows()) {
			setValueEx(columnRslt_check, row.getGUIIndex(), false);
		}
	}

	/**
	 * Panel[Btn]のボタン[accept]の押下時の処理
	 */
	@Override
	public void doBtn_accept(MCEventInfo info) {
		doAccept();
	}

	@Override
	protected String[] getInitValueCols() {
		return new String[] {
				LotNoCols.$i_itm_cd, LotNoCols.$i_itm_sub1, LotNoCols.$i_itm_sub2, LotNoCols.$i_itm_sub3, LotNoCols.$i_itm_nm,
				LotNoCols.$i_lot_no, LotNoCols.$i_ver_no, LotNoCols.$i_vld_dt_fr, LotNoCols.$i_vld_dt_to,
				LotNoCols.$i_lmt_dt_fr, LotNoCols.$i_lmt_dt_to, LotNoCols.$i_first_gr_dt_fr, LotNoCols.$i_first_gr_dt_to,
				LotNoCols.$i_mfg_aprv_sts_typ, LotNoCols.$i_stk_insp_typ, LotNoCols.$i_quality_typ, LotNoCols.$i_insp_aprv_sts_typ,
				LotNoCols.$i_plnt_aprv_sts_typ, LotNoCols.$i_mrkt_judg_sts_typ, LotNoCols.$i_lot_rmrks, LotNoCols.$i_itm_ro_flg, LotNoCols.$i_srch_no_stk_and_io_flg
		};
	}

	@Override
	public void setCondition(MCRow row, String mode) {
		super.setCondition(row, mode);

		if (!isNull(row)) {
			getCndR().lot_no(row.getStringNE($INPUT_VAL));
		}
		setLotNoMode();
	}

	@Override
	protected void setInitValue() {
		try {
			super.setInitValue();
		}
		catch (MCException e) {
			// 検索条件に設定された任意の値が設定された場合でもエラーにならないようにする
			// ただし、赤×は出る
			// FCBAC0050以外の例外はスローする
			if (!isSame(e.getID(), "FXBAP0059")) {
				throw e;
			}
		}
	}

	@Override
	protected void setInitMode() {
		super.setInitMode();
		setLotNoMode();
	}
	
	@Override
	public void valueInit() {
		super.valueInit();
		setLotNoMode();
	}

	/**
	 * 呼び出し元の項目の入力制御に応じてフィールドのモードを制御する
	 */
	protected void setLotNoMode() {
		if (getCndR().getBooleanNE(LotNoCols.$i_itm_ro_flg) || Cnd_itm_p_PPanel.isItmFixLight()) {
			Cnd_itm_p_PPanel.setREAD_ONLYStatus();
		}
		else {
			Cnd_itm_p_PPanel.setREQUIREDStatus();
		}
	}

}