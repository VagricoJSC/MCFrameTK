package mcframe.clientMSBE.MSBEP1090;

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
import mcframe.clientMSBE.MSBEP2000.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_ProvArrReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_ProvArrReg_MC extends MSBEP_ProvArrReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_ProvArrReg_MC() {
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
	public MSBEP_ProvArrReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	@Override
	protected void valueInitSub() {
		super.valueInitSub();
		
		setValueEx(Cnd_prov_arrv_req_flg, true);
	}
	
	@Override
	public void doRslt_purc_id_typ_LC(MCEventInfo info) {
		super.doRslt_purc_id_typ_LC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		if(!isNull(r.purc_id_typ())) {
			setValueEx(columnRslt_prov_typ, r.getGUIIndex(), MAC_PROV_TYP.FFR_PROV.value());
		}
		else {
			setValueEx(columnRslt_prov_typ, r.getGUIIndex(), null);
		}
	}
	
	@Override
	protected String getInvisibleKey() {
		return "ARR_ONLY_ITEM";
	}
	
	@Override
	protected void setInvisibleOther() {
		setComponentInvisibleAllStatus(StkLstPanel);
		setComponentInvisibleAllStatus(Tab5Panel);
		setComponentInvisibleAllStatus(Tab6Panel);
		setComponentInvisibleAllStatus(Cnd_ope_PRNT);
		setComponentInvisibleAllStatus(Btn_prnt_stklst);
	}
	
	@Override
	protected boolean isAvailableTrd(String typ) {
		if (MAC_TRD_PTN_TYP.isARR(typ)) {
			return true;
		}
		return false;
	}
	
	@Override
	protected void setAvailablePurcId(MCRow row, MCEventInfo info) {
		row.addBooleanColumn(MAC_PURC_ID_TYP.FFR_RCV.key(), true);
	}
	
	@Override
	protected void setAvailableArrLoc(MCRow row, MCEventInfo info) {
		row.setStringNE("LOC_IS_SRCH_TYP", MAC_LOC_IS_SRCH_TYP.OUTSIDE.value());
	}
	
	@Override
	protected RsltCellConfig crtRsltCellConfig() {
		return new RsltCellConfig();
	}
	protected class RsltCellConfig extends MSBEP_ProvArrReg_MC_A.RsltCellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);
			
			// 直送支給以外
			if(!isDDlvProvr(r)){
				if(isDDlvProvEnableCol(column)){
					return MCMode.READ_ONLY;
				}
				// 同一ロット
				if (column == columnRslt_same_lot_flg) {
					// ロット管理区分が「同一ロット不許可」以外の場合、編集不可
					if (!MAC_LOT_MNG_TYP.isUNIQ(r.lot_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			// 格付
			if (column == columnRslt_gd_cd) {
				if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
					return MCMode.READ_ONLY;
				}
				else if (!MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			// 取引単位、数量、打切、同時計上
			if (column == columnRslt_trd_unit_cd
					|| column == columnRslt_trd_unit_qty
					|| column == columnRslt_abort_flg
					|| column == columnRslt_sync_flg) {
				if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
		
		/**
		 * 「仕入直送支給」の場合のみ入力可能な項目かを判定する.
		 * 
		 * @param column 判定対象カラム名
		 * @return　true / false
		 */
		protected boolean isDDlvProvEnableCol(MCColumnConfig column) {
			return column == columnRslt_crt_lot_flg				// ロット作成FLG
						|| column == columnRslt_lot_no					// ロットNO
						|| column == columnRslt_sublot_no			// サブロットNO
						|| column == columnRslt_same_lot_flg		// 同一ロット
						|| column == columnRslt_ver_no				// 版NO
						|| column == columnRslt_purc_cont_qty	// 仕入有効成分
						|| column == columnRslt_bp_lot_no			// 業者ロットＮＯ
						|| column == columnRslt_bp_dlv_slip_no	// 業者納品書ＮＯ
						|| column == columnRslt_ship_fr_valid_dt;// 出荷元期限
		}
		
		@Override
		protected boolean isSchdROCol(MCColumnConfig column) {
			if (column == columnRslt_arr_loc_cd) {
				return true;
			}
			return super.isSchdROCol(column);
		}
	}
	
	/**
	 * 仕入直送支給かどうかを判定する。
	 * @param r　判定対象
	 * @return 仕入直送支給の場合、true。　以外は、false。 
	 */
	protected boolean isDDlvProvr(RsltR r){
		return MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ()) 
				|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ());
	}
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		getCnd_arr_loc_cd_ListPutter().putBind(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.OUTSIDE.value());
	}

}