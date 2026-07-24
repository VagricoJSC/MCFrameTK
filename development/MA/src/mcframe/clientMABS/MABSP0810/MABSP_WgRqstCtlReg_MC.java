package mcframe.clientMABS.MABSP0810;

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
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP5030.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_WgRqstCtlReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_WgRqstCtlReg_MC extends MABSP_WgRqstCtlReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_WgRqstCtlReg_MC() {
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
	public MABSP_WgRqstCtlReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABSL0810_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0810_Srch01Caller<P extends MABSP_WgRqstCtlReg, B extends MA_MABSL0810_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL0810_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();

			// 検索結果を保持しておく
			// 「check_**_dpt_cd」項目：更新前に画面の値と比較して変更されていたら変更値、それ以外はnullを設定
			bridge.down0().setColumnValue(DtlR.$check_fr_dpt_cd, bridge.down0(), DtlR.$fr_dpt_cd);
		}
	}

	/**
	 * [MA_MABSL0810_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0810_Upd01Caller<P extends MABSP_WgRqstCtlReg, B extends MA_MABSL0810_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL0810_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();

			for (DtlR r : bridge.up0()) {
				// 部門が変更されたときのみ、「check_**_dpt_cd」に設定して、サーバ側で存在チェック
				// 運用日付と部門の期限がずれた場合にエラーとなり更新できなくなるのを防ぐため
				setCheckDpt(r, DtlR.$fr_dpt_cd, DtlR.$check_fr_dpt_cd);
			}
		}

		/**
		 * 検索時の値と比較して変更されていた場合のみ「check_**_dpt_cd」に値を設定します。
		 */
		protected void setCheckDpt(MCRow r, String dptCd, String checkDptCd) {
			if(isSame(r.getString(dptCd), r.getString(checkDptCd))) {
				r.setString(checkDptCd, null);
			}
			else {
				r.setString(checkDptCd, r.getString(dptCd));
			}
		}
	}

	/**
	 * [MA_MABSL0810_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0810_Del01Caller<P extends MABSP_WgRqstCtlReg, B extends MA_MABSL0810_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABSL0810_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL0810_Srch01();
	}
	/**
	 * Panel[DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd(MCEventInfo info) {
		callMA_MABSL0810_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del(MCEventInfo info) {
		callMA_MABSL0810_Del01();
	}

	@Override
	public void doDtl_to_wg_cd_LC(MCEventInfo info) {
		super.doDtl_to_wg_cd_LC(info);
		
		int idx = info.getEventIndex();
		setValueEx(columnDtl_wg_rqst_typ, idx, null);
	}
	
	@Override
	public void doDtl_fr_wg_cd_LC(MCEventInfo info) {
		super.doDtl_fr_wg_cd_LC(info);
		
		int idx = info.getEventIndex();
		setValueEx(columnDtl_fr_dpt_cd, idx, null);
	}
	
	@Override
	public void doDtl_wg_rqst_typ_LC(MCEventInfo info) {
		super.doDtl_wg_rqst_typ_LC(info);
		
		int idx = info.getEventIndex();
		setValueEx(columnDtl_cst_cd, idx, null);
	}

	//--------------------リストロジック表示制御Start-----------------------

	@Override
	public MCList getDtl_wg_rqst_typ(MCRow row,MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		if (!r.lg_flg() && !r.mfg_flg() && !r.purc_flg()){
			return null ;
		}
		addListLogicCnd(row, getWgRqstTyp(info));
		return super.getDtl_wg_rqst_typ(row, info);
	}
	
	/**
	 * 表示するワーキンググループ間依頼種類区分を取得する
	 */
	protected MAC_WG_RQST_TYP[] getWgRqstTyp(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		if ((r.lg_flg() || r.mfg_flg()) && r.purc_flg()) {
			return new MAC_WG_RQST_TYP[] { MAC_WG_RQST_TYP.XFR, MAC_WG_RQST_TYP.PURC, MAC_WG_RQST_TYP.SHIP };
		} else if (r.lg_flg() || r.mfg_flg()) {
			return new MAC_WG_RQST_TYP[] { MAC_WG_RQST_TYP.XFR, MAC_WG_RQST_TYP.SHIP };
		} else if (r.purc_flg()) {
			return new MAC_WG_RQST_TYP[] { MAC_WG_RQST_TYP.PURC };
		}
		return null;
	}

	//--------------------リストロジック表示制御End-----------------------

	// ------------CellConfig------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlConf());
	}

	protected MCCellConfig createDtlConf() {
		return new DtlConf(this);
	}

	protected class DtlConf extends MAUDP_RLBaseCellConfig {

		public DtlConf(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlR row = (DtlR)table.getBaseTable().getRow(index);

			if (isUpdSts()) {
				if (column == columnDtl_fr_dpt_cd) {
					if (isNull(row.fr_wg_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_wg_rqst_typ) {
					if (isNull(row.to_wg_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_cst_cd) {
					if (isNull(row.wg_rqst_typ()) 
					 || MAC_WG_RQST_TYP.isXFR(row.wg_rqst_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

}