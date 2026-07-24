package mcframe.clientMGBF.MGBFP0400;

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
import mcframe.clientMAUC.MAUCP0020.TermR;
import mcframe.clientMAUD.MAUDP0080.IfViewScale;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
import mcframe.commonCore.meta.MCMeta;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_MlyRptSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_MlyRptSrch_MC extends MGBFP_MlyRptSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/**
	 * 合計カラムの接尾辞
	 */
	protected static final String COL_TTL_SUFFIX = "_ttl";
	
	/**
	 * 最大年月
	 */
	protected int _max_term = 60;
	
	/**
	 * 月末データのインデックス
	 */
	protected int _endIndex;

	/**
	 * 追加したカラムの保持
	 */
	protected List<MCColumnConfig> _ccList = new ArrayList<>();

	/**
	 * 小計カラムの保持
	 */
	protected List<MCColumnConfig> _ttlCcList = new ArrayList<>();

	/**
	 * 合計行の色
	 */
	protected Color _ttlColor = getVTtlColor(this);

	protected int _ymSize;

	protected MCRow _ymRow;

	protected CndR _cndR;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_MlyRptSrch_MC() {
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
	public MGBFP_MlyRptSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBFL0400_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0400_Srch01Caller<P extends MGBFP_MlyRptSrch, B extends MG_MGBFL0400_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0400_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkYm(msgList);
		}
		
		protected void checkYm(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_ym_fr, Cnd_ym_to));
			msgList.addAll(checkTermYm(Cnd_ym_fr, Cnd_ym_to, _max_term));
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			_ymRow = MCRow.create();
			_cndR = getCndR().clone();
		}

		@Override
		protected void show() {
			
			setupColumns();

			for (DispDtlR r : bridge.down0()) {
				// 数値項目のセット
				String[] x = MCStringUtil.arrayValueSplit(r.col_all());
				for (int i = 0; i < x.length; i++) {
					if (!isNull(x[i])) {
						r.setNumber(
								"col" + i / _ymSize + "_" + i % _ymSize,
								MCNumber.valueOf(x[i]));
					}
				}

				r.ttl(getSum(r));
			}

			super.show();
			
			// コンポーネントを動的に追加しているため、呼び出す必要がある
			DispDtlTable.validate();
		}
		
		protected void setupColumns() {

			// 動的カラムの追加（追加済みはラベル変更）
			for (int i = 0; i < bridge.down1().size(); i++) {
				KeyR r = bridge.down1().get(i);

				// カラムグループの設定
				MCColumnGroup cg;
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

				// //////////////////////////////////////////////////////////////
				// カラムグループごとの合計列の追加 ////////////////////////////
				String ttlNm = "col" + i + COL_TTL_SUFFIX;
				MCColumnConfig ttlC;

				// ***** row Column *****
				bridge.down0().addNumberColumn(ttlNm);

				if (0 < cg.getAllColumnConfigs().length) {
					ttlC = DispDtlTable.getColumnConfig("DispDtl." + ttlNm);
				}
				else {
					// ***** row Column *****
					getDispDtlL().addNumberColumn(ttlNm);

					// ***** table Column *****
					MCColumnType clmTyp = MCColumnType.NUMBER;
					MCMeta metaClm = MCMeta.createNumberMeta(ttlNm, ttlNm, 21, 8, true);
					ttlC = beansFactory.createTableColumn("DispDtl." + ttlNm, clmTyp);
					ttlC.setMeta(metaClm);
					ttlC.addAllListener(MGBFP_MlyRptSrch_MC.this);
					ttlC.setListListener(MGBFP_MlyRptSrch_MC.this);
					DispDtlTable.addColumnConfig(ttlC);
					cg.add(ttlC); // カラムグループへの追加
					_ccList.add(ttlC);
					_ttlCcList.add(ttlC);
				}
				ttlC.setHeaderName(columnDispDtl_ttl.getHeaderName());
				ttlC.setHeaderMessage(columnDispDtl_ttl.getMessageByLocale());
				ttlC.putMode(MGBFP_MlyRptSrch_MC.this, REF, MCMode.READ_ONLY);
				MCColumnConfig pc = ttlC;
				// //////////////////////////////////////////////////////////////
				int j = 0;
				for (MCDate d = getCndR().ym_fr(); d.lte(getCndR().ym_to()); d = d
						.addMonth(1)) {
					String nm = "col" + i + "_" + j;
					_ymRow.addDateColumn(nm, d);
					MCColumnConfig c;

					// ***** row Column *****
					bridge.down0().addNumberColumn(nm);

					// カラムの設定
					if (j < cg.getAllColumnConfigs().length - 1) {
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
						c.addAllListener(MGBFP_MlyRptSrch_MC.this);
						c.setListListener(MGBFP_MlyRptSrch_MC.this);
						DispDtlTable.addColumnConfig(c);
						cg.add(c); // カラムグループへの追加
						_ccList.add(c);
					}
					header = toYMHeaderLabel(panel, d);
					c.setHeaderName(header);
					c.setHeaderMessage(header);
					c.putMode(MGBFP_MlyRptSrch_MC.this, REF, MCMode.READ_ONLY);

					// カラムの並び順を修正
					if (pc != null) {
						DispDtlTable.moveColumns(pc, c);
					}
					pc = c;
					if (isSame(d, bridge.down2().max_month())) {
						_endIndex = j;
					}
					j++;
				}
				_ymSize = j;

				// 以前追加して余ったカラムは見えなくする（カラムグループから削除できないため）
				for (j = _ymSize; j < cg.getAllColumnConfigs().length - 1; j++) {
					String nm = "col" + i + "_" + j;

					MCColumnConfig c = DispDtlTable.getColumnConfig("DispDtl." + nm);
					c.putMode(MGBFP_MlyRptSrch_MC.this, REF, MCMode.INVISIBLE);
					bridge.down0().addNumberColumn(nm);
				}
			}

			// 以前追加して余ったカラムグループは所属するカラムを全て見えなくする
			for (int i = bridge.down1().size(); i < DispDtlTable.getAllColumnGroups().length; i++) {
				for (MCColumnConfig c : DispDtlTable.getAllColumnGroups()[i]
						.getAllColumnConfigs()) {
					c.putMode(MGBFP_MlyRptSrch_MC.this, REF, MCMode.INVISIBLE);
				}
			}

			DispDtlTable.updateResource();
			DispDtlTable.initialized();
			DispDtlTable.setSortable(false); // ソート不可
		}
		
		protected MCNumber getSum(DispDtlR r) {
			// 合計の設定
			MCNumber sum = MCNumber.ZERO;
			MCNumber subttl = MCNumber.ZERO; // カラムグループ単位の合計
			if (MAC_RPT_TGT_TYP.is_st(r.rpt_tgt_typ())) {
				for (int i = 0; i < bridge.down1().size(); i++) {
					subttl = nvl(r.getNumber("col" + i + "_0"), MCNumber.ZERO);
					r.setNumberNE("col" + i + COL_TTL_SUFFIX, subttl);
					sum = sum.add(subttl);
				}
			}
			else if (MAC_RPT_TGT_TYP.is_end(r.rpt_tgt_typ())) {
				if (_endIndex >= 0) {
					for (int i = 0; i < bridge.down1().size(); i++) {
						subttl = nvl(r.getNumber("col" + i + "_" + _endIndex),
								MCNumber.ZERO);
						r.setNumberNE("col" + i + COL_TTL_SUFFIX, subttl);
						sum = sum.add(subttl);
					}
				}
				else {
					for (int i = 0; i < bridge.down1().size(); i++) {
						r.setNumberNE("col" + i + COL_TTL_SUFFIX, MCNumber.ZERO);
					}
					sum = MCNumber.ZERO;
				}
			}
			else {
				for (int i = 0; i < bridge.down1().size(); i++) {
					for (int j = 0; j < _ymSize; j++) {
						subttl = subttl.add(nvl(r.getNumber("col" + i + "_" + j),
								MCNumber.ZERO));
					}
					r.setNumberNE("col" + i + COL_TTL_SUFFIX, subttl);
					sum = sum.add(subttl);
					subttl = MCNumber.ZERO;
				}
			}
			return sum;
		}

		@Override
		protected void setMode() {
			super.setMode();
			setREFStatus();
			if (isSame(getCndR().max_mons(), 1)) {
				setDefaultMode(columnDispDtl_ttl);
				for (int i = 0; i < bridge.down1().size(); i++) {
					MCColumnGroup cg = DispDtlTable.getAllColumnGroups()[i];
					cg.getAllColumnConfigs()[0].setMode(MCMode.READ_ONLY);
				}
			}
			else {
				columnDispDtl_ttl.setMode(MCMode.INVISIBLE);
				for (int i = 0; i < bridge.down1().size(); i++) {
					MCColumnGroup cg = DispDtlTable.getAllColumnGroups()[i];
					cg.getAllColumnConfigs()[0].setMode(MCMode.INVISIBLE);
				}
			}
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
		callMG_MGBFL0400_Srch01();
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		DispDtlTable.setSortable(false); // ソート不可
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	
	protected void valueInitSub() {
		TermR term = getTermInfo(this);
		if (term != null) {
			setValueEx(Cnd_ym_fr, term.term());
			setValueEx(Cnd_ym_to, term.term_end_ym().addMonth(-1));
		}
	}

	@Override
	public void doCnd_calc_grp_cd_LC(MCEventInfo info) {
		super.doCnd_calc_grp_cd_LC(info);
		setValueEx(Cnd_rpt_ptn_cd, null);
		setRptPtnCdMode();
	}

	@Override
	public void doCnd_rpt_ptn_cd_LC(MCEventInfo info) {
		super.doCnd_rpt_ptn_cd_LC(info);
		setValueEx(Cnd_rpt_key_cd, null);
		setRptKeyCdMode();
	}

	@Override
	public void doCnd_rpt_key_typ_LC(MCEventInfo info) {
		super.doCnd_rpt_key_typ_LC(info);
		clearValue();
		setRptKeyTypCndMode();
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
		setRptPtnCdMode();
		setRptKeyCdMode();
		setRptKeyTypCndMode();
	}

	protected void setRptPtnCdMode() {
		if (isNull(getCndR().calc_grp_cd())) {
			Cnd_rpt_ptn_cd.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_rpt_ptn_cd);
		}
	}
	
	protected void setRptKeyCdMode() {
		if (isNull(getCndR().rpt_ptn_cd())) {
			Cnd_rpt_key_cd.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_rpt_key_cd);
		}
	}
	
	protected void setRptKeyTypCndMode() {
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

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == DispDtlTable) doDispDtl_DC(info);
	}

	protected void doDispDtl_DC(MCEventInfo info) {
		openMGBFP0240(info);
	}
	
	protected void openMGBFP0240(MCEventInfo info) {
		MCColumnConfig col = info.getClickColumn();
		if (!_ymRow.contains(col.getBaseRowColumnName())) {
			return;
		}
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBFP0240");
		mcframe.clientMGBF.MGBFP0240.CndR cnd = mcframe.clientMGBF.MGBFP0240.CndR.create();
		CalcNoR calcR = getCalcNoL().getFirst(CalcNoR.$ym, _ymRow.getDate(col.getBaseRowColumnName()));
		if (calcR != null) {
			cnd.calc_no(calcR.calc_no());
		}
		cnd.calc_grp_cd(_cndR.calc_grp_cd());
		cnd.rpt_ptn_cd(_cndR.rpt_ptn_cd());
		cnd.rpt_key_cd(_cndR.rpt_key_cd());
		cnd.wg_cd(_cndR.wg_cd());
		so.putCnd(cnd);
		so.runValueInit();
		so.putSearchAction();
		so.show();
	}

	/**
	 * セルコンフィグの設定
	 */
	@Override
	protected void setCellConfig() {
		DispDtlTable.setCellConfig(createTableCellConfig());
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
	 * セルコンフィグクラス
	 */
	protected class TableCellConfig extends MGUDP_CellConfig {

		@SuppressWarnings("rawtypes")
		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table,
				MCMode mode) {

			// 小計
			if (_ttlCcList.contains(column)) {
				return _ttlColor;
			}

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

			// 小計
			if (_ttlCcList.contains(column)) {
				return super.getPriorFG(index, column, table, mode);
			}

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