package mcframe.clientMGBF.MGBFP0410;

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
 * 画面"MGBFP_RptCmp"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_RptCmp_MC extends MGBFP_RptCmp_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	/**
	 * 追加したカラムの保持
	 */
	protected List<MCColumnConfig> _ccList = new ArrayList<>();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_RptCmp_MC() {
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
	public MGBFP_RptCmp_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBFL0410_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0410_Srch01Caller<P extends MGBFP_RptCmp, B extends MG_MGBFL0410_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0410_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void show() {
			
			setupColumns();

			for (DispDtlR r : bridge.down0()) {
				// 数値項目のセット
				String[] x = MCStringUtil.arrayValueSplit(r.col_all());
				for (int i = 0; i < x.length; i++) {
					if (!isNull(x[i])) {
						r.setNumber("col" + i / bridge.down2().size() + "_" + i
								% bridge.down2().size(), MCNumber.valueOf(x[i]));
					}
				}
			}
			super.show();
			
			// コンポーネントを動的に追加しているため、呼び出す必要がある
			DispDtlTable.validate();
		}
		
		protected void setupColumns() {

			// 動的カラムの追加（追加済みはラベル変更）
			MCColumnGroup cg;
			for (int i = 0; i < bridge.down1().size(); i++) {
				KeyR r = bridge.down1().get(i);

				// カラムグループの設定
				if (i < DispDtlTable.getAllColumnGroups().length) {
					cg = DispDtlTable.getAllColumnGroups()[i];
				}
				else {
					cg = beansFactory.createColumnGroup("DispDtl.grp" + i);
					DispDtlTable.addColumnGroup(cg);
				}
				String header = nvl(r.nm(), r.cd());
				cg.setHeaderName(header);
				cg.setHeaderMessage(header);

				MCColumnConfig pc = null;
				for (int j = 0; j < bridge.down2().size(); j++) {
					String nm = "col" + i + "_" + j;
					MstrR r2 = bridge.down2().get(j);
					MCColumnConfig c;

					// ***** row Column *****
					bridge.down0().addNumberColumn(nm);

					// カラムの設定
					if (j < cg.getAllColumnConfigs().length) {
						c = DispDtlTable.getColumnConfig("DispDtl." + nm);
					}
					else {
						// ***** row Column *****
						getDispDtlL().addNumberColumn(nm);

						// ***** table Column *****
						MCColumnType clmTyp = MCColumnType.NUMBER;
						MCMeta metaClm = MCMeta.createNumberMeta(nm, nm, 21, 8, true);
						c = beansFactory.createTableColumn("DispDtl." + nm, clmTyp);
						c.setMeta(metaClm);
						c.addAllListener(MGBFP_RptCmp_MC.this);
						c.setListListener(MGBFP_RptCmp_MC.this);
						DispDtlTable.addColumnConfig(c);
						cg.add(c); // カラムグループへの追加
						_ccList.add(c);
					}
					header = nvl(r2.col_nm(), r2.col_cd());
					c.setHeaderName(header);
					c.setHeaderMessage(header);
					c.putMode(MGBFP_RptCmp_MC.this, REF, MCMode.READ_ONLY);

					// カラムの並び順を修正
					if (pc != null) {
						DispDtlTable.moveColumns(pc, c);
					}
					pc = c;
				}

				// 以前追加して余ったカラムは見えなくする（カラムグループから削除できないため）
				for (int j = bridge.down2().size(); j < cg.getAllColumnConfigs().length; j++) {
					String nm = "col" + i + "_" + j;

					MCColumnConfig c = DispDtlTable.getColumnConfig("DispDtl." + nm);
					c.putMode(MGBFP_RptCmp_MC.this, REF, MCMode.INVISIBLE);
				}
			}

			// 以前追加して余ったカラムグループは所属するカラムを全て見えなくする
			for (int i = bridge.down1().size(); i < DispDtlTable.getAllColumnGroups().length; i++) {
				for (MCColumnConfig c : DispDtlTable.getAllColumnGroups()[i].getAllColumnConfigs()) {
					c.putMode(MGBFP_RptCmp_MC.this, REF, MCMode.INVISIBLE);
				}
			}

			DispDtlTable.updateResource();
			DispDtlTable.initialized();
			DispDtlTable.setSortable(false); // ソート不可
		}

		@Override
		protected void setMode() {
			super.setMode();
			setREFStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBFL0410_Srch01();
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		DispDtlTable.setSortable(false); // ソート不可
	}

	@Override
	public void doCnd_cmp_ptn_cd_LC(MCEventInfo info) {
		super.doCnd_cmp_ptn_cd_LC(info);
		clearValue();
		setCndMode();
	}

	protected void clearValue() {
		setValueEx(Cnd_mng_dpt_cd, null);
		setValueEx(Cnd_mng_dpt_nm, null);
		setValueEx(Cnd_itm_cd, null);
		setValueEx(Cnd_itm_sub1, null);
		setValueEx(Cnd_itm_sub2, null);
		setValueEx(Cnd_itm_sub3, null);
		setValueEx(Cnd_itm_nm, null);
		setValueEx(Cnd_itm_jnl_cd, null);
		setValueEx(Cnd_itm_jnl_nm, null);
		setValueEx(Cnd_itm_grp_cd, null);
		setValueEx(Cnd_itm_grp_nm, null);
	}
	
	protected void setCndMode() {
		setMndDptMode();
		setItmMode();
		setItmJnlMode();
		setItmGrpMode();
		setWgMode();
	}
	
	protected void setMndDptMode() {
		if (MAC_RPT_KEY_TYP.isMNG_DPT(getCndR().rpt_key_typ())) {
			setDefaultMode(Cnd_mng_dpt_cd);
			setDefaultMode(Cnd_mng_dpt_nm);
		}
		else {
			Cnd_mng_dpt_cd.setMode(MCMode.READ_ONLY);
			Cnd_mng_dpt_nm.setMode(MCMode.READ_ONLY);
		}
	}
	
	protected void setItmMode() {
		if (MAC_RPT_KEY_TYP.isITM(getCndR().rpt_key_typ())){
			Cnd_itm_p_PPanel.setENABLE_SRCHStatus();
		}
		else {
			Cnd_itm_p_PPanel.setREAD_ONLYStatus();
		}
	}
	
	protected void setItmJnlMode() {
		if (MAC_RPT_KEY_TYP.isITM_JNL(getCndR().rpt_key_typ())) {
			setDefaultMode(Cnd_itm_jnl_cd);
			setDefaultMode(Cnd_itm_jnl_nm);
		}
		else {
			Cnd_itm_jnl_cd.setMode(MCMode.READ_ONLY);
			Cnd_itm_jnl_nm.setMode(MCMode.READ_ONLY);
		}
	}
	
	protected void setItmGrpMode() {
		if (MAC_RPT_KEY_TYP.isGRP1(getCndR().rpt_key_typ())
				|| MAC_RPT_KEY_TYP.isGRP2(getCndR().rpt_key_typ())
				|| MAC_RPT_KEY_TYP.isGRP3(getCndR().rpt_key_typ())
				|| MAC_RPT_KEY_TYP.isGRP4(getCndR().rpt_key_typ())
				|| MAC_RPT_KEY_TYP.isGRP5(getCndR().rpt_key_typ())
				|| MAC_RPT_KEY_TYP.isGRP6(getCndR().rpt_key_typ())
				|| MAC_RPT_KEY_TYP.isGRP7(getCndR().rpt_key_typ())
				|| MAC_RPT_KEY_TYP.isGRP8(getCndR().rpt_key_typ())
				|| MAC_RPT_KEY_TYP.isGRP9(getCndR().rpt_key_typ())
				|| MAC_RPT_KEY_TYP.isGRP10(getCndR().rpt_key_typ())) {
			setDefaultMode(Cnd_itm_grp_cd);
			setDefaultMode(Cnd_itm_grp_nm);
		}
		else {
			Cnd_itm_grp_cd.setMode(MCMode.READ_ONLY);
			Cnd_itm_grp_nm.setMode(MCMode.READ_ONLY);
		}
	}
	
	protected void setWgMode() {
		if (isNull(getCndR().rpt_key_typ())
				|| MAC_RPT_KEY_TYP.isWG(getCndR().rpt_key_typ())) {
			setDefaultMode(Cnd_wg_cd);
		}
		else {
			Cnd_wg_cd.setMode(MCMode.REQUIRED);
		}
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

		@SuppressWarnings("rawtypes")
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

		@SuppressWarnings("rawtypes")
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
				if (_ccList.contains(column)) {
					return IfViewScale.AMT;
				}
				// 実装仕様書で定義した表示桁を使用する
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
		// ソート設定のポップアップを無効にする
		FXBAP_PopupConfig conf = super.createFXBAP_PopupConfig(beans);
		if (beans == DispDtlTable) {
			conf.ignoreSortOrder(true);
			conf.ignoreTableSort(true);
			conf.ignoreRowSignal(true);
		}
		return conf;
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected Set<MCColumnConfig> getCachedVisibleColumnConfigs(MCTable tbl, String type) {
		if (tbl == DispDtlTable) {
			// 可変カラムは検索するごとに変わるのでキャッシュしない
			return null;
		}
		return super.getCachedVisibleColumnConfigs(tbl, type);
	}

}