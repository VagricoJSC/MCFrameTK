package mcframe.clientMABS.MABSP0850;

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
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.clientCore.beans.list.MCLinkBeans;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABSP_MpsItmReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABSP_MpsItmReg_MC extends MABSP_MpsItmReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_MpsItmReg_MC() {
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
	public MABSP_MpsItmReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[RPnl]のボタン[srch_cmn]の押下時の処理
	 */
	@Override
	public void doRPnl_srch_cmn(MCEventInfo info) {
		// 何もしない（権限チェック用）
	}
	/**
	 * Panel[RPnl]のボタン[srch_wg]の押下時の処理
	 */
	@Override
	public void doRPnl_srch_wg(MCEventInfo info) {
		// 何もしない（権限チェック用）
	}
	/**
	 * [MA_MABSL0850_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0850_Srch01Caller<P extends MABSP_MpsItmReg, B extends MA_MABSL0850_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABSL0850_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkAtLeastOne(Cnd_cmn_flg, Cnd_wg_flg));
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	/**
	 * [MA_MABSL0850_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0850_Upd01Caller<P extends MABSP_MpsItmReg, B extends MA_MABSL0850_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABSL0850_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABSL0850_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0850_Del01Caller<P extends MABSP_MpsItmReg, B extends MA_MABSL0850_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABSL0850_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABSL0850_Srch01();
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
		callMA_MABSL0850_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del(MCEventInfo info) {
		callMA_MABSL0850_Del01();
	}



	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		initRegTgt();
	}
	protected void initRegTgt() {
		if (RPnl_srch_wg.authorize()) {
			setValueEx(Cnd_cmn_flg, false);
			setValueEx(Cnd_wg_flg, true);
		}
		else if (RPnl_srch_cmn.authorize()) {
			setValueEx(Cnd_cmn_flg, true);
			setValueEx(Cnd_wg_flg, false);
		}
		initRegTgtByDefWgCd(Cnd_cmn_flg, Cnd_wg_flg);
	}

	@Override
	protected void setStatusByOpe() {
		super.setStatusByOpe();
		setRegTgtMode();
		setModeByRegTgt();
	}

	@Override
	public void setStatus(String status) {
		super.setStatus(status);
		setRegTgtMode();
	}

	protected void setRegTgtMode() {
		if (!RPnl_srch_cmn.authorize()) {
			Cnd_cmn_flg.setMode(MCMode.READ_ONLY);
		}
		if (!RPnl_srch_wg.authorize()) {
			Cnd_wg_flg.setMode(MCMode.READ_ONLY);
		}
		setRegTgtModeByDefWgCd(Cnd_cmn_flg, Cnd_wg_flg);
	}

	@Override
	protected void doCndOpeNC(MCEventInfo info) {
		super.doCndOpeNC(info);
		setRegTgtValue(info);
		setModeByRegTgt();
	}

	protected void setRegTgtValue(MCEventInfo info) {
		if (info == null) {
			return;
		}
		boolean ref = MCCollectionUtil.contains(getStatus(), REF);
		if (info.getComponent() == Cnd_ope_Group) {
			if (!ref && getCndR().cmn_flg() && getCndR().wg_flg()) {
				initRegTgt();
			}
		}
		else if (info.getComponent() == Cnd_cmn_flg) {
			if (!ref && isSame(info.getNewValue(), Boolean.TRUE)) {
				getCndR().wg_flg(false);
			}
		}
		else if (info.getComponent() == Cnd_wg_flg) {
			if (!ref && isSame(info.getNewValue(), Boolean.TRUE)) {
				getCndR().cmn_flg(false);
			}
		}
	}

	protected void setModeByRegTgt() {
		boolean ref = MCCollectionUtil.contains(getStatus(), REF);
		if (getCndR().wg_flg()) {
			setDefaultMode(Cnd_wg_cd);
			setDefaultMode(Cnd_wg_nm);
			if (!ref) {
				setDefaultMode(columnDtl_wg_cd);
				setDefaultMode(columnDtl_wg_nm);
			}
		}
		else {
			setValueEx(Cnd_wg_cd, null);
			Cnd_wg_cd.setMode(MCMode.READ_ONLY);
			Cnd_wg_nm.setMode(MCMode.READ_ONLY);
			if (!ref) {
				columnDtl_wg_cd.setMode(MCMode.INVISIBLE);
				columnDtl_wg_nm.setMode(MCMode.INVISIBLE);
			}
		}
	}

	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
		setModeByRegTgt();
	}

	@Override
	public void doCnd_cmn_flg_NC(MCEventInfo info) {
		super.doCnd_cmn_flg_NC(info);
		super.clearAll();
		setRegTgtValue(info);
		setModeByRegTgt();
		fillSpace();
	}

	@Override
	public void doCnd_wg_flg_NC(MCEventInfo info) {
		super.doCnd_wg_flg_NC(info);
		super.clearAll();
		setRegTgtValue(info);
		setModeByRegTgt();
		fillSpace();
	}
	
	//セルコンフィグ
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createMpsItmTableCellConfig());
	}
	
	/**
	 * セルコンフィグの取得
	 * 
	 * @return 一覧のセルコンフィグ
	 */
	protected MpsItmTableCellConfig createMpsItmTableCellConfig() {

		return new MpsItmTableCellConfig(this);
	}
	
	/**
	 * セルコンフィグクラス
	 */
	protected class MpsItmTableCellConfig extends MAUDP_RLBaseCellConfig {

		public MpsItmTableCellConfig(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (getStatus() == UPD) {
				DtlR r = (DtlR)table.getBaseTable().getRow(index);
				
				if (column == columnDtl_mfg_loc_cd) {
					if (isNullOrNullVal(r.strg_wg_cd())
					 || !isNullOrNullVal(r.sppl_cd())
					 || !isNullOrNullVal(r.rqst_loc_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sppl_cd) {
					if (!isNullOrNullVal(r.mfg_loc_cd())
					 || !isNullOrNullVal(r.rqst_loc_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_maker_cd) {
					if (isNullOrNullVal(r.sppl_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_rqst_loc_cd) {
					if (!isNullOrNullVal(r.mfg_loc_cd())
					 || !isNullOrNullVal(r.sppl_cd())) {
						return MCMode.READ_ONLY;
					}
				}

			}
			return super.getPriorMode(index, column, table);
		}
	}
	@Override
	public void doDtl_wg_cd_LC(MCEventInfo info) {
		super.doDtl_wg_cd_LC(info);
		
		int idx = info.getEventIndex();

		setValueEx(columnDtl_strg_loc_cd, idx, null) ;
	}
	
	@Override
	public void doDtl_strg_wg_cd_LC(MCEventInfo info) {
		super.doDtl_strg_wg_cd_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!isNull(r.mfg_loc_cd())) {
			setValueEx(columnDtl_mfg_loc_cd, idx, null) ;
		}
	}
	
	
	@Override
	public void doDtl_sppl_cd_LC(MCEventInfo info) {
		super.doDtl_sppl_cd_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (isNull(r.sppl_cd())){
			setValueEx(columnDtl_maker_cd, idx, null) ;
		}
	}
	

	//-------------------- 入力補助引数編集  --------------------//
	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		MCRow row = super.getBindRowForISCustom(bind, beans, eventIndex);
		if (beans == columnDtl_strg_loc_cd) {
			DtlR r = getDtlL().get(eventIndex);
			if (isNullOrNullVal(r.wg_cd())) {
				row.setStringNE(LocCols.$i_wg_cd, null);
			}
		}
		return row;
	}

}