package mcframe.clientMGBD.MGBDP0140;

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
import mcframe.clientMAUB.MAUBP5040.*;
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
import java.util.Map;
import java.util.Set;
import java.util.Arrays;

import mcframe.clientMGUC.MGUCP0040.MGUCP_VHConverter;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBDP_ExpProvSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_ExpProvSrch_MC extends MGBDP_ExpProvSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** 可変カラム名称(col_xx)の桁数 */
	protected int _SCALE = 2;
	/** 可変カラムの数 */
	protected int _DTL_COL_NUM = 0;
	/** 可変カラムの開始位置 */
	protected int _DTL_COL_S = 0;
	/** 縦横変換ユーティリティ */
	protected MGUCP_VHConverter<RsltR, DispRsltR> _vh = new MGUCP_VHConverter<RsltR, DispRsltR>();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_ExpProvSrch_MC() {
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
	public MGBDP_ExpProvSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBDL0140_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0140_Srch01Caller<P extends MGBDP_ExpProvSrch, B extends MG_MGBDL0140_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0140_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			addDownContainer(getDispRsltL());
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

			_vh.setInvisibleColumnAll();
			_vh.initColInfo(_SCALE, 0, null, _DTL_COL_S, _DTL_COL_NUM);
		}

		@Override
		protected void showReplaceSub() {
			// 項目情報設定
			_vh.initColGroup(DispRsltTable, getRsltL());
			// 年月情報(横展開のキー)を作成
			MCList<RsltR> ymList = _vh.createElmListForYM(getHdrR().st_ym(), getHdrR().end_ym());
			// カラム情報作成
			_vh.initColInfo(_SCALE, ymList.size() * 2, ymList, _DTL_COL_S, _DTL_COL_NUM);
			setHeaderLabel(ymList);
			_vh.setReadOnlyStatus();
			// 縦横変換
			_vh.createHList(getRsltL());

			setSumRow(ymList);
		}

		protected void setSumRow(MCList<RsltR> ymList) {
			for (DispRsltR r : getDispRsltL()) {
				MCNumber qty = MCNumber.ZERO, ttl = MCNumber.ZERO;
				for (int i = 0; i < ymList.size(); i++) {
					qty = sum(qty, r.getNumber(getColNm(i*2)));
					ttl = sum(ttl, r.getNumber(getColNm(i*2+1)));
				}
				r.qty(qty);
				r.ttl(ttl);
			}
			// 合計行挿入
			MCGroupByPolicy policy = new MCGroupByPolicy();
			String[] sumCols = DispRsltR.create().getKeys(DispRsltR.$$OTHER)
					.toArray(new String[0]);
			policy.sum(sumCols);
			DispRsltR sumRow = getDispRsltL().groupBy(policy).get(0);
			for (String nm : sumCols) {
				if (isNull(sumRow.getValueNE(nm))) {
					sumRow.setValue(nm, MCNumber.ZERO);
				}
			}
			getDispRsltL().add(sumRow);
			
		}
		protected String getColNm(int i) {
			return "col_" + lpad(String.valueOf(i), _SCALE, "0");
		}

		protected void setHeaderLabel(MCList<RsltR> l) {
			MCColumnGroup[] cgs = DispRsltTable.getAllColumnGroups();
			for (int i = 0; i < l.size(); i++) {
				String lbl = toYMHeaderLabel(panel, l.get(i).ym());
				cgs[i + 1].setHeaderName(lbl);
				String msg = toYMHeaderMessage(panel, l.get(i).ym());
				cgs[i + 1].setHeaderMessage(msg);
			}
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
		callMG_MGBDL0140_Srch01();
	}

	// -----------------------------------------------
	// init-parts
	@Override
	protected void setupParts() {
		super.setupParts();

		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);

		DispRslt_qty_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_00_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_02_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_04_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_06_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_08_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_10_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_12_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_14_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_16_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_18_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_20_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_22_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
	}

	// -----------------------------------------------
	// init-screen
	@Override
	public void mcInitStatus() {
		super.mcInitStatus();
		initVhInfo();
	}

	/**
	 * VHConverterの初期化
	 */
	protected void initVhInfo() {
		if (_vh.getConfs() == null) {
			DispRsltR proto = DispRsltR.create();
			Map<String, String> map = proto.getExtMap(DispRsltR.$$ELM);
			ArrayList<MCColumnConfig> confs = new ArrayList<MCColumnConfig>();
			for (MCColumnConfig conf : DispRsltTable.getColumnConfigs()) {
				String val = map.get(conf.getBaseRowColumnName());
				if (val != null) {
					confs.add(conf);
					_DTL_COL_NUM = _DTL_COL_NUM + 1;
				}
			}
			_vh.setConfs(confs.toArray(new MCColumnConfig[0]));
		}
		_vh.initColInfo(_SCALE, 0, null, _DTL_COL_S, _DTL_COL_NUM);
		_vh.setInvisibleColumn();
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		setColorInfo();
	}

	protected void setColorInfo() {
		MGUDP_CellConfig cc = (MGUDP_CellConfig) DispRsltTable.getCellConfig();
		cc.putColumnBG(DispRsltTable.getColumnConfigs(), getBgOtherColor(this));
		cc.putColumnBG(columnDispRslt_qty, getAllTtlColor(this));
		cc.putColumnBG(columnDispRslt_ttl, getAllTtlColor(this));
	}

	@Override
	protected Set<MCColumnConfig> getCachedVisibleColumnConfigs(MCTable tbl, String type) {
		if (tbl == DispRsltTable) {
			// 可変カラムは検索するごとに変わるのでキャッシュしない
			return null;
		}
		return super.getCachedVisibleColumnConfigs(tbl, type);
	}

	@Override
	protected void customVisibleColumnConfigs(MCTable table, String type,
			Set<MCColumnConfig> confSet) {
		if (table == DispRsltTable) {
			// 可変カラムの部分を再設定する
			confSet.removeAll(Arrays.asList(_vh.getConfs()));
			confSet.addAll(Arrays.asList(_vh.getConfs()).subList(0, _vh.getViewSize()));
		}
		super.customVisibleColumnConfigs(table, type, confSet);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		setValueEx(Cnd_prsppl_flg, true);
		setValueEx(Cnd_prov_flg, true);
		displayColumn();
	}

	@Override
	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		return sortWithoutBottom(table, policy);
	}

	@Override
	protected void setSortColumn() {
		super.setSortColumn();
		DispRsltTable.addSortColumn(columnDispRslt_wg_cd);
		DispRsltTable.addSortColumn(columnDispRslt_mng_dpt_cd);
		DispRsltTable.addSortColumn(columnDispRslt_itm_typ);
		DispRsltTable.addSortColumn(columnDispRslt_itm_typ_d_cd);
		DispRsltTable.addSortColumn(columnDispRslt_itm_jnl_cd);
		DispRsltTable.addSortColumn(columnDispRslt_itm_cd);
		DispRsltTable.addSortColumn(columnDispRslt_itm_sub1);
		DispRsltTable.addSortColumn(columnDispRslt_itm_sub2);
		DispRsltTable.addSortColumn(columnDispRslt_itm_sub3);
		DispRsltTable.addSortColumn(columnDispRslt_lot_no);
		DispRsltTable.addSortColumn(columnDispRslt_sublot_no);
		DispRsltTable.addSortColumn(columnDispRslt_sno1);
		DispRsltTable.addSortColumn(columnDispRslt_sno2);
		DispRsltTable.addSortColumn(columnDispRslt_sno3);
		DispRsltTable.addSortColumn(columnDispRslt_sno4);
		DispRsltTable.addSortColumn(columnDispRslt_prsppl_cd);
		DispRsltTable.addSortColumn(columnDispRslt_prov_typ);
	}

	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		setREFStatus();
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		displayColumn();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		displayColumn();
		DispRsltTable.selectLeftmostColumn(0);
	}

	// -----------------------------------------------
	// Display
	protected void displayColumn() {
		changeColumnMode(DispRsltTable, getCndR(), RsltR.$$SHOW);
		_vh.setReadOnlyStatus();
		DispRsltTable.adjustWidth();
	}

	// -----------------------------------------------
	// CellConfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DispRsltTable.setCellConfig(createDispRsltCellConfig());
	}

	protected DispRsltCellConfig createDispRsltCellConfig() {
		return new DispRsltCellConfig();
	}

	protected Color _ttlColor = getVTtlColor(this);

	protected class DispRsltCellConfig extends MGUDP_CellConfig {

		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table,
				MCMode mode) {
			if (index == getDispRsltL().size() - 1) {
				return _ttlColor;
			}
			return super.getPriorBG(index, column, table, mode);
		}
	}

}