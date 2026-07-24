package mcframe.clientMSBA.MSBAP0040;

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
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5230.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP5020.*;

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
import java.util.Map;
import java.util.HashMap;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBAP_DmndRecStsSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBAP_DmndRecStsSrch_MC extends MSBAP_DmndRecStsSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	
	// dividerの位置を格納する変数
	int saveLoc1 = 0;
	int saveLoc2 = 0;

	// 消込元の需要情報をキャッシュ
	Map<String, MCList<Rslt2R>> _rslt2L = new HashMap<String, MCList<Rslt2R>>();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBAP_DmndRecStsSrch_MC() {
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
	public MSBAP_DmndRecStsSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBAL0040_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0040_Srch01Caller<P extends MSBAP_DmndRecStsSrch, B extends MS_MSBAL0040_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBAL0040_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_dmnd_dt_fr, Cnd_dmnd_dt_to));
		}
		
		@Override
		protected void clear() {
			super.clear();
			clearHiddenList();
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
		
		@Override
		protected void show() {
			super.show();
			
			setHiddenList(bridge.down1());
		}
	}

	/**
	 * [MS_MSBAL0040_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBAL0040_Srch02Caller<P extends MSBAP_DmndRecStsSrch, B extends MS_MSBAL0040_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBAL0040_Srch02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_dmnd_dt_fr, Cnd_dmnd_dt_to));
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
			
			panel.setDividerLocation("Rslt1Panel", 0, false);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if(Cnd_ope_REF1.isSelected()) {
			callMS_MSBAL0040_Srch01();
		}
		else if (Cnd_ope_REF2.isSelected()) {
			callMS_MSBAL0040_Srch02();
		}
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBAL0040_Srch02().execDL();
	}
	/**
	 * Panel[Btn]のボタン[open_DTL]の押下時の処理
	 */
	@Override
	public void doBtn_open_DTL(MCEventInfo info) {
		Rslt2R rslt2R = Rslt2Table.getSelectedMCRow();
		if(isNull(rslt2R)) {
			return;
		}

		// 顧客期間内示の場合
		if(MSC_DMND_TYP.isCST_FRCST(rslt2R.fr_dmnd_typ())) {
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP0010");
			mcframe.clientMSBB.MSBBP0010.MSBBP_CstFrcstReg sloReg = (mcframe.clientMSBB.MSBBP0010.MSBBP_CstFrcstReg) aso.getPanel();
			mcframe.clientMSBB.MSBBP0010.CndR to = mcframe.clientMSBB.MSBBP0010.CndR.create();
			to.cst_frcst_no(rslt2R.fr_cst_frcst_no());
			to.ope(sloReg.Cnd_ope_REF.getActionCommand());
			aso.putCnd(to);
			aso.putSearchAction();
			aso.show();	
		}
		// 受注・仮受注の場合
		else if (MSC_DMND_TYP.isSLO(rslt2R.fr_dmnd_typ())
				|| MSC_DMND_TYP.isPRE_SLO(rslt2R.fr_dmnd_typ())
		) {
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1210");
			mcframe.clientMSBB.MSBBP1210.MSBBP_SloReg sloReg = (mcframe.clientMSBB.MSBBP1210.MSBBP_SloReg) aso.getPanel();
			mcframe.clientMSBB.MSBBP1210.CndR to = mcframe.clientMSBB.MSBBP1210.CndR.create();
			to.srch_tgt_no(rslt2R.fr_slo_no());
			to.latest_flg(true);
			to.ope(sloReg.Cnd_ope_REF.getActionCommand());
			aso.putCnd(to);
			aso.putSearchAction();
			aso.show();	
		}
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		
		Rslt1_input_qty_p_PPanel.setRelateBeans(columnRslt1_base_unit_cd, columnRslt1_base_unit_dec_place);
		Rslt1_dmnd_qty_p_PPanel.setRelateBeans(columnRslt1_base_unit_cd, columnRslt1_base_unit_dec_place);
		Rslt1_rec_qty_p_PPanel.setRelateBeans(columnRslt1_base_unit_cd, columnRslt1_base_unit_dec_place);
		Rslt1_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		Rslt1_dlv_grp_p_PPanel.setRelateBeans(Cnd_dlv_grp_p_PPanel);
		Rslt1_cst_grp_p_PPanel.setRelateBeans(Cnd_cst_grp_p_PPanel);
		Rslt1_sno_wrk_no_p_PPanel.setRelateBeans(columnRslt1_itm_cd, columnRslt1_itm_sub1,
				columnRslt1_itm_sub2, columnRslt1_itm_sub3, columnRslt1_sno1_mng_typ,
				columnRslt1_sno2_mng_typ, columnRslt1_sno3_mng_typ,
				columnRslt1_sno4_mng_typ);
		Rslt2_to_input_qty_p_PPanel.setRelateBeans(columnRslt2_base_unit_cd, columnRslt2_base_unit_dec_place);
		Rslt2_to_dmnd_qty_p_PPanel.setRelateBeans(columnRslt2_base_unit_cd, columnRslt2_base_unit_dec_place);
		Rslt2_to_rec_qty_p_PPanel.setRelateBeans(columnRslt2_base_unit_cd, columnRslt2_base_unit_dec_place);
		Rslt2_fr_input_qty_p_PPanel.setRelateBeans(columnRslt2_base_unit_cd, columnRslt2_base_unit_dec_place);
		Rslt2_fr_dmnd_qty_p_PPanel.setRelateBeans(columnRslt2_base_unit_cd, columnRslt2_base_unit_dec_place);
		Rslt2_fr_rec_qty_p_PPanel.setRelateBeans(columnRslt2_base_unit_cd, columnRslt2_base_unit_dec_place);
		Rslt2_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		Rslt2_to_dlv_grp_p_PPanel.setRelateBeans(Cnd_dlv_grp_p_PPanel);
		Rslt2_to_cst_grp_p_PPanel.setRelateBeans(Cnd_cst_grp_p_PPanel);
		Rslt2_fr_dlv_grp_p_PPanel.setRelateBeans(Cnd_dlv_grp_p_PPanel);
		Rslt2_fr_cst_grp_p_PPanel.setRelateBeans(Cnd_cst_grp_p_PPanel);
		Rslt2_to_sno_wrk_no_p_PPanel.setRelateBeans(columnRslt1_itm_cd, columnRslt1_itm_sub1,
				columnRslt1_itm_sub2, columnRslt1_itm_sub3, columnRslt1_sno1_mng_typ,
				columnRslt1_sno2_mng_typ, columnRslt1_sno3_mng_typ,
				columnRslt1_sno4_mng_typ);
		Rslt2_fr_sno_wrk_no_p_PPanel.setRelateBeans(columnRslt1_itm_cd, columnRslt1_itm_sub1,
				columnRslt1_itm_sub2, columnRslt1_itm_sub3, columnRslt1_sno1_mng_typ,
				columnRslt1_sno2_mng_typ, columnRslt1_sno3_mng_typ,
				columnRslt1_sno4_mng_typ);
	}
	
	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == Rslt2Table) {
			doBtn_open_DTL(info);
		}
	}
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}
	
	@Override
	public void setSRCH_REF1Status() {
		super.setSRCH_REF1Status();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	@Override
	public void setSRCH_REF2Status() {
		super.setSRCH_REF2Status();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}
	
	@Override
	public void setREF1Status() {
		super.setREF1Status();
		Rslt1Table.selectLeftmostColumn(0);
		setBtnMode();
	}

	@Override
	public void setREF2Status() {
		super.setREF2Status();
		Rslt2Table.selectLeftmostColumn(0);
		setBtnMode();
	}

	protected void setBtnMode() {
		Rslt2R r = Rslt2Table.getSelectedMCRow();
		
		if (r == null) {
			Btn_open_DTL.setMode(MCMode.DISABLE);
		}
		else {
			// 受注・仮受注・顧客期間内示の場合
			if(MSC_DMND_TYP.isCST_FRCST(r.fr_dmnd_typ())
					|| MSC_DMND_TYP.isSLO(r.fr_dmnd_typ())
					|| MSC_DMND_TYP.isPRE_SLO(r.fr_dmnd_typ())
			) {
				setDefaultMode(Btn_open_DTL);
			}
			else {
				Btn_open_DTL.setMode(MCMode.DISABLE);
			}
		}
	}

	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_REF1.isSelected()) {
			setSRCH_REF1Status();
			FoldTab.focusActiveFirstComponent();
			Rslt1PanelPanel.setVisible(true);
		}
		else if (Cnd_ope_REF2.isSelected()) {
			setSRCH_REF2Status();
			FoldTab.focusActiveFirstComponent();
			Rslt1PanelPanel.setVisible(false);
		}
		
		// 操作種別変更時や検索前ステータスでは、検索枠を表示する
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_REF1.isSelected()) {
			setREF1Status();
			Rslt1Table.selectLeftmostColumn(0);
		}
		else if (Cnd_ope_REF2.isSelected()) {
			setREF2Status();
			Rslt2Table.selectLeftmostColumn(0);
		}
		// 検索後ステータスでは、検索枠を表示しない
		Ctrl_ctrl_PPanel.expand(false);
	}

	// -----------------------------------------------
	@Override
	public void doRslt1_NC(MCEventInfo info) {
		super.doRslt1_NC(info);

		int idx = info.getEventIndex();
		if (idx >= 0) {
			Rslt1R row = getRslt1L().get(idx);
			showFrDmnd(row);
		}

		// 検索結果を取得した時点でソートされているため、ソートは不要
		Rslt2Table.adjustWidth();

		setBtnMode();
	}
	
	@Override
	public void doRslt2_NC(MCEventInfo info) {
		super.doRslt2_NC(info);
		
		setBtnMode();
	}
	
	/**
	 * 消込先に対する消込元を表示する。
	 * @param row
	 */
	protected void showFrDmnd(Rslt1R row) {
		if (!isNull(row)){
			getRslt2L().setAll(_rslt2L.get(row.dmnd_no()));
			showSub(Rslt2Table);
		}
		else {
			getRslt2L().clear();
		}
	}
	
	protected void showSub(MCTable<?> tbl) {
		if (tbl.getList().size() > 0) {
			tbl.selectLeftmostColumn(0);
		}
	}
	
	/**
	 * キャッシュした結果をクリアする。
	 */
	protected void clearHiddenList() {
		_rslt2L = new HashMap<String, MCList<Rslt2R>>();
	}

	/**
	 * 消込元の検索結果を設定する。
	 * @param frDmndL
	 */
	protected void setHiddenList(MCList<Rslt2R> frDmndL) {
		MCIndexKey idxKey = frDmndL.createIndex(Rslt2R.$to_dmnd_no);
		for(Rslt2R r : frDmndL.groupBy(Rslt2R.$to_dmnd_no)) {
			MCList<Rslt2R> val = frDmndL.subList(idxKey, r.to_dmnd_no());
			_rslt2L.put(r.to_dmnd_no(), val);
		}
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getRslt1L(), getRslt2L());
		setSrchStatus();
		
		if(Cnd_ope_REF2.isSelected()) {
			saveLoc1 = this.getDividerLocation("Rslt1Panel");
			saveLoc2 = this.getDividerLocation("Rslt2Panel");
			this.setDividerLocation("Rslt1Panel", 0, false);
		}
		else if(Cnd_ope_REF1.isSelected()) {
			this.setDividerLocation("Rslt1Panel", saveLoc1, false);
		}
	}
	
	/**
	 * スプリットペインの高さを調整
	 */
	public void setDividerLocation(String panelID, int n, boolean max) {
		for (MCSplitPane sp : MCBeansUtil.getAllComponents(MCSplitPane.class, this)) {
			Component up = sp.getTopComponent();
			Component bottom = sp.getBottomComponent();
			if (up instanceof MCPanel) {
				Component up1 = ((MCPanel) up).getComponents()[0];
				String str1 = up1.getName();
				if (str1.equals(panelID)) {
					if(max) {
						sp.setDividerLocation(sp.getMaximumDividerLocation());
					}
					else {
						sp.setDividerLocation(n);
					}
					sp.validate();
					break;
				}
			}
			if (bottom instanceof MCPanel) {
				Component bottom1 = ((MCPanel) bottom).getComponents()[0];
				String str1 = bottom1.getName();
				if (str1.equals(panelID)) {
					if(max) {
						sp.setDividerLocation(sp.getMaximumDividerLocation());
					}
					else {
						sp.setDividerLocation(n);
					}
					sp.validate();
					break;
				}
			}
		}
	}
	
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		linkBeansToISPanelCustom(Cnd_cst_cd, true);
		linkBeansToISPanelCustom(Cnd_dlv_cd, true);
	}

}