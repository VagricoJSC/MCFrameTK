package mcframe.clientMSBE.MSBEP0150;

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
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5070.*;
import mcframe.clientMSUB.MSUBP0020.*;

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

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_AllocPrio"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_AllocPrio_MC extends MSBEP_AllocPrio_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** 検索結果の順番を変更したらtrue */
	protected boolean _isChanged = false;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_AllocPrio_MC() {
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
	public MSBEP_AllocPrio_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL0150_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0150_Srch01Caller<P extends MSBEP_AllocPrio, B extends MS_MSBEL0150_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL0150_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void beforeCall() {
			super.beforeCall();
			
			clearAll();
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			
			MCList<AllocDtlR> allocDtlL= bridge.down0();
			setResult(allocDtlL, 0, allocDtlL.size() - 1, false);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			setRefStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			
			setSrchStatus();
		}
	}

	/**
	 * [MS_MSBEL0150_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0150_Upd01Caller<P extends MSBEP_AllocPrio, B extends MS_MSBEL0150_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL0150_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected boolean isUpBlockStatusNone() {
			
			// 明細チェック
			if (!_isChanged && exceptEmpty(getAllocDtlL()).isStatusNone()) {
				return true;
			}

			return false;
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			setFIX_UStatus();
		}
	}

	/**
	 * [MS_MSBEL0150_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0150_Sprt01Caller<P extends MSBEP_AllocPrio, B extends MS_MSBEL0150_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBEL0150_Sprt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBEL0150_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBBP1210]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1210(MCEventInfo info) {
		
		AllocDtlR r = AllocDtlTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBBP1210(r);
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBBP1210_EX]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1210_EX(MCEventInfo info) {
		
		AllocDtlR r = AllocExDtlTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBBP1210(r);
	}
	
	protected void doBtn_open_MSBBP1210(AllocDtlR r) {
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1210");
		aso.putCnd(crtOpenMSBBP1210CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * 受注登録画面の遷移条件を作成する。
	 * @param aso MAUCP_AppScreenOpener
	 * @return 遷移条件
	 */
	protected mcframe.clientMSBB.MSBBP1210.CndR crtOpenMSBBP1210CndR(MAUCP_AppScreenOpener aso, AllocDtlR r) {
		
		mcframe.clientMSBB.MSBBP1210.MSBBP_SloReg p = 
				(mcframe.clientMSBB.MSBBP1210.MSBBP_SloReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP1210.CndR to = mcframe.clientMSBB.MSBBP1210.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.srch_tgt_no(r.slo_no());

		return to;
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBEP1000]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP1000(MCEventInfo info) {
		
		AllocDtlR r = AllocDtlTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBEP1000(r);
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBEP1000_EX]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP1000_EX(MCEventInfo info) {
		
		AllocDtlR r = AllocExDtlTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBEP1000(r);
	}
	
	/**
	 * 移動・移送予定登録画面の遷移条件を作成する。
	 * @param aso MAUCP_AppScreenOpener
	 * @return 遷移条件
	 */
	protected void doBtn_open_MSBEP1000(AllocDtlR r){
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1000");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBEP1000CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	protected mcframe.clientMSBE.MSBEP1000.CndR crtOpenMSBEP1000CndR(MAUCP_AppScreenOpener aso, AllocDtlR r) {
		mcframe.clientMSBE.MSBEP1000.MSBEP_XfrSchdReg p = (mcframe.clientMSBE.MSBEP1000.MSBEP_XfrSchdReg) aso
				.getPanel();
		mcframe.clientMSBE.MSBEP1000.CndR to = mcframe.clientMSBE.MSBEP1000.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.xfr_schd_no(r.xfr_schd_no());
		
		return to;
	}
	
	/**
	 * Panel[Btn]のボタン[sprt]の押下時の処理
	 */
	@Override
	public void doBtn_sprt(MCEventInfo info) {
		callMS_MSBEL0150_Sprt01();
	}
	
	/**
	 * Panel[Btn]のボタン[move_top]の押下時の処理
	 */
	@Override
	public void doBtn_move_top(MCEventInfo info) {
		
		int[] oldIdxes = AllocDtlTable.getMCSelectedRows();
		if (moveTop(AllocDtlTable)) {
			int[] newIdxes = AllocDtlTable.getMCSelectedRows();
			rowMoved(oldIdxes, newIdxes);
		}
	}
	/**
	 * Panel[Btn]のボタン[move_up]の押下時の処理
	 */
	@Override
	public void doBtn_move_up(MCEventInfo info) {
		
		int[] oldIdxes = AllocDtlTable.getMCSelectedRows();
		if (moveUp(AllocDtlTable)) {
			int[] newIdxes = AllocDtlTable.getMCSelectedRows();
			rowMoved(oldIdxes, newIdxes);
		}
	}
	/**
	 * Panel[Btn]のボタン[move_down]の押下時の処理
	 */
	@Override
	public void doBtn_move_down(MCEventInfo info) {
		
		int[] oldIdxes = AllocDtlTable.getMCSelectedRows();
		if (moveDown(AllocDtlTable)) {
			int[] newIdxes = AllocDtlTable.getMCSelectedRows();
			rowMoved(oldIdxes, newIdxes);
		}
	}
	/**
	 * Panel[Btn]のボタン[move_bottom]の押下時の処理
	 */
	@Override
	public void doBtn_move_bottom(MCEventInfo info) {
		
		int[] oldIdxes = AllocDtlTable.getMCSelectedRows();
		if (moveBottom(AllocDtlTable)) {
			int[] newIdxes = AllocDtlTable.getMCSelectedRows();
			rowMoved(oldIdxes, newIdxes);
		}
	}
	
	protected void rowMoved(int[] idx1, int[] idx2) {
		
		int smaller = getAllocDtlL().size();
		int larger = -1;
		for (int val : idx1) {
			if (val < smaller) {
				smaller = val;
			}
			if (val > larger) {
				larger = val;
			}
		}
		for (int val : idx2) {
			if (val < smaller) {
				smaller = val;
			}
			if (val > larger) {
				larger = val;
			}
		}
		setResult(getAllocDtlL(), smaller, larger, true);
	}
	
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBEL0150_Upd01();
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		
		AllocDtl_base_unit_qty_p_PPanel.setRelateBeans(columnAllocDtl_base_unit_cd, columnAllocDtl_base_unit_dec_place);
		AllocDtl_alloc_avl_qty_p_PPanel.setRelateBeans(columnAllocDtl_base_unit_cd, columnAllocDtl_base_unit_dec_place);
		AllocDtl_alloc_qty_p_PPanel.setRelateBeans(columnAllocDtl_base_unit_cd, columnAllocDtl_base_unit_dec_place);
		AllocDtl_wait_qty_p_PPanel.setRelateBeans(columnAllocDtl_base_unit_cd, columnAllocDtl_base_unit_dec_place);
		AllocDtl_cml_wait_qty_p_PPanel.setRelateBeans(columnAllocDtl_base_unit_cd, columnAllocDtl_base_unit_dec_place);
		AllocDtl_not_alloc_avail_qty_p_PPanel.setRelateBeans(columnAllocDtl_base_unit_cd, columnAllocDtl_base_unit_dec_place);
		AllocDtl_cml_not_alloc_avail_qty_p_PPanel.setRelateBeans(columnAllocDtl_base_unit_cd, columnAllocDtl_base_unit_dec_place);
		AllocExDtl_base_unit_qty_p_PPanel.setRelateBeans(columnAllocExDtl_base_unit_cd, columnAllocExDtl_base_unit_dec_place);
		AllocExDtl_alloc_avl_qty_p_PPanel.setRelateBeans(columnAllocExDtl_base_unit_cd, columnAllocExDtl_base_unit_dec_place);
		AllocExDtl_alloc_qty_p_PPanel.setRelateBeans(columnAllocExDtl_base_unit_cd, columnAllocExDtl_base_unit_dec_place);
		AllocExDtl_wait_qty_p_PPanel.setRelateBeans(columnAllocExDtl_base_unit_cd, columnAllocExDtl_base_unit_dec_place);
		AllocExDtl_cml_wait_qty_p_PPanel.setRelateBeans(columnAllocExDtl_base_unit_cd, columnAllocExDtl_base_unit_dec_place);
		AllocExDtl_not_alloc_avail_qty_p_PPanel.setRelateBeans(columnAllocExDtl_base_unit_cd, columnAllocExDtl_base_unit_dec_place);
		AllocExDtl_cml_not_alloc_avail_qty_p_PPanel.setRelateBeans(columnAllocExDtl_base_unit_cd, columnAllocExDtl_base_unit_dec_place);
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		
		AllocDtlTable.setSortable(false);
	}
	
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);

		if (compo == AllocDtlTable) {
			int index = AllocDtlTable.getMCSelectedRow();
			if (index >= 0) {
				AllocDtlR r = getAllocDtlL().get(index);
				if (!isNull(r.slo_no()) && Btn_open_MSBBP1210.getMode() == MCMode.ENABLE) {
					doBtn_open_MSBBP1210(info);
				}
				else if (!isNull(r.xfr_schd_no()) && Btn_open_MSBEP1000.getMode() == MCMode.ENABLE) {
					doBtn_open_MSBEP1000(info);
				}
			}
		}
		else if (compo == AllocExDtlTable) {
			int index = AllocExDtlTable.getMCSelectedRow();
			if (index >= 0) {
				AllocDtlR r = getAllocExDtlL().get(index);
				if (!isNull(r.slo_no()) && Btn_open_MSBBP1210.getMode() == MCMode.ENABLE) {
					doBtn_open_MSBBP1210(info);
				}
				else if (!isNull(r.xfr_schd_no()) && Btn_open_MSBEP1000.getMode() == MCMode.ENABLE) {
					doBtn_open_MSBEP1000(info);
				}
			}
		}
	}
	
	@Override
	public void doAllocDtl_NC(MCEventInfo info) {
		super.doAllocDtl_NC(info);
		
		setBtnMode();
	}
	
	@Override
	public void doAllocExDtl_NC(MCEventInfo info) {
		super.doAllocExDtl_NC(info);
		
		setBtnModeEx();
	}
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		
		CndPanel.focusFirstComponent();
	}
	
	/**
	 * 画面遷移ボタンのモードを設定する。
	 */
	protected void setBtnModeEx() {
		
		int index = AllocExDtlTable.getMCSelectedRow();
		if (index >= 0) {
			AllocDtlR r = getAllocExDtlL().get(index);
			if (!isNull(r.slo_no())) {
				Btn_open_MSBBP1210_EX.setMode(MCMode.ENABLE);
				Btn_open_MSBEP1000_EX.setMode(MCMode.DISABLE);
			}
			else if (!isNull(r.xfr_schd_no())) {
				Btn_open_MSBBP1210_EX.setMode(MCMode.DISABLE);
				Btn_open_MSBEP1000_EX.setMode(MCMode.ENABLE);
			}
			else {
				Btn_open_MSBBP1210_EX.setMode(MCMode.DISABLE);
				Btn_open_MSBEP1000_EX.setMode(MCMode.DISABLE);
			}
		}
	}
	
	/**
	 * 画面遷移ボタンのモードを設定する。
	 */
	protected void setBtnMode() {
		
		int index = AllocDtlTable.getMCSelectedRow();
		if (index >= 0) {
			AllocDtlR r = getAllocDtlL().get(index);
			if (!isNull(r.slo_no())) {
				Btn_open_MSBBP1210.setMode(MCMode.ENABLE);
				Btn_open_MSBEP1000.setMode(MCMode.DISABLE);
			}
			else if (!isNull(r.xfr_schd_no())) {
				Btn_open_MSBBP1210.setMode(MCMode.DISABLE);
				Btn_open_MSBEP1000.setMode(MCMode.ENABLE);
			}
			else {
				Btn_open_MSBBP1210.setMode(MCMode.DISABLE);
				Btn_open_MSBEP1000.setMode(MCMode.DISABLE);
			}
		}
		else {
			Btn_open_MSBBP1210.setMode(MCMode.DISABLE);
			Btn_open_MSBEP1000.setMode(MCMode.DISABLE);
			Btn_sprt.setMode(MCMode.DISABLE);
		}
	}
	
	/**
	 * 検索後ステータスを設定する。
	 */
	protected void setRefStatus() {
		
		if (Cnd_ope_CHNG.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		AllocDtlTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
		setBtnMode();
	}

	/**
	 * 検索前ステータスを設定する。
	 */
	protected void setSrchStatus() {
		
		if (Cnd_ope_CHNG.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
		CndPanel.focusFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
		setBtnMode();
	}
	
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		else {
			if (!isSame(getStatus(), UPD) || isStatusNone(getAllocDtlL())) {
				return true;
			}
			else {
				return confirmRegDataClear();
			}
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		clearContainers(getAllocDtlL(), getAllocExDtlL());
		setSrchStatus();
	}
	
	/**
	 * 画面をクリアする。
	 */
	protected void clearAll() {
		
		clearContainers(getAllocDtlL(), 
				getAllocExDtlL());
	}
	
	/**
	 * 引当順NOの振りなおし
	 * 保留数量累計の設定
	 * 変更フラグのリセット
	 */
	protected void setResult(MCList<AllocDtlR> ls, int frIdx, int toIdx, boolean chgFlg) {
		
		for (int i = 0; i < ls.size(); i++) {
			
			ls.get(i).alloc_prio(lpad(String.valueOf(i + 1), AllocDtlR.alloc_prio_META, "0"));
			if(chgFlg) {
				ls.get(i).alloc_avl_qty(MCNumber.ZERO);
				ls.get(i).not_alloc_avail_qty(MCNumber.ZERO);
				ls.get(i).cml_not_alloc_avail_qty(MCNumber.ZERO);
				ls.get(i).prms_delay_flg(false);
				ls.get(i).split_flg(false);
				ls.get(i).avl_schd_dt(null);
			}
		}
		// 保留数量累計の設定
		setCmlQty(ls, frIdx, toIdx);
		// 変更フラグのリセット
		_isChanged = chgFlg;
	}
	
	/**
	 * 計算開始行から終了行の間の保留数累計を計算する。（開始行、終了行を含む）
	 * 
	 * @param ls
	 * @param frIdx 計算開始行(０以上であること)
	 * @param toIdx 計算終了行(getRsltL().size()-1以下であること)
	 */
	protected void setCmlQty(MCList<AllocDtlR> ls, int frIdx, int toIdx) {
		
		setCmlValue(ls, AllocDtlR.$wait_qty, AllocDtlR.$cml_wait_qty, frIdx, toIdx);
	}

}