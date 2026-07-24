package mcframe.clientMGBF.MGBFP0240;

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
import mcframe.clientMGUB.MGUBP0010.*;

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
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.Set;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientMAUD.MAUDP0080.IfViewScale;
import mcframe.commonCore.meta.MCMeta;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_RptSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_RptSrch_MC extends MGBFP_RptSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	// 追加した動的カラムの保持
	protected List<MCColumnConfig> _ccList = new ArrayList<>();
	protected List<MCColumnConfig> _ccAllList = new ArrayList<>();

	/**
	 * 検索時の検索条件
	 */
	protected CndR _cndR;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_RptSrch_MC() {
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
	public MGBFP_RptSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBFL0240_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0240_Srch01Caller<P extends MGBFP_RptSrch, B extends MG_MGBFL0240_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0240_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			setREFStatus();
		}

		@Override
		protected void moveFocusNoDown() {
			super.moveFocusNoDown();
			setSRCHStatus();
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			_ccList.clear();
			_cndR = getCndR().clone();
		}

		@Override
		protected void show() {
			// 動的カラムの追加
			for (int i = 0; i < bridge.down1().size(); i++) {
				KeyR r = bridge.down1().get(i);
				String nm = "col_" + i;
				// ***** row Column *****
				bridge.down0().addNumberColumn(nm);

				if (_ccAllList.size() > i) {
					MCColumnConfig c = _ccAllList.get(i);
					c.setLength(columnDispDtl_ttl.getLength());
					c.setHeaderName(nvl(r.nm(), r.cd()));
					c.putMode(MGBFP_RptSrch_MC.this, REF, MCMode.READ_ONLY);
					_ccList.add(c);
				}
				else {
					getDispDtlL().addNumberColumn(nm);

					// ***** table Column *****
					MCColumnType clmTyp = MCColumnType.NUMBER;
					MCMeta metaClm = MCMeta.createNumberMeta(nm, nm, 21, 8, true);
					MCColumnConfig c = beansFactory
							.createTableColumn("DispDtl." + nm, clmTyp);
					c.setLength(columnDispDtl_ttl.getLength());
					c.setHeaderName(nvl(r.nm(), r.cd()));
					c.setMeta(metaClm);
					c.addAllListener(MGBFP_RptSrch_MC.this);
					c.setListListener(MGBFP_RptSrch_MC.this);
					c.putMode(MGBFP_RptSrch_MC.this, REF, MCMode.READ_ONLY);
					DispDtlTable.addColumnConfig(c);
					_ccAllList.add(c);
					_ccList.add(_ccAllList.get(i));
				}
			}
			for (int i = bridge.down1().size(); i < _ccAllList.size(); i++) {
				MCColumnConfig c = _ccAllList.get(i);
				c.putMode(MGBFP_RptSrch_MC.this, REF, MCMode.INVISIBLE);
				
				String nm = "col_" + i;
				bridge.down0().addNumberColumn(nm);
			}
			DispDtlTable.updateResource();
			DispDtlTable.initialized();
			DispDtlTable.setSortable(false); // ソート不可

			for (DispDtlR r : bridge.down0()) {
				r.rpt_row_view(nvl(r.rpt_pre_word(), "") + nvl(r.rpt_row_nm(), ""));

				// 数値項目のセット
				String[] x = MCStringUtil.arrayValueSplit(r.col_all());
				for (int i = 0; i < x.length; i++) {
					if (!isNull(x[i])) {
						r.setNumber("col_" + i, MCNumber.valueOf(x[i]));
					}
				}
			}
			super.show();
			// コンポーネントを動的に追加しているため、呼び出す必要がある
			DispDtlTable.validate();
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBFL0240_Srch01();
	}

	// セッティング ////////////////////////////////////////////////////////////
	/**
	 * ソートの設定
	 */
	@Override
	public void setSortColumn() {
		DispDtlTable.addSortColumn(columnDispDtl_rpt_seq);
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		DispDtlTable.setSortable(false); // ソート不可
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setCndMode();
		CndPanel.focusFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setCndMode();
		DispDtlTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}

	protected void setCndMode() {
		setRptPtnMode();
		setRptKeyMode();
		setWGMode();
	}
	
	protected void setRptPtnMode() {
		if (isNull(getCndR().calc_grp_cd())) {
			Cnd_rpt_ptn_cd.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_rpt_ptn_cd);
		}
	}
	
	protected void setRptKeyMode() {
		if (isNull(getCndR().rpt_ptn_cd())) {
			Cnd_rpt_key_cd.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_rpt_key_cd);
		}
	}
	
	public void setWGMode() {
		if (isNull(getCndR().rpt_key_typ())
				|| MAC_RPT_KEY_TYP.isWG(getCndR().rpt_key_typ())) {
			Cnd_wg_cd.setMode(MCMode.ENABLE);
		}
		else {
			setDefaultMode(Cnd_wg_cd);
		}
	}

	// イベント ////////////////////////////////////////////////////////////////
	
	@Override
	public void doCnd_calc_grp_cd_LC(MCEventInfo info) {
		super.doCnd_calc_grp_cd_LC(info);
		setValueEx(Cnd_rpt_ptn_cd, null);
		setCndMode();
	}

	@Override
	public void doCnd_rpt_ptn_cd_LC(MCEventInfo info) {
		super.doCnd_rpt_ptn_cd_LC(info);
		setValueEx(Cnd_rpt_key_cd, null);
		setCndMode();
	}

	@Override
	public void doCnd_rpt_key_typ_LC(MCEventInfo info) {
		super.doCnd_rpt_key_typ_LC(info);
		setCndMode();
	}

	@Override
	public void doDCEvent(MCDCBeans dc, MCEventInfo info) {
		super.doDCEvent(dc, info);
		if (dc == DispDtlTable) doDispDtl_DC(info);
	}

	protected void doDispDtl_DC(MCEventInfo info) {

		DispDtlR row = DispDtlTable.getSelectedMCRow();
		if (row != null) {
			if (MAC_RPT_TGT_TYP.isST_STK(row.rpt_tgt_typ())
					|| MAC_RPT_TGT_TYP.isST_WIP(row.rpt_tgt_typ())
					|| MAC_RPT_TGT_TYP.isEND_STK(row.rpt_tgt_typ())
					|| MAC_RPT_TGT_TYP.isEND_WIP(row.rpt_tgt_typ())
					|| MAC_RPT_TGT_TYP.isST_STKWIP(row.rpt_tgt_typ())
					|| MAC_RPT_TGT_TYP.isEND_STKWIP(row.rpt_tgt_typ())
					|| MAC_RPT_TGT_TYP.isADJ(row.rpt_tgt_typ())) {
				openMGBFP0100(info, row);
			}
			else if (MAC_RPT_TGT_TYP.isPURC(row.rpt_tgt_typ())
					|| MAC_RPT_TGT_TYP.isDIFF_IO_PRI(row.rpt_tgt_typ())
					|| MAC_RPT_TGT_TYP.isPURC_AMT(row.rpt_tgt_typ())) {
				openMGBFP0040(info, row);
			}
			else if (MAC_RPT_TGT_TYP.isCOMP(row.rpt_tgt_typ())) {
				openMGBFP0020(info, row);
			}
			else if (MAC_RPT_TGT_TYP.isINST(row.rpt_tgt_typ())) {
				openMGBFP0010(info, row);
			}
			else if (MAC_RPT_TGT_TYP.isINPT(row.rpt_tgt_typ())
					|| MAC_RPT_TGT_TYP.isIN_ONR_DIFF(row.rpt_tgt_typ())) {
				openMGBFP0090(info, row);
			}
			else if (MAC_RPT_TGT_TYP.isIO(row.rpt_tgt_typ())
					|| MAC_RPT_TGT_TYP.isIO_AMT(row.rpt_tgt_typ())) {
				openMGBFP0060(info, row);
			}
			else if (MAC_RPT_TGT_TYP.isSLS(row.rpt_tgt_typ())
					|| MAC_RPT_TGT_TYP.isSLS_AMT(row.rpt_tgt_typ())) {
				openMGBFP0050(info, row);
			}
			else if (MAC_RPT_TGT_TYP.isOUTSRC_AMT(row.rpt_tgt_typ())
					|| MAC_RPT_TGT_TYP.isDIFF_OUTSRC(row.rpt_tgt_typ())
					|| MAC_RPT_TGT_TYP.isOUTSRC_PAY_AMT(row.rpt_tgt_typ())) {
				openMGBFP0030(info, row);
			}
			else if (MAC_RPT_TGT_TYP.isST_DIFF(row.rpt_tgt_typ())) {
				openMGBBP0230(info, row);
			}
			else if (MAC_RPT_TGT_TYP.isALC(row.rpt_tgt_typ())) {
				openMGBFP0120(info, row);
			}
			else if (MAC_RPT_TGT_TYP.isSTK_LOSS(row.rpt_tgt_typ())) {
				openMGBFP0310(info, row);
			}
			else if (MAC_RPT_TGT_TYP.isGP_ALC(row.rpt_tgt_typ())) {
				openMGBFP0150(info, row);
			}
			else if (MAC_RPT_TGT_TYP.isDIFF_WK(row.rpt_tgt_typ())) {
				openMGBFP0080(info, row);
			}
			else if (MAC_RPT_TGT_TYP.isDIFF_QTY(row.rpt_tgt_typ())
					|| MAC_RPT_TGT_TYP.isDIFF_UP(row.rpt_tgt_typ())
					|| MAC_RPT_TGT_TYP.isDIFF_SS(row.rpt_tgt_typ())
					|| MAC_RPT_TGT_TYP.isDIFF_QTY_CHD(row.rpt_tgt_typ())
					|| MAC_RPT_TGT_TYP.isDIFF_UP_CHD(row.rpt_tgt_typ())
					|| MAC_RPT_TGT_TYP.isDIFF_SS_CHD(row.rpt_tgt_typ())) {
				openMGBFP0270(info, row);
			}
			else if (MAC_RPT_TGT_TYP.isDIFF_A(row.rpt_tgt_typ())
					|| MAC_RPT_TGT_TYP.isDIFF_B(row.rpt_tgt_typ())
					|| MAC_RPT_TGT_TYP.isDIFF_C(row.rpt_tgt_typ())
					|| MAC_RPT_TGT_TYP.isDIFF_D(row.rpt_tgt_typ())
					|| MAC_RPT_TGT_TYP.isDIFF_E(row.rpt_tgt_typ())
					|| MAC_RPT_TGT_TYP.isDIFF_RT(row.rpt_tgt_typ())
					|| MAC_RPT_TGT_TYP.isDIFF_STD(row.rpt_tgt_typ())
					|| MAC_RPT_TGT_TYP.isDIFF_INST(row.rpt_tgt_typ())) {
				openMGBFP0130(info, row);
			}
		}
	}
	
	/**
	 * 在庫仕掛原価一覧照会を開く
	 */
	protected void openMGBFP0100(MCEventInfo info, DispDtlR row) {
		mcframe.clientMGBF.MGBFP0100.CndR cnd = mcframe.clientMGBF.MGBFP0100.CndR.create();
		if (MAC_RPT_TGT_TYP.isST_STK(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isST_STKWIP(row.rpt_tgt_typ())) {
			cnd.st_stk_flg(true);
		}
		if (MAC_RPT_TGT_TYP.isST_WIP(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isST_STKWIP(row.rpt_tgt_typ())) {
			cnd.st_wip_flg(true);
		}
		if (MAC_RPT_TGT_TYP.isEND_STK(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isEND_STKWIP(row.rpt_tgt_typ())) {
			cnd.end_stk_flg(true);
		}
		if (MAC_RPT_TGT_TYP.isEND_WIP(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isEND_STKWIP(row.rpt_tgt_typ())) {
			cnd.end_wip_flg(true);
		}
		if (MAC_RPT_TGT_TYP.isADJ(row.rpt_tgt_typ())) {
			cnd.adj_flg(true);
		}
		if (MAC_RPT_TGT_TYP.isEND_STK(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isEND_WIP(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isEND_STKWIP(row.rpt_tgt_typ())) {
			cnd.ym(_cndR.ym());
		}
		
		List<String> forceColumn = new ArrayList<>();
		forceColumn.add(mcframe.clientMGBF.MGBFP0100.CndR.$st_stk_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0100.CndR.$st_wip_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0100.CndR.$end_stk_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0100.CndR.$end_wip_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0100.CndR.$adj_flg);
		openScreen("MG", "MGBFP0100", cnd, forceColumn, info);
	}
	
	/**
	 * 購買原価一覧照会を開く
	 */
	protected void openMGBFP0040(MCEventInfo info, DispDtlR row) {
		mcframe.clientMGBF.MGBFP0040.CndR cnd = mcframe.clientMGBF.MGBFP0040.CndR.create();
		openScreen("MG", "MGBFP0040", cnd, null, info);
	}
	
	/**
	 * 製造原価一覧照会を開く
	 */
	protected void openMGBFP0010(MCEventInfo info, DispDtlR row) {
		mcframe.clientMGBF.MGBFP0010.CndR cnd = mcframe.clientMGBF.MGBFP0010.CndR.create();
		openScreen("MG", "MGBFP0010", cnd, null, info);
	}
	
	/**
	 * 投入原価一覧照会を開く
	 */
	protected void openMGBFP0090(MCEventInfo info, DispDtlR row) {
		mcframe.clientMGBF.MGBFP0090.CndR cnd = mcframe.clientMGBF.MGBFP0090.CndR.create();
		openScreen("MG", "MGBFP0090", cnd, null, info);
	}
	
	/**
	 * 入出庫原価一覧照会
	 */
	protected void openMGBFP0060(MCEventInfo info, DispDtlR row) {
		mcframe.clientMGBF.MGBFP0060.CndR cnd = mcframe.clientMGBF.MGBFP0060.CndR.create();
		if (MAC_RPT_TGT_TYP.isIO_AMT(row.rpt_tgt_typ())) {
			cnd.disp_amt(true);
		}
		openScreen("MG", "MGBFP0060", cnd, null, info);
	}
	
	/**
	 * 売上原価一覧照会を開く
	 */
	protected void openMGBFP0050(MCEventInfo info, DispDtlR row) {
		mcframe.clientMGBF.MGBFP0050.CndR cnd = mcframe.clientMGBF.MGBFP0050.CndR.create();
		openScreen("MG", "MGBFP0050", cnd, null, info);
	}
	
	/**
	 * 外注原価一覧照会を開く
	 */
	protected void openMGBFP0030(MCEventInfo info, DispDtlR row) {
		mcframe.clientMGBF.MGBFP0030.CndR cnd = mcframe.clientMGBF.MGBFP0030.CndR.create();
		openScreen("MG", "MGBFP0030", cnd, null, info);
	}
	
	/**
	 * 完成原価一覧照会を開く
	 */
	protected void openMGBFP0020(MCEventInfo info, DispDtlR row) {
		mcframe.clientMGBF.MGBFP0020.CndR cnd = mcframe.clientMGBF.MGBFP0020.CndR.create();
		openScreen("MG", "MGBFP0020", cnd, null, info);
	}
	
	/**
	 * 月初在庫改定差異一覧照会を開く
	 */
	protected void openMGBBP0230(MCEventInfo info, DispDtlR row) {
		mcframe.clientMGBB.MGBBP0230.CndR cnd = mcframe.clientMGBB.MGBBP0230.CndR.create();
		cnd.ym_fr(_cndR.st_ym());
		cnd.ym_to(_cndR.st_ym());
		openScreen("MG", "MGBBP0230", cnd, null, info);
	}
	
	/**
	 * 配賦額一覧照会を開く
	 */
	protected void openMGBFP0120(MCEventInfo info, DispDtlR row) {
		mcframe.clientMGBF.MGBFP0120.CndR cnd = mcframe.clientMGBF.MGBFP0120.CndR.create();
		openScreen("MG", "MGBFP0120", cnd, null, info);
	}
	
	/**
	 * 在庫評価損確認を開く
	 */
	protected void openMGBFP0310(MCEventInfo info, DispDtlR row) {
		mcframe.clientMGBF.MGBFP0310.CndR cnd = mcframe.clientMGBF.MGBFP0310.CndR.create();
		openScreen("MG", "MGBFP0310", cnd, null, info);
	}
	
	/**
	 * 受払原価一覧照会を開く
	 */
	protected void openMGBFP0150(MCEventInfo info, DispDtlR row) {
		mcframe.clientMGBF.MGBFP0150.CndR cnd = mcframe.clientMGBF.MGBFP0150.CndR.create();
		cnd.gp_alc_flg(true);
		List<String> forceColumn = new ArrayList<>();
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$st_stk_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$st_wip_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$purc_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$comp_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$othr_in_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$inpt_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$othr_out_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$free_prov_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$paid_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$sls_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$end_stk_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$end_wip_flg);
		forceColumn.add(mcframe.clientMGBF.MGBFP0150.CndR.$adj_flg);
		openScreen("MG", "MGBFP0150", cnd, forceColumn, info);
	}
	/**
	 * 投入原価差異一覧照会を開く
	 */
	protected void openMGBFP0270(MCEventInfo info, DispDtlR row) {
		mcframe.clientMGBF.MGBFP0270.CndR cnd = mcframe.clientMGBF.MGBFP0270.CndR.create();
		if (MAC_RPT_TGT_TYP.isDIFF_UP(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isDIFF_UP_CHD(row.rpt_tgt_typ())) {
			cnd.except_ss_flg(true);
		}
		openScreen("MG", "MGBFP0270", cnd, null, info);
	}
	/**
	 * 工数原価一覧照会を開く
	 */
	protected void openMGBFP0080(MCEventInfo info, DispDtlR row) {
		mcframe.clientMGBF.MGBFP0080.CndR cnd = mcframe.clientMGBF.MGBFP0080.CndR.create();
		openScreen("MG", "MGBFP0080", cnd, null, info);
	}
	/**
	 * 製造原価差異一覧照会を開く
	 */
	protected void openMGBFP0130(MCEventInfo info, DispDtlR row) {
		mcframe.clientMGBF.MGBFP0130.CndR cnd = mcframe.clientMGBF.MGBFP0130.CndR.create();
		openScreen("MG", "MGBFP0130", cnd, null, info);
	}
	
	protected void openScreen(String mid, String sid, MCRow cnd, List<String> forceColumn, MCEventInfo info) {
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener(mid, sid);
		setScreenOpenBind(cnd, info);
		so.putCnd(cnd, forceColumn);
		so.runValueInit();
		so.putSearchAction();
		so.show();
	}

	/**
	 * 画面遷移用共通バインド設定
	 */
	protected void setScreenOpenBind(MCRow cnd, MCEventInfo info) {
		DispDtlR row = DispDtlTable.getSelectedMCRow();

		cnd.setStringNE("calc_grp_cd", row.calc_grp_cd());
		cnd.setStringNE("calc_no", row.calc_no());

		if (MAC_RPT_TGT_TYP.isIN_ONR_DIFF(row.rpt_tgt_typ())) {
			cnd.setStringNE("repurc_obli_typ", MGC_REPURC_OBLI_TYP.REPURC_OBLI_OTH.value());
		}
		else {
			if (isSetChdCnd(row)) {
				cnd.setStringNE("chd_asst_typ", row.asst_typ());
			}
			else if (isSetParCnd(row)) {
				cnd.setStringNE("par_asst_typ", row.asst_typ());
			}
			else {
				cnd.setStringNE("asst_typ", row.asst_typ());
			}
			if (isNull(row.asst_typ()) && !isDiffCnd(row)) {
				cnd.setBooleanNE("except_other_flg", true);
			}
		}
		cnd.setStringNE("alc_ac_grp_cd1", row.alc_ac_grp_cd1());
		cnd.setStringNE("alc_ac_grp_cd2", row.alc_ac_grp_cd2());
		cnd.setStringNE("alc_ac_grp_cd3", row.alc_ac_grp_cd3());
		cnd.setStringNE("alc_ac_cd", row.alc_ac_cd());
		cnd.setStringNE("ac_slip_typ", row.ac_slip_typ());
		if (isSetIN_SS(row)) {
			cnd.setStringNE("ac_slip_typ", MAC_AC_SLIP_TYP.IN_SS.value());
		}
		cnd.setStringNE("ac_rsn_cd", row.ac_rsn_cd());
		if (isSetChdCnd(row)) {
			cnd.setStringNE("chd_itm_jnl_cd", row.itm_jnl_cd2());
			cnd.setStringNE("chd_itm_grp_cd1", row.itm_grp_cd1());
			cnd.setStringNE("chd_itm_grp_cd2", row.itm_grp_cd2());
			cnd.setStringNE("chd_itm_grp_cd3", row.itm_grp_cd3());
			cnd.setStringNE("chd_itm_grp_cd4", row.itm_grp_cd4());
			cnd.setStringNE("chd_itm_grp_cd5", row.itm_grp_cd5());
			cnd.setStringNE("chd_itm_grp_cd6", row.itm_grp_cd6());
			cnd.setStringNE("chd_itm_grp_cd7", row.itm_grp_cd7());
			cnd.setStringNE("chd_itm_grp_cd8", row.itm_grp_cd8());
			cnd.setStringNE("chd_itm_grp_cd9", row.itm_grp_cd9());
			cnd.setStringNE("chd_itm_grp_cd10", row.itm_grp_cd10());
		}
		else if (isSetParCnd(row)) {
			cnd.setStringNE("par_itm_jnl_cd", row.itm_jnl_cd2());
			cnd.setStringNE("par_itm_grp_cd1", row.itm_grp_cd1());
			cnd.setStringNE("par_itm_grp_cd2", row.itm_grp_cd2());
			cnd.setStringNE("par_itm_grp_cd3", row.itm_grp_cd3());
			cnd.setStringNE("par_itm_grp_cd4", row.itm_grp_cd4());
			cnd.setStringNE("par_itm_grp_cd5", row.itm_grp_cd5());
			cnd.setStringNE("par_itm_grp_cd6", row.itm_grp_cd6());
			cnd.setStringNE("par_itm_grp_cd7", row.itm_grp_cd7());
			cnd.setStringNE("par_itm_grp_cd8", row.itm_grp_cd8());
			cnd.setStringNE("par_itm_grp_cd9", row.itm_grp_cd9());
			cnd.setStringNE("par_itm_grp_cd10", row.itm_grp_cd10());
		}
		else {
			cnd.setStringNE("itm_jnl_cd", row.itm_jnl_cd2());
			cnd.setStringNE("itm_grp_cd1", row.itm_grp_cd1());
			cnd.setStringNE("itm_grp_cd2", row.itm_grp_cd2());
			cnd.setStringNE("itm_grp_cd3", row.itm_grp_cd3());
			cnd.setStringNE("itm_grp_cd4", row.itm_grp_cd4());
			cnd.setStringNE("itm_grp_cd5", row.itm_grp_cd5());
			cnd.setStringNE("itm_grp_cd6", row.itm_grp_cd6());
			cnd.setStringNE("itm_grp_cd7", row.itm_grp_cd7());
			cnd.setStringNE("itm_grp_cd8", row.itm_grp_cd8());
			cnd.setStringNE("itm_grp_cd9", row.itm_grp_cd9());
			cnd.setStringNE("itm_grp_cd10", row.itm_grp_cd10());
		}
		cnd.setStringNE("cost_io_typ", row.cost_io_typ());
		cnd.setStringNE("wg_cd", _cndR.wg_cd());
		
		setScreenOpenKeyBind(cnd, info, row);
	}
	
	/**
	 * 横展開したカラムのバインド設定
	 */
	protected void setScreenOpenKeyBind(MCRow cnd, MCEventInfo info, DispDtlR row) {
		int i = getVarColIndex(info.getClickColumn());
		if (i >= 0) {
			KeyR r = getKeyL().get(i);
			if (MAC_RPT_KEY_TYP.isMNG_DPT(row.rpt_key_typ())) {
				if (isSetChdCnd(row)) {
					cnd.setStringNE("inpt_dpt_cd", r.dpt_cd());
				}
				else {
					cnd.setStringNE("dpt_cd", r.dpt_cd());
					cnd.setStringNE("mng_dpt_cd", r.dpt_cd());
				}
			}
			else if (MAC_RPT_KEY_TYP.isWG(row.rpt_key_typ())) {
				cnd.setStringNE("wg_cd", r.wg_cd());
			}
			else if (MAC_RPT_KEY_TYP.isITM(row.rpt_key_typ())) {
				if (isSetChdCnd(row)) {
					cnd.setStringNE("chd_itm_cd", r.itm_cd());
					cnd.setStringNE("chd_itm_sub1", r.itm_sub1());
					cnd.setStringNE("chd_itm_sub2", r.itm_sub2());
					cnd.setStringNE("chd_itm_sub3", r.itm_sub3());
				}
				else if (isSetParCnd(row)) {
					cnd.setStringNE("par_itm_cd", r.itm_cd());
					cnd.setStringNE("par_itm_sub1", r.itm_sub1());
					cnd.setStringNE("par_itm_sub2", r.itm_sub2());
					cnd.setStringNE("par_itm_sub3", r.itm_sub3());
				}
				else {
					cnd.setStringNE("itm_cd", r.itm_cd());
					cnd.setStringNE("itm_sub1", r.itm_sub1());
					cnd.setStringNE("itm_sub2", r.itm_sub2());
					cnd.setStringNE("itm_sub3", r.itm_sub3());
				}
			}
			else if (MAC_RPT_KEY_TYP.isITM_JNL(row.rpt_key_typ())) {
				if (isSetChdCnd(row)) {
					cnd.setStringNE("chd_itm_jnl_cd", r.itm_jnl_cd());
				}
				else if (isSetParCnd(row)) {
					cnd.setStringNE("par_itm_jnl_cd", r.itm_jnl_cd());
				}
				else {
					cnd.setStringNE("itm_jnl_cd", r.itm_jnl_cd());
				}
			}
			else {
				if (isSetChdCnd(row)) {
					if (MAC_ITM_GRP_TYP.isGRP1(r.itm_grp_typ())) {
						cnd.setStringNE("chd_itm_grp_cd1", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP2(r.itm_grp_typ())) {
						cnd.setStringNE("chd_itm_grp_cd2", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP3(r.itm_grp_typ())) {
						cnd.setStringNE("chd_itm_grp_cd3", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP4(r.itm_grp_typ())) {
						cnd.setStringNE("chd_itm_grp_cd4", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP5(r.itm_grp_typ())) {
						cnd.setStringNE("chd_itm_grp_cd5", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP6(r.itm_grp_typ())) {
						cnd.setStringNE("chd_itm_grp_cd6", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP7(r.itm_grp_typ())) {
						cnd.setStringNE("chd_itm_grp_cd7", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP8(r.itm_grp_typ())) {
						cnd.setStringNE("chd_itm_grp_cd8", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP9(r.itm_grp_typ())) {
						cnd.setStringNE("chd_itm_grp_cd9", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP10(r.itm_grp_typ())) {
						cnd.setStringNE("chd_itm_grp_cd10", r.itm_grp_cd());
					}
				}
				else if (isSetParCnd(row)) {
					if (MAC_ITM_GRP_TYP.isGRP1(r.itm_grp_typ())) {
						cnd.setStringNE("par_itm_grp_cd1", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP2(r.itm_grp_typ())) {
						cnd.setStringNE("par_itm_grp_cd2", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP3(r.itm_grp_typ())) {
						cnd.setStringNE("par_itm_grp_cd3", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP4(r.itm_grp_typ())) {
						cnd.setStringNE("par_itm_grp_cd4", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP5(r.itm_grp_typ())) {
						cnd.setStringNE("par_itm_grp_cd5", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP6(r.itm_grp_typ())) {
						cnd.setStringNE("par_itm_grp_cd6", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP7(r.itm_grp_typ())) {
						cnd.setStringNE("par_itm_grp_cd7", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP8(r.itm_grp_typ())) {
						cnd.setStringNE("par_itm_grp_cd8", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP9(r.itm_grp_typ())) {
						cnd.setStringNE("par_itm_grp_cd9", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP10(r.itm_grp_typ())) {
						cnd.setStringNE("par_itm_grp_cd10", r.itm_grp_cd());
					}
				}
				else {
					if (MAC_ITM_GRP_TYP.isGRP1(r.itm_grp_typ())) {
						cnd.setStringNE("itm_grp_cd1", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP2(r.itm_grp_typ())) {
						cnd.setStringNE("itm_grp_cd2", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP3(r.itm_grp_typ())) {
						cnd.setStringNE("itm_grp_cd3", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP4(r.itm_grp_typ())) {
						cnd.setStringNE("itm_grp_cd4", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP5(r.itm_grp_typ())) {
						cnd.setStringNE("itm_grp_cd5", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP6(r.itm_grp_typ())) {
						cnd.setStringNE("itm_grp_cd6", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP7(r.itm_grp_typ())) {
						cnd.setStringNE("itm_grp_cd7", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP8(r.itm_grp_typ())) {
						cnd.setStringNE("itm_grp_cd8", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP9(r.itm_grp_typ())) {
						cnd.setStringNE("itm_grp_cd9", r.itm_grp_cd());
					}
					else if (MAC_ITM_GRP_TYP.isGRP10(r.itm_grp_typ())) {
						cnd.setStringNE("itm_grp_cd10", r.itm_grp_cd());
					}
				}
			}
		}
	}

	protected int getVarColIndex(MCColumnConfig cc) {
		int i = 0;
		for (MCColumnConfig chkcc : _ccList) {
			if (chkcc == cc) {
				return i;
			}
			i++;
		}
		return -1;
	}
	
	protected boolean isSetChdCnd(DispDtlR row) {
		return MAC_RPT_TGT_TYP.isINPT(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isDIFF_QTY_CHD(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isDIFF_UP_CHD(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isDIFF_SS_CHD(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isIN_ONR_DIFF(row.rpt_tgt_typ());
	}
	protected boolean isSetParCnd(DispDtlR row) {
		return MAC_RPT_TGT_TYP.isDIFF_QTY(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isDIFF_UP(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isDIFF_SS(row.rpt_tgt_typ());
	}

	protected boolean isDiffCnd(DispDtlR row) {
		return MAC_RPT_TGT_TYP.isDIFF_QTY(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isDIFF_UP(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isDIFF_OUTSRC(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isDIFF_SS(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isDIFF_WK(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isDIFF_A(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isDIFF_B(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isDIFF_C(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isDIFF_D(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isDIFF_E(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isDIFF_RT(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isDIFF_STD(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isDIFF_INST(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isDIFF_IO_PRI(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isDIFF_QTY_CHD(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isDIFF_UP_CHD(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isDIFF_SS_CHD(row.rpt_tgt_typ());
	}

	protected boolean isSetIN_SS(DispDtlR row) {
		return MAC_RPT_TGT_TYP.isDIFF_SS(row.rpt_tgt_typ())
				|| MAC_RPT_TGT_TYP.isDIFF_SS_CHD(row.rpt_tgt_typ());
	}

	// //////////////////////////////////////////////
	// セルコンフィグ////////////////////////////////
	// //////////////////////////////////////////////
	/**
	 * セルコンフィグの取得
	 * 
	 * @return 明細用のセルコンフィグ
	 */
	protected TableCellConfig createTableCellConfig() {
		return new TableCellConfig();
	}

	/**
	 * セルコンフィグの設定
	 */
	@Override
	protected void setCellConfig() {
		DispDtlTable.setCellConfig(createTableCellConfig());
	}

	/**
	 * セルコンフィグクラス
	 */
	protected class TableCellConfig extends MGUDP_CellConfig {

		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table,
				MCMode mode) {

			DispDtlR r = DispDtlTable.getRow(index);
			if (!isNull(r.bg_r())) {
				return new Color(r.bg_r().intValue(), r.bg_g().intValue(), r.bg_b()
						.intValue());
			}
			return Color.white;
		}

		@Override
		public Color getPriorFG(int index, MCColumnConfig column, MCTable table,
				MCMode mode) {

			DispDtlR r = DispDtlTable.getRow(index);
			if (!isNull(r.fg_r())) {
				return new Color(r.fg_r().intValue(), r.fg_g().intValue(), r.fg_b()
						.intValue());
			}
			return super.getPriorFG(index, column, table, mode);
		}

		@Override
		public String getPriorViewScaleType(int index, MCColumnConfig column,
				MCTable<?> table) {
			DispDtlR row = getDispDtlL().get(index);
			if (isNull(row.qty_unit_typ())) {
				// 実装仕様書で定義した表示桁を使用する

				// 動的に追加したカラムはAMT
				if (_ccList.contains(column)) {
					return IfViewScale.AMT;
				}
				return super.getPriorViewScaleType(index, column, table);
			}
			else {
				// 表示桁機能を使用しない
				return null;
			}
		}
	}

	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig conf = super.createFXBAP_PopupConfig(beans);
		if (beans == DispDtlTable) {
			conf.ignoreSortOrder(true);
			conf.ignoreTableSort(true);
			conf.ignoreRowSignal(true);
		}
		return conf;
	}

	@Override
	protected Set<MCColumnConfig> getCachedVisibleColumnConfigs(MCTable tbl, String type) {
		if (tbl == DispDtlTable) {
			// 可変カラムは検索するごとに変わるのでキャッシュしない
			return null;
		}
		return super.getCachedVisibleColumnConfigs(tbl, type);
	}

	@Override
	protected void customVisibleColumnConfigs(MCTable table, String type,
			Set<MCColumnConfig> confSet) {
		if (table == DispDtlTable) {
			// 可変カラムの部分を再設定する
			confSet.removeAll(_ccAllList);
			confSet.addAll(_ccList);
		}
		super.customVisibleColumnConfigs(table, type, confSet);
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
	}

}