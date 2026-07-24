package mcframe.clientMSBB.MSBBP1030;

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

import mcframe.clientMAUB.MAUBP0060.*;
import mcframe.clientMAUB.MAUBP5360.*;

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
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.clientFSUB.FSUBP0000.IfRowMoveBase;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBBP_WrkReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_WrkReg_MC extends MSBBP_WrkReg_MC_A implements IfOpePanel, IfRowMoveBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_WrkReg_MC() {
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
	public MSBBP_WrkReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBBL1030_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1030_Del01Caller<P extends MSBBP_WrkReg, B extends MS_MSBBL1030_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBBL1030_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	@Override
	public MCCheckBox getRegCanFlg() {
		return Hdr_can_flg;
	}

	/**
	 * [MS_MSBBL1030_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1030_Upd01Caller<P extends MSBBP_WrkReg, B extends MS_MSBBL1030_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBBL1030_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected boolean checkUpListParamEmpty() {
			// 明細なしで案件登録可能とする。
			return true;
		}
	}


	/**
	 * [MS_MSBBL1030_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1030_Srch01Caller<P extends MSBBP_WrkReg, B extends MS_MSBBL1030_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1030_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			if (Cnd_ope_UPD.isSelected()) {
				if (getHdrR().can_flg()) {
					setSRCHStatus();
					dialog(new MCMessage(MSBBP0014));
				}
			}
			if (Cnd_ope_DEL.isSelected()) {
				if (getHdrR().can_flg()) {
					Btn_del.setMode(MCMode.DISABLE);
				}
			}
		}
	}


	/**
	 * [MS_MSBBL1030_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1030_Ins01Caller<P extends MSBBP_WrkReg, B extends MS_MSBBL1030_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBBL1030_Ins01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected boolean checkUpListParamEmpty() {
			// 明細なしで案件登録可能とする。
			return true;
		}
		
		@Override
		protected void show() {
			super.show();
		}
	}


	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBBL1030_Srch01();
	}
	/**
	 * Panel[Btm1]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtm1_radd(MCEventInfo info) {
		insertRow(Dtl1Table);
	}
	/**
	 * Panel[Btm1]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtm1_rdel(MCEventInfo info) {
		deleteRow(Dtl1Table);
	}
	/**
	 * Panel[Btm1]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtm1_rcopy(MCEventInfo info) {
		copyRow(Dtl1Table);
	}
	/**
	 * Panel[Btm2]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtm2_radd(MCEventInfo info) {
		insertRow(Dtl2Table);
	}
	/**
	 * Panel[Btm2]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtm2_rdel(MCEventInfo info) {
		deleteRow(Dtl2Table);
	}
	/**
	 * Panel[Btm2]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtm2_rcopy(MCEventInfo info) {
		copyRow(Dtl2Table);
	}
	/**
	 * Panel[Btm3]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtm3_radd(MCEventInfo info) {
		insertRow(Dtl3Table);
	}
	/**
	 * Panel[Btm3]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtm3_rdel(MCEventInfo info) {
		deleteRow(Dtl3Table);
	}
	/**
	 * Panel[Btm3]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtm3_rcopy(MCEventInfo info) {
		copyRow(Dtl3Table);
	}
	/**
	 * Panel[Btm5]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtm5_radd(MCEventInfo info) {
		insertRow(Dtl5Table);
	}
	/**
	 * Panel[Btm5]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtm5_rdel(MCEventInfo info) {
		deleteRow(Dtl5Table);
	}
	/**
	 * Panel[Btm5]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtm5_rcopy(MCEventInfo info) {
		copyRow(Dtl5Table);
	}
	/**
	 * Panel[Btn]のボタン[open_MSBBP1110]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1110(MCEventInfo info) {
		Dtl1R r = Dtl1Table.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		MCRow bind = setBindMSBBP1110(r);
		openPanel("MS", "MSBBP1110", T1, bind);
	}
	
	/**
	 * 見積登録画面へ遷移パラメータを設定する。
	 * @param r 案件明細
	 * @return 見積登録画面へ遷移パラメータ
	 */
	protected MCRow setBindMSBBP1110(Dtl1R r) {
		
		MCRow bind = MCRow.create();
		
		bind.addStringColumn("wrk_no", getHdrR().wrk_no());
		bind.addStringColumn("cst_cd", r.cst_cd());
		
		if (r.cst_sundry_flg()) {
			
			bind.addStringColumn("cst_nm", r.cst_nm());
			bind.addStringColumn("zip_cd", r.zip_cd());
			bind.addStringColumn("addr1", r.addr1());
			bind.addStringColumn("addr2", r.addr2());
			bind.addStringColumn("addr3", r.addr3());
			bind.addStringColumn("addr4", r.addr4());
			bind.addStringColumn("cst_cntct_dpt", r.cst_cntct_dpt());
			bind.addStringColumn("cst_cntct_psn", r.cst_cntct_psn());
			bind.addStringColumn("tel", r.tel());
			bind.addStringColumn("fax", r.fax());
		}
	
		return bind;
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBBP1210]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1210(MCEventInfo info) {
		Dtl1R r = Dtl1Table.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		MCRow bind = setBindMSBBP1210(r);
		openPanel("MS", "MSBBP1210", T1, bind);
	}
	
	/**
	 * 受注登録画面へ遷移パラメータを設定する。
	 * @param r 案件明細
	 * @return 受注登録画面へ遷移パラメータ
	 */
	protected MCRow setBindMSBBP1210(Dtl1R r) {
		
		MCRow bind = MCRow.create();
		
		bind.addStringColumn("wrk_no", getHdrR().wrk_no());
		bind.addStringColumn("cst_cd", r.cst_cd());
	
		return bind;
	}
	
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBBL1030_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBBL1030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBBL1030_Del01();
	}

	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		getDtl1_cst_cd_ListPutter().putBind(BpCols.$i_dt , getToday()); 
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Hdr_budget_p_PPanel.setRelateBeans(Hdr_cur_cd, Hdr_amt_dec_place);
		Dtl1_cst_addr_p_PPanel.setRelateBeans(columnDtl1_cst_cd, columnDtl1_cst_nm, columnDtl1_cst_sundry_flg);
	}
	
	@Override
	public void layoutAfterOpen() {
		super.layoutAfterOpen();
		
		getSplitPane(MidDtlPanel).setDividerLocation(0.43);
		getSplitPane(HdrDtlPanel).setDividerLocation(0.77);	
	}
	
	@Override
	protected void opePanelFillSpace() {
		Dtl1Table.fillSpace();
		Dtl2Table.fillSpace();
		Dtl3Table.fillSpace();
		Dtl5Table.fillSpace();
	}
	
	@Override
	public MCButtonGroup getOpeButtonGroup() {
		return Cnd_ope_Group;
	}
	
	@Override
	public List<MCContainer> opePanelGetRegBlocks() {
		
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getHdrR());
		ret.add(getDtl1L());
		ret.add(getDtl2L());
		ret.add(getDtl3L());
		ret.add(getDtl4L());
		ret.add(getDtl5L());

		return ret;
	}
	@Override
	public List<MCContainer> opePanelGetCndBlocks() {
		
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getCndR());

		return ret;
	}
	@Override
	public MCTable<?> getRowMoveTable() {
		return null;
	}
	@Override
	public boolean isStatusChange() {
		return false;
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		Dtl1Table.setCellConfig(createDtl1CellConfig());
		Dtl5Table.setCellConfig(createDtl5CellConfig());
	}
	
	protected dtl1CellConfig createDtl1CellConfig() {

		return new dtl1CellConfig();
	}
	
	protected dtl5CellConfig createDtl5CellConfig() {

		return new dtl5CellConfig();
	}
	
	/**
	 * 得意先案件情報のセルコンフィグ
	 *
	 */
	protected class dtl1CellConfig extends MAUDP_CellConfig {

		@Override
		protected MCMode getCustomMode(int index, MCColumnConfig column, MCTable table) {
			Dtl1R r = Dtl1Table.getRow(index);

			if (getStatus() == UPD || getStatus() == INS) {
				if (column == columnDtl1_cst_nm) {
					if (!r.cst_sundry_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getCustomMode(index, column, table);
		}
	}
	
	/**
	 * 案件手配紐付情報のセルコンフィグ
	 *
	 */
	protected class dtl5CellConfig extends MAUDP_CellConfig {

		@Override
		protected MCMode getCustomMode(int index, MCColumnConfig column, MCTable table) {
			Dtl5R r = Dtl5Table.getRow(index);

			if (getStatus() == UPD || getStatus() == INS) {
				if (column == columnDtl5_sno1) {
					if (r.num_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getCustomMode(index, column, table);
		}
	}
	
	@Override
	public void doDtl5_num_flg_NC(MCEventInfo info) {
		super.doDtl5_num_flg_NC(info);
		Dtl5R r = getDtl5L().get(info.getEventIndex());
		int index = info.getEventIndex();
		
		if (r.num_flg()) {
			setValueEx(columnDtl5_sno1, index, null);
		}
	}
	
	@Override
	public void doDtl1_NC(MCEventInfo info) {
		super.doDtl1_NC(info);
		
		if (info.getEventIndex() < 0) {
			return;
		}
	
		setBtnMode(getDtl1L().get(info.getEventIndex()));
	}
	
	/**
	 * ボタンのモードを設定する。
	 */
	protected void setBtnMode(Dtl1R dlt1R) {

		if (getHdrR().can_flg()) {
			Btn_open_MSBBP1110.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBBP1110);
		}
		
		if (getHdrR().can_flg() || dlt1R.cst_sundry_flg()) {
			Btn_open_MSBBP1210.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBBP1210);
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		String beforeOpe = (String)info.getOldValue();
		String afterOpe = (String)info.getNewValue();

		if (isREFOpe(beforeOpe) && isUPDOpe(afterOpe)) {
			if (getHdrR().can_flg()) {
				setSRCHStatus();
				dialog(new MCMessage(MSBBP0014));
			}
		}
	}

	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info,IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		
		// 新規登録後に種別を変更した場合は、必要に応じてNOを検索条件に設定する
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			getCndR().wrk_no(getHdrR().wrk_no());
		}
	}
	
	@Override
	protected void doOpeChngNC(MCEventInfo info,IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		
		if ((isSame(bfOpe, Cnd_ope_REF.getActionCommand()) 
				&& isSame(afOpe, Cnd_ope_INS.getActionCommand()) 
				&& isSame(bfSt, REF))) {
			setRefToInsInit();
		}
	}

	protected void setRefToInsInit() {
		getDtl2L().clear();
		getDtl3L().clear();
		getDtl4L().clear();
		getDtl5L().clear();
	}
	
	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> l = super.getNotInheritCols(type, cont);

		if (isSame(type, NOT_INHERIT_TYPE_REF_UPD)) {

			if (cont == getHdrR()) {
				l.add(HdrR.$wrk_no);
				l.add(HdrR.$wrk_sts_cd);
				l.add(HdrR.$wrk_sts_nm);
				l.add(HdrR.$slo_acc_cd);
				l.add(HdrR.$slo_acc_nm);
				l.add(HdrR.$slo_rsn);
				l.add(HdrR.$fail_rsn);
				l.add(HdrR.$can_flg);
			}
		}
		else if (isSame(type, NOT_INHERIT_TYPE_COPY_ROW)) {

			if (cont == getDtl5L()) {
				l.add(Dtl5R.$qtn_flg);
				l.add(Dtl5R.$slo_flg);
			}

		}
		return l;
	}
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		CndPanel.focusFirstComponent();
	}
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		Dtl1Table.selectLeftmostColumn(0);
		CndPanel.focusFirstComponent();
	}
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		Dtl1Table.selectLeftmostColumn(0);
		HdrPanel.focusFirstComponent();
	}
	@Override
	public void setINSStatus() {
		super.setINSStatus();
		HdrPanel.focusFirstComponent();
	}
	@Override
	public void setDELStatus() {
		super.setDELStatus();
		Dtl1Table.selectLeftmostColumn(0);
		CndPanel.focusFirstComponent();
	}
	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
		ScreenOpePanel.focusFirstComponent();
	}
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		CndPanel.focusFirstComponent();
	}
	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();
		CndPanel.focusFirstComponent();
	}

}