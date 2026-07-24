package mcframe.clientMGBD.MGBDP0250;

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
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
import mcframe.commonCore.meta.MCMeta;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBDP_PreAlcChk"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_PreAlcChk_MC extends MGBDP_PreAlcChk_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected String _delimiter = MGC_STR.COL_DLM.value();

	/**
	 *  追加した動的カラムの保持
	 */
	protected List<MCColumnConfig> _ccList = new ArrayList<>();

	/**
	 *  実装仕様書に用意している動的カラムの最大のカラム番号
	 */
	protected int col_max = -1;

	protected CndR _cndR;
	
	protected Color _vTtlColor = getVTtlColor(this);

	protected Color _expnsTtlColor = getVttlExpnsColor(this);

	protected Color _expnsSrchRsltColor = getExpnsSrchRsltColor(this);
	
	/**
	 * 配賦元ラベル
	 */
	protected String _srcHeaderName;
	
	/**
	 * 配賦先ラベル
	 */
	protected String _destHeaderName;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_PreAlcChk_MC() {
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
	public MGBDP_PreAlcChk_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBDL0250_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0250_Srch01Caller<P extends MGBDP_PreAlcChk, B extends MG_MGBDL0250_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0250_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkBeforeAfter(Cnd_ym_fr, Cnd_ym_to));
		}

		@Override
		protected void afterCall() {
			super.afterCall();

			for (DispDtlR r : bridge.down0()) {
				String[] x = MCStringUtil.split(_delimiter, r.col_all());
				for (int i = 0; i < x.length; i++) {
					if (!isNull(x[i])) {
						// 数値項目のセット
						r.setNumber("col_" + i, MCNumber.valueOf(x[i]));
					}
				}
			}
			if (getCndR().pre_alc_lvl_flg()) {
				MCList<DispDtlR> tmp = MCList.create(DispDtlR.class);
				DispDtlR ttlRow = bridge.down0().createRow();
				ttlRow.addBooleanColumn("ttl_flg", true);
				MCNumber pre_alc_lvl = null;
				DispDtlR sumRow = null;
				for (DispDtlR r : bridge.down0()) {
					if (!isSame(pre_alc_lvl, r.pre_alc_lvl())) {
						if (sumRow != null) {
							tmp.add(sumRow);
						}
						pre_alc_lvl = r.pre_alc_lvl();
						sumRow = bridge.down0().createRow();
						sumRow.pre_alc_lvl(pre_alc_lvl);
						sumRow.addBooleanColumn("sum_flg", true);
					}
					for (int i = 0; i < bridge.down1().size(); i++) {
						sumRow.setNumberNE("col_" + i,
								MCNumber.sum(sumRow.getNumberNE("col_" + i),
										r.getNumberNE("col_" + i)));
						ttlRow.setNumberNE("col_" + i,
								MCNumber.sum(ttlRow.getNumberNE("col_" + i),
										r.getNumberNE("col_" + i)));
					}
					sumRow.ttl(MCNumber.sum(sumRow.ttl(), r.ttl()));
					ttlRow.ttl(MCNumber.sum(ttlRow.ttl(), r.ttl()));
					tmp.add(r);
				}
				if (sumRow != null) {
					tmp.add(sumRow);
				}
				bridge.down0().setAll(tmp);
				bridge.down0().add(ttlRow);
			}
			else {
				DispDtlR sumRow = bridge.down0().createRow();
				for (DispDtlR r : bridge.down0()) {
					sumRow.ttl(MCNumber.sum(sumRow.ttl(), r.ttl()));
				}
				for (int i = 0; i < bridge.down1().size(); i++) {
					sumRow.setNumberNE("col_" + i, bridge.down0().sum("col_" + i));
				}
				sumRow.addBooleanColumn("ttl_flg", true);
				bridge.down0().add(sumRow);
			}
			_cndR = getCndR().clone();
		}

		@Override
		protected void show() {

			int size = bridge.down1().size();

			// セルの色付け・カラムグループへの追加用
			TableCellConfig cc = (TableCellConfig) DispDtlTable.getCellConfig();
			MCColumnGroup[] cg = DispDtlTable.getAllColumnGroups();

			// 動的カラムの追加（追加済みはラベル変更）
			for (int i = 0; i < size; i++) {
				KeyR r = bridge.down1().get(i);
				String nm = "col_" + i;

				// ***** row Column *****
				MCColumnConfig c = null;
				if (!(col_max < i) && !(i < _ccList.size())) {
					// down0にColumnがあるので何もしない
					// DtlLにtable Columnが無いので追加する

					// ***** table Column *****
					MCColumnType clmTyp = MCColumnType.NUMBER;
					MCMeta metaClm = MCMeta.createNumberMeta(nm, nm, 21, 8, true);
					c = beansFactory.createTableColumn("DispDtl." + nm, clmTyp);
					c.setMeta(metaClm);
					c.addAllListener(MGBDP_PreAlcChk_MC.this);
					c.setListListener(MGBDP_PreAlcChk_MC.this);
					DispDtlTable.addColumnConfig(c);
					_ccList.add(c);
					cc.putColumnBG(c, _expnsSrchRsltColor); // 色付け
					cg[1].add(c); // カラムグループへの追加
				}
				else if (!(col_max < i) && i < _ccList.size()) {
					// down0、DtlLにColumnがあるので何もしない
					c = DispDtlTable.getColumnConfig("DispDtl." + nm);
				}
				else if (col_max < i && i < _ccList.size()) {
					// down0にColumnが無いので追加する
					// DtlLにColumnがあるので何もしない
					bridge.down0().addNumberColumn(nm);
					c = DispDtlTable.getColumnConfig("DispDtl." + nm);
				}
				else if (col_max < i && !(i < _ccList.size())) {
					// down0にColumnが無いので追加する
					// DtlLにColumnが無いので追加する

					// ***** row Column *****
					bridge.down0().addNumberColumn(nm);
					getDispDtlL().addNumberColumn(nm);

					// ***** table Column *****
					MCColumnType clmTyp = MCColumnType.NUMBER;
					MCMeta metaClm = MCMeta.createNumberMeta(nm, nm, 21, 8, true);
					c = beansFactory.createTableColumn("DispDtl." + nm, clmTyp);
					c.setMeta(metaClm);
					c.addAllListener(MGBDP_PreAlcChk_MC.this);
					c.setListListener(MGBDP_PreAlcChk_MC.this);
					DispDtlTable.addColumnConfig(c);
					_ccList.add(c);
					cc.putColumnBG(c, _expnsSrchRsltColor); // 色付け
					cg[1].add(c); // カラムグループへの追加
				}
				String header = nvl(r.dpt_nm(), r.dpt_cd());
				c.setHeaderName(header);
				c.setHeaderMessage(header);
				c.putMode(MGBDP_PreAlcChk_MC.this, REF, MCMode.READ_ONLY);
			}

			// 以前追加して余ったカラムは見えなくする（カラムグループから削除できないため）
			for (int i = size; i < _ccList.size(); i++) {
				String nm = "col_" + i;

				MCColumnConfig c = DispDtlTable.getColumnConfig("DispDtl." + nm);
				c.putMode(MGBDP_PreAlcChk_MC.this, REF, MCMode.INVISIBLE);
			}

			DispDtlTable.updateResource();
			DispDtlTable.initialized();
			super.show();
			
			// コンポーネントを動的に追加しているため、呼び出す必要がある
			DispDtlTable.validate();
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
	 * Panel[Cnd]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doCnd_select_all(MCEventInfo info) {
		setBoolean(TtlPanel, true);
	}

	/**
	 * Panel[Cnd]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_deselect_all(MCEventInfo info) {
		setBoolean(TtlPanel, false);
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBDL0250_Srch01();
	}

	@Override
	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		if (_cndR.pre_alc_lvl_flg()) {
			return super.sort(table, policy);
		}
		else {
			return sortWithoutBottom(table, policy);
		}
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	
	protected void valueInitSub() {
		setValueEx(Cnd_ym_flg, true);
		setValueEx(Cnd_dpt_flg, true);
		setCgLabel();

		// 実装仕様書に用意している動的カラムの最大のカラム番号を取得する
		for (String r : getDispDtlL().getColumnPathArray()) {
			if (r.startsWith("col_") && !isSame(r, "col_all")) {
				int col = Integer.parseInt(r.substring(4, r.length()));
				if (col_max < col) {
					col_max = col;
				}
			}
		}

		displayColumn();
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		setColorInfo();
		MCColumnGroup[] cgs = DispDtlTable.getAllColumnGroups();
		_srcHeaderName = cgs[0].getMessageByLocale();
		_destHeaderName = cgs[1].getMessageByLocale();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		displayColumn();
		FoldTab.focusActiveFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		displayColumn();
		DispDtlTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}

	protected void setCgLabel() {
		MCColumnGroup[] cgs = DispDtlTable.getAllColumnGroups();
		if (isSame(getCndR().ope(), Cnd_ope_DEST.getActionCommand())) {
			cgs[0].setHeaderName(_srcHeaderName);
			cgs[0].setHeaderMessage(_srcHeaderName);
			cgs[1].setHeaderName(_destHeaderName);
			cgs[1].setHeaderMessage(_destHeaderName);
		}
		else {
			cgs[0].setHeaderName(_destHeaderName);
			cgs[0].setHeaderMessage(_destHeaderName);
			cgs[1].setHeaderName(_srcHeaderName);
			cgs[1].setHeaderMessage(_srcHeaderName);
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected Set<MCColumnConfig> getCachedVisibleColumnConfigs(MCTable tbl,
			String type) {
		if (tbl == DispDtlTable) {
			// 可変カラムは検索するごとに変わるのでキャッシュしない
			return null;
		}
		return super.getCachedVisibleColumnConfigs(tbl, type);
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		setCgLabel();
		clearNoEvent(DispDtlTable);
		FoldTab.focusActiveFirstComponent();
	}

	protected void setColVisible(MCColumnConfig col, boolean boo) {
		if (boo) {
			setDefaultMode(col);
		}
		else {
			col.setMode(MCMode.INVISIBLE);
		}
	}

	protected void displayColumn() {
		if (isSame(getCndR().ope(), Cnd_ope_DEST.getActionCommand())) {
			setColVisible(columnDispDtl_wg_cd, getCndR().src_wg_flg());
			setColVisible(columnDispDtl_wg_nm, getCndR().src_wg_flg());
			setColVisible(columnDispDtl_alc_ac_cd, getCndR().src_alc_ac_flg());
			setColVisible(columnDispDtl_alc_ac_nm, getCndR().src_alc_ac_flg());
			setColVisible(columnDispDtl_wg_cd2, getCndR().dest_wg_flg());
			setColVisible(columnDispDtl_wg_nm2, getCndR().dest_wg_flg());
			setColVisible(columnDispDtl_alc_ac_cd2, getCndR().dest_alc_ac_flg());
			setColVisible(columnDispDtl_alc_ac_nm2, getCndR().dest_alc_ac_flg());
		}
		else {
			setColVisible(columnDispDtl_wg_cd2, getCndR().src_wg_flg());
			setColVisible(columnDispDtl_wg_nm2, getCndR().src_wg_flg());
			setColVisible(columnDispDtl_alc_ac_cd2, getCndR().src_alc_ac_flg());
			setColVisible(columnDispDtl_alc_ac_nm2, getCndR().src_alc_ac_flg());
			setColVisible(columnDispDtl_wg_cd, getCndR().dest_wg_flg());
			setColVisible(columnDispDtl_wg_nm, getCndR().dest_wg_flg());
			setColVisible(columnDispDtl_alc_ac_cd, getCndR().dest_alc_ac_flg());
			setColVisible(columnDispDtl_alc_ac_nm, getCndR().dest_alc_ac_flg());
		}

		changeColumnMode(DispDtlTable, getCndR(), DispDtlR.$$SHOW);
	}

	@Override
	public void doCnd_itm_typ_flg_NC(MCEventInfo info) {
		super.doCnd_itm_typ_flg_NC(info);
		if (!getCndR().itm_typ_flg()) {
			setValueEx(Cnd_itm_typ_d_flg, false);
		}
	}

	@Override
	public void doCnd_itm_typ_d_flg_NC(MCEventInfo info) {
		super.doCnd_itm_typ_d_flg_NC(info);
		if (getCndR().itm_typ_d_flg()) {
			setValueEx(Cnd_itm_typ_flg, true);
		}
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);

		if (compo == DispDtlTable) {
			doDtl_DC(info);
		}
	}

	protected void doDtl_DC(MCEventInfo info) {
		DispDtlR row = DispDtlTable.getSelectedMCRow();

		if (isNull(row)) {
			return;
		}

		if (isOpen(row)) {
			openMCBDP0260();
		}
	}

	protected boolean isOpen(DispDtlR row) {
		if (row.getBooleanNE("sum_flg") || row.getBooleanNE("ttl_flg")) {
			return false;
		}
		if (_cndR.pre_alc_lvl_flg() && !isSame(row.pre_alc_lvl(), MCNumber.ZERO)) {
			return false;
		}
		return true;
	}
	
	protected void openMCBDP0260() {
		DispDtlR row = DispDtlTable.getSelectedMCRow();
		mcframe.clientMGBD.MGBDP0260.CndR bind = mcframe.clientMGBD.MGBDP0260.CndR.create();
		bind.calc_grp_cd(_cndR.calc_grp_cd());
		// 計算ＮＯ複数指定時は引き継がない（引き継げない）
		if (MCStringUtil.arrayValueSplit(_cndR.calc_no()).length == 1) {
			bind.calc_no(_cndR.calc_no());
		}
		bind.wg_cd(row.wg_cd());
		bind.ym_fr(row.ym());
		bind.ym_to(row.ym());
		bind.alc_ac_cd(row.alc_ac_cd());
		bind.dpt_cd(row.dpt_cd());
		bind.dpt_nm(row.dpt_nm());
		bind.loc_cd(row.loc_cd());
		bind.oper_cd(row.oper_cd());
		bind.bp_cd(row.bp_cd());
		bind.ctg_cd(row.ctg_cd());
		bind.itm_cd(row.itm_cd());
		bind.itm_sub1(row.itm_sub1());
		bind.itm_sub2(row.itm_sub2());
		bind.itm_sub3(row.itm_sub3());
		bind.lot_no(row.lot_no());
		bind.sublot_no(row.sublot_no());
		bind.sno1(row.sno1());
		bind.sno2(row.sno2());
		bind.sno3(row.sno3());
		bind.sno4(row.sno4());
		bind.itm_mfg_inst_no(row.itm_mfg_inst_no());
		bind.iv_no(row.iv_no());
		bind.po_no(row.po_no());
		bind.slo_no(row.slo_no());
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBDP0260");
		so.putCnd(bind);
		so.runValueInit();
		if (!isNull(bind.calc_no())) {
			so.putSearchAction();
		}
		so.show();
	}

	protected class TableCellConfig extends MGUDP_CellConfig {
		@SuppressWarnings("rawtypes")
		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table,
				MCMode mode) {
			if (getDispDtlL().get(index).getBooleanNE("sum_flg")) {
				return _expnsTtlColor;
			}
			else if (getDispDtlL().get(index).getBooleanNE("ttl_flg")) {
				return _vTtlColor;
			}
			return super.getPriorBG(index, column, table, mode);
		}

		@Override
		public boolean isAmtColumn(MCColumnConfig column) {
			return column == columnDispDtl_ttl || _ccList.contains(column);
		}

		@Override
		protected MCNumber getAmtDecPlace(int index, MCColumnConfig config) {
			return getBaseCur().amt_dec_place();
		}
	}

	protected TableCellConfig createTableCellConfig() {
		return new TableCellConfig();
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DispDtlTable.setCellConfig(createTableCellConfig());
	}

	protected void setColorInfo() {
		TableCellConfig cc = (TableCellConfig) DispDtlTable.getCellConfig();

		Color hTtlColor = getHTtlColor(this);

		for (MCColumnConfig c : DispDtlTable.getColumnConfigs()) {
			if (c == columnDispDtl_ttl) {
				cc.putColumnBG(c, hTtlColor);
			}
			else {
				cc.putColumnBG(c, _expnsSrchRsltColor);
			}
		}
	}

}