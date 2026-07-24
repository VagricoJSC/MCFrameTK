package mcframe.clientMGBD.MGBDP0100;

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
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import mcframe.clientMGUC.MGUCP0040.MGUCP_VHConverter;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBDP_ExpCalcSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_ExpCalcSrch_MC extends MGBDP_ExpCalcSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	/** 可変カラム名称(qty_xx)の桁数 */
	protected int _DTL_COL_SCALE = 2;
	/** 可変カラムの数 */
	protected int _dtl_col_num = 0;
	/** 縦横変換ユーティリティ */
	protected MGUCP_VHConverter<RsltR, DispRsltR> _vh = new MGUCP_VHConverter<RsltR, DispRsltR>();

	/** キー項目表示オフの場合にセルの文字の色を背景色と同じにするカラムのリスト */
	protected ArrayList<MCColumnConfig> _revFgCtrlColumnConfigs;
	/** 数量種類の情報(String[] {[項目], [項目名ラベル], [数量カラム名]}) */
	protected ArrayList<String[]> _qtyList;
	/** 検索時の検索条件（画面遷移用に検索時点の条件を保持） */
	protected CndR _cndR;
	/** 表示最上位行 */
	protected int _topIndex;
	/** 表示チェック数 */
	protected int _dispOn;
	/** 表示リストのキャッシュ */
	protected MCList<DispRsltR> _cacheDispRsltL = MCList.create(DispRsltR.class);

	/** 各キーの先頭行の色 */
	protected Color _topColor = getTopColor(this);
	/** 一覧行の色 */
	protected Color _tblColor = getExpnsSrchRsltColor(this);
	protected MCList<RsltR> _keyIdxList = MCList.create(RsltR.class);
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_ExpCalcSrch_MC() {
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
	public MGBDP_ExpCalcSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBDL0100_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0100_Srch01Caller<P extends MGBDP_ExpCalcSrch, B extends MG_MGBDL0100_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0100_Srch01Caller(P p, B b) {
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
		protected void clear() {
			super.clear();
			//裏リストクリア
			clearHiddenList();
		}

		@Override
		protected void show() {
			super.show();

			// 表示裏リストにキャッシュ
			_cacheDispRsltL.addAll(getDispRsltL());
			// 一覧表示
			dispChange();
		}

		@Override
		protected void showReplaceSub() {
			super.showReplaceSub();
			//縦横変換して一覧に表示する
			showDispRslt(bridge.down0(), bridge.down1());
		}

		/** 表示用のテーブルにデータをセットする */
		protected void showDispRslt(MCList<RsltR> down0, Rslt2R down1) {

			// 検索時点の条件を保持
			_cndR = getCndR().clone();

			// 年月情報(横展開のキー)を作成する
			MCList<RsltR> ymList = _vh.createElmListForYM(down1.st_ym(), down1.end_ym());

			// 可変カラム情報設定
			_vh.initColInfo(_DTL_COL_SCALE, ymList.size(), ymList, 0, _dtl_col_num);
			// 縦横変換処理
			_vh.createHList(editVList(down0));
			// 合計を計算
			_vh.calcElmColTtlAll(DispRsltR.$ttl);
			// 可変カラムのヘッダラベル設定
			_vh.setElmColsLabelForYM(ymList);

		}

		/** 縦リストの編集、縦横変換を行う前に実行される */
		protected MCList<RsltR> editVList(MCList<RsltR> down0) {

			// 表示するキー項目の単位でキーインデックス(key_idx)を設定
			// 縦横変換時のHKEYはkey_idx, elm_no
			int i = 0;
			for(MCList<RsltR> l: down0.groupList(getKeyIdx())) {
				l.setNumber(RsltR.$key_idx, i++);
			}
			_keyIdxList = down0.groupBy(RsltR.$key_idx, RsltR.$base_unit_cd,
					RsltR.$dim_unit_cd, RsltR.$wt_unit_cd, RsltR.$conts_unit_cd,
					RsltR.$bcur_cd);

			// 項目別データ(数量、容積、重量、入り目、金額)を作成する
			MCList<RsltR> list = MCList.create(RsltR.class);
			for (RsltR row : down0) {
				int j = 0;
				for (String[] s: getQtyList()) {
					RsltR itm = row.clone();
					itm.elm_no(j++);
					itm.elm(s[0]);
					itm.elm_nm(s[1]);
					itm.qty(itm.getNumberNE(s[2]));
					itm.unit_cd(itm.getStringNE(s[3]));
					itm.unit_nm(itm.getStringNE(s[4]));
					itm.dec_place(itm.getNumberNE(s[5]));
					list.add(itm);
				}
			}
			return list;
		}

		/** 集計タブに応じた縦横変換時のキー項目 */
		protected String[] getKeyIdx() {
			return getKeysByFlg(RsltR.create(), RsltR.$$SHOW, getCndR()).toArray(new String[0]);
		}

		@Override
		protected void setMode() {
			super.setMode();
			//検索後ステータス
			setRefStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			//検索前ステータス
			setSrchStatus();
		}
	}

	/**
	 * [MG_MGBDL0100_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0100_Ins01Caller<P extends MGBDP_ExpCalcSrch, B extends MG_MGBDL0100_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MG_MGBDL0100_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			//バッチ処理ではステータスチェックはしない
			return false;
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
		callMG_MGBDL0100_Srch01();
	}

	/**
	 * Panel[Btn]のボタン[open_GDP0040]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0110(MCEventInfo info) {
		//工程展開
		DispRsltR r = DispRsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		openMGBDP0110(r);
	}

	/** 工程展開結果一覧照会画面に遷移する */
	protected void openMGBDP0110(DispRsltR r) {
		MAUCP_AppScreenOpener scrnOpnr = getMGBDP0110ScrnOpnr(r);
		scrnOpnr.show();
	}

	/** 遷移先（工程展開結果）検索条件 */
	protected MAUCP_AppScreenOpener getMGBDP0110ScrnOpnr(DispRsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0110");
		mcframe.clientMGBD.MGBDP0110.CndR to = mcframe.clientMGBD.MGBDP0110.CndR.create();

		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());

		to.wg_cd(r.wg_cd());
		to.mng_dpt_cd(r.mng_dpt_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_typ(r.itm_typ());
		to.itm_typ_d_cd(r.itm_typ_d_cd());
		to.itm_jnl_cd(r.itm_jnl_cd());
		to.itm_grp_cd1(r.itm_grp_cd1());
		to.itm_grp_cd2(r.itm_grp_cd2());
		to.itm_grp_cd3(r.itm_grp_cd3());
		to.itm_grp_cd4(r.itm_grp_cd4());
		to.itm_grp_cd5(r.itm_grp_cd5());
		to.itm_grp_cd6(r.itm_grp_cd6());
		to.itm_grp_cd7(r.itm_grp_cd7());
		to.itm_grp_cd8(r.itm_grp_cd8());
		to.itm_grp_cd9(r.itm_grp_cd9());
		to.itm_grp_cd10(r.itm_grp_cd10());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.site_cd(r.site_cd());
		to.loc_cd(r.loc_cd());
		to.asst_typ(r.asst_typ());

		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();

		return aso;
	}

	/**
	 * Panel[Btn]のボタン[open_GDP0060]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0130(MCEventInfo info) {
		//工数展開
		DispRsltR r = DispRsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		openMGBDP0130(r);
	}

	/** 工数展開結果一覧画面に遷移する */
	protected void openMGBDP0130(DispRsltR r) {
		MAUCP_AppScreenOpener scrnOpnr = getMGBDP0130ScrnOpnr(r);
		scrnOpnr.show();
	}

	/** 遷移先（工数展開結果）検索条件 */
	protected MAUCP_AppScreenOpener getMGBDP0130ScrnOpnr(DispRsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0130");
		mcframe.clientMGBD.MGBDP0130.CndR to = mcframe.clientMGBD.MGBDP0130.CndR.create();

		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());

		to.wg_cd(r.wg_cd());
		to.mng_dpt_cd(r.mng_dpt_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_typ(r.itm_typ());
		to.itm_typ_d_cd(r.itm_typ_d_cd());
		to.itm_jnl_cd(r.itm_jnl_cd());
		to.itm_grp_cd1(r.itm_grp_cd1());
		to.itm_grp_cd2(r.itm_grp_cd2());
		to.itm_grp_cd3(r.itm_grp_cd3());
		to.itm_grp_cd4(r.itm_grp_cd4());
		to.itm_grp_cd5(r.itm_grp_cd5());
		to.itm_grp_cd6(r.itm_grp_cd6());
		to.itm_grp_cd7(r.itm_grp_cd7());
		to.itm_grp_cd8(r.itm_grp_cd8());
		to.itm_grp_cd9(r.itm_grp_cd9());
		to.itm_grp_cd10(r.itm_grp_cd10());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.site_cd(r.site_cd());
		to.loc_cd(r.loc_cd());
		to.asst_typ(r.asst_typ());

		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();

		return aso;
	}

	/**
	 * Panel[Btn]のボタン[open_GDP0050]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0120(MCEventInfo info) {
		//投入展開
		DispRsltR r = DispRsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		openMGBDP0120(r, false);
	}

	/**
	 * Panel[Btn]のボタン[open_GDP0050_chd]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0120_chd(MCEventInfo info) {
		//投入展開（子）
		DispRsltR r = DispRsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		openMGBDP0120(r, true);
	}

	/** 投入展開結果一覧画面に遷移する */
	protected void openMGBDP0120(DispRsltR r, boolean child) {
		MAUCP_AppScreenOpener scrnOpnr = getMGBDP0120ScrnOpnr(r, child);
		scrnOpnr.show();
	}

	/** 遷移先（投入展開結果）検索条件 */
	protected MAUCP_AppScreenOpener getMGBDP0120ScrnOpnr(DispRsltR r, boolean child) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0120");
		mcframe.clientMGBD.MGBDP0120.CndR to = mcframe.clientMGBD.MGBDP0120.CndR.create();

		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());

		to.wg_cd(r.wg_cd());
		to.mng_dpt_cd(r.mng_dpt_cd());
		to.asst_typ(r.asst_typ());
		if(!child) {
			to.par_itm_cd(r.itm_cd());
			to.par_itm_sub1(r.itm_sub1());
			to.par_itm_sub2(r.itm_sub2());
			to.par_itm_sub3(r.itm_sub3());
			to.par_itm_nm(r.itm_nm());
			to.par_itm_typ(r.itm_typ());
			to.par_itm_typ_d_cd(r.itm_typ_d_cd());
			to.par_itm_jnl_cd(r.itm_jnl_cd());
			to.par_itm_grp_cd1(r.itm_grp_cd1());
			to.par_itm_grp_cd2(r.itm_grp_cd2());
			to.par_itm_grp_cd3(r.itm_grp_cd3());
			to.par_itm_grp_cd4(r.itm_grp_cd4());
			to.par_itm_grp_cd5(r.itm_grp_cd5());
			to.par_itm_grp_cd6(r.itm_grp_cd6());
			to.par_itm_grp_cd7(r.itm_grp_cd7());
			to.par_itm_grp_cd8(r.itm_grp_cd8());
			to.par_itm_grp_cd9(r.itm_grp_cd9());
			to.par_itm_grp_cd10(r.itm_grp_cd10());
			to.par_lot_no(r.lot_no());
			to.par_sublot_no(r.sublot_no());
			to.par_sno1(r.sno1());
			to.par_sno2(r.sno2());
			to.par_sno3(r.sno3());
			to.par_sno4(r.sno4());
			to.site_cd(r.site_cd());
			to.loc_cd(r.loc_cd());
		}
		else {
			to.itm_cd(r.itm_cd());
			to.itm_sub1(r.itm_sub1());
			to.itm_sub2(r.itm_sub2());
			to.itm_sub3(r.itm_sub3());
			to.itm_nm(r.itm_nm());
			to.itm_typ(r.itm_typ());
			to.itm_typ_d_cd(r.itm_typ_d_cd());
			to.itm_jnl_cd(r.itm_jnl_cd());
			to.itm_grp_cd1(r.itm_grp_cd1());
			to.itm_grp_cd2(r.itm_grp_cd2());
			to.itm_grp_cd3(r.itm_grp_cd3());
			to.itm_grp_cd4(r.itm_grp_cd4());
			to.itm_grp_cd5(r.itm_grp_cd5());
			to.itm_grp_cd6(r.itm_grp_cd6());
			to.itm_grp_cd7(r.itm_grp_cd7());
			to.itm_grp_cd8(r.itm_grp_cd8());
			to.itm_grp_cd9(r.itm_grp_cd9());
			to.itm_grp_cd10(r.itm_grp_cd10());
			to.lot_no(r.lot_no());
			to.sublot_no(r.sublot_no());
			to.sno1(r.sno1());
			to.sno2(r.sno2());
			to.sno3(r.sno3());
			to.sno4(r.sno4());

			// 子品目の場合は場所関連を引継がない
			to.site_cd(null);
			to.loc_cd(null);
		}

		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();

		return aso;
	}

	/**
	 * Panel[Btn]のボタン[open_GAP0030]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBAP0030(MCEventInfo info) {
		//製造計画
		openMGBAP0030(getInsCndR());
	}

	/** 製造計画登録画面に遷移する */
	protected void openMGBAP0030(InsCndR r) {
		MAUCP_AppScreenOpener scrnOpnr = getMGBAP0030ScrnOpnr(r);
		scrnOpnr.show();
	}

	/** 遷移先（製造計画）検索条件 */
	protected MAUCP_AppScreenOpener getMGBAP0030ScrnOpnr(InsCndR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBAP0030");
		mcframe.clientMGBA.MGBAP0030.CndR to = mcframe.clientMGBA.MGBAP0030.CndR.create();
		mcframe.clientMGBA.MGBAP0030.MGBAP_PlnMfgReg p =
				(mcframe.clientMGBA.MGBAP0030.MGBAP_PlnMfgReg) aso.getPanel();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(r.calc_ctg_cd());
		to.wg_cd(r.wg_cd());
		to.ym_fr(r.st_ym());
		to.ym_to(r.end_ym());

		aso.putCnd(to);
		aso.runValueInit();

		return aso;
	}

	/**
	 * Panel[Btn]のボタン[open_GAP0040]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBAP0040(MCEventInfo info) {
		//購買計画
		openMGBAP0040(getInsCndR());
	}

	/** 購買計画登録画面に遷移する */
	protected void openMGBAP0040(InsCndR r) {
		MAUCP_AppScreenOpener scrnOpnr = getMGBAP0040ScrnOpnr(r);
		scrnOpnr.show();
	}

	/** 遷移先（購買計画）検索条件 */
	protected MAUCP_AppScreenOpener getMGBAP0040ScrnOpnr(InsCndR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBAP0040");
		mcframe.clientMGBA.MGBAP0040.CndR to = mcframe.clientMGBA.MGBAP0040.CndR.create();
		mcframe.clientMGBA.MGBAP0040.MGBAP_PlnPurcReg p =
				(mcframe.clientMGBA.MGBAP0040.MGBAP_PlnPurcReg) aso.getPanel();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.calc_ctg_cd(r.calc_ctg_cd());
		to.wg_cd(r.wg_cd());
		to.ym_fr(r.st_ym());
		to.ym_to(r.end_ym());

		aso.putCnd(to);
		aso.runValueInit();

		return aso;
	}

	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMG_MGBDL0100_Ins01();
	}

	/** 項目列の情報(String[] {[項目], [項目名ラベル], [数量カラム名], [単位コードカラム名], [単位名カラム名], [小数部有効桁数カラム名]})を取得する */
	protected ArrayList<String[]> getQtyList() {
		if (_qtyList == null) {
			_qtyList = new ArrayList<>();
			_qtyList.add(new String[] {RsltR.$base_qty, getDispString("label_base_qty"), 
					RsltR.$base_qty, RsltR.$base_unit_cd, RsltR.$base_unit_nm, RsltR.$base_unit_dec_place});
			_qtyList.add(new String[] {RsltR.$dim_qty, getDispString("label_dim_qty"),
					RsltR.$dim_qty, RsltR.$dim_unit_cd, RsltR.$dim_unit_nm, RsltR.$dim_unit_dec_place});
			_qtyList.add(new String[] {RsltR.$wt_qty, getDispString("label_wt_qty"),
					RsltR.$wt_qty, RsltR.$wt_unit_cd, RsltR.$wt_unit_nm, RsltR.$wt_unit_dec_place});
			_qtyList.add(new String[] {RsltR.$conts_qty, getDispString("label_conts_qty"),
					RsltR.$conts_qty, RsltR.$conts_unit_cd, RsltR.$conts_unit_nm, RsltR.$conts_unit_dec_place});
			_qtyList.add(new String[] {RsltR.$amt, getDispString("label_amt"),
					RsltR.$amt, RsltR.$bcur_cd, RsltR.$cur_nm, RsltR.$amt_dec_place});
		}
		return _qtyList;
	}

	protected int getTopIndex() {
		if (getCndR().base_flg()) {
			return 0;
		}
		if (getCndR().dim_flg()) {
			return 1;
		}
		if (getCndR().wt_flg()) {
			return 2;
		}
		if (getCndR().conts_flg()) {
			return 3;
		}
		if (getCndR().amt_flg()) {
			return 4;
		}
		return -1;
	}

	protected int getDispOnCnt() {
		int i = 0;
		if (getCndR().base_flg()) {
			i++;
		}
		if (getCndR().dim_flg()) {
			i++;
		}
		if (getCndR().wt_flg()) {
			i++;
		}
		if (getCndR().conts_flg()) {
			i++;
		}
		if (getCndR().amt_flg()) {
			i++;
		}
		return i;
	}

	/** キー項目表示オフの場合にセルの文字の色を背景色と同じにするカラムのリスト  */
	protected ArrayList<MCColumnConfig> getRevFgCtrlColumnConfigs() {
		if (_revFgCtrlColumnConfigs == null) {
			_revFgCtrlColumnConfigs = getGroupColumnConfigs(DispRsltTable, DispRsltR.$$CLEAR);
		}
		return _revFgCtrlColumnConfigs;
	}

	/** キャッシュリストをクリアする */
	protected void clearHiddenList() {
		_cacheDispRsltL.clear();
		_keyIdxList = MCList.create(RsltR.class);
	}


	// ///////////////////// INIT /////////////////////////////////////////////

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DispRsltTable.setCellConfig(createDispRsltTableCellConfig());
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		setupPartsSub();
	}

	/** 埋め込み画面のセットアップ処理 */
	protected void setupPartsSub() {

		//計算グループと計算ＮＯ部品の連携
		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
		InsCnd_calc_no_p_PPanel.setRelateBeans(InsCnd_calc_grp_cd);

		//数量部品と単位、小数部有効桁数との連携
		DispRslt_ttl_qty_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_00_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_01_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_02_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_03_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_04_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_05_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_06_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_07_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_08_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_09_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_10_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_11_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
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
		DispRsltTable.addSortColumn(columnDispRslt_itm_nm);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd1);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd2);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd3);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd4);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd5);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd6);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd7);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd8);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd9);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd10);
		DispRsltTable.addSortColumn(columnDispRslt_lot_no);
		DispRsltTable.addSortColumn(columnDispRslt_sublot_no);
		DispRsltTable.addSortColumn(columnDispRslt_sno1);
		DispRsltTable.addSortColumn(columnDispRslt_sno2);
		DispRsltTable.addSortColumn(columnDispRslt_sno3);
		DispRsltTable.addSortColumn(columnDispRslt_sno4);
		DispRsltTable.addSortColumn(columnDispRslt_site_cd);
		DispRsltTable.addSortColumn(columnDispRslt_loc_cd);
		DispRsltTable.addSortColumn(columnDispRslt_sppl_cd);
		DispRsltTable.addSortColumn(columnDispRslt_sppl_grp_cd1);
		DispRsltTable.addSortColumn(columnDispRslt_sppl_grp_cd2);
		DispRsltTable.addSortColumn(columnDispRslt_sppl_grp_cd3);
		DispRsltTable.addSortColumn(columnDispRslt_sppl_grp_cd4);
		DispRsltTable.addSortColumn(columnDispRslt_sppl_grp_cd5);
		DispRsltTable.addSortColumn(columnDispRslt_sppl_grp_cd6);
		DispRsltTable.addSortColumn(columnDispRslt_sppl_grp_cd7);
		DispRsltTable.addSortColumn(columnDispRslt_sppl_grp_cd8);
		DispRsltTable.addSortColumn(columnDispRslt_sppl_grp_cd9);
		DispRsltTable.addSortColumn(columnDispRslt_sppl_grp_cd10);
		DispRsltTable.addSortColumn(columnDispRslt_sppl_cntry_cd);
		DispRsltTable.addSortColumn(columnDispRslt_sppl_area_cd);
		DispRsltTable.addSortColumn(columnDispRslt_alc_dpt_cd);
		DispRsltTable.addSortColumn(columnDispRslt_asst_typ);
		DispRsltTable.addSortColumn(columnDispRslt_key_idx);
		DispRsltTable.addSortColumn(columnDispRslt_elm_no);
	}

	@Override
	public void mcInitStatus() {
		initVhInfo();
		super.mcInitStatus();
	}

	/** VHConverterの初期化 */
	protected void initVhInfo() {
		// カラムコンフィグを設定する
		if (_vh.getConfs() == null) {
			// 可変カラムのみをVHに設定する
			DispRsltR proto = DispRsltR.create();
			Map<String, String> map = proto.getExtMap(DispRsltR.$$ELM);
			List<MCColumnConfig> confs = new ArrayList<MCColumnConfig>();
			for (MCColumnConfig conf : DispRsltTable.getColumnConfigs()) {
				if (map.get(conf.getBaseRowColumnName()) != null) {
					confs.add(conf);
					_dtl_col_num++;
				}
			}
			_vh.setConfs(confs.toArray(new MCColumnConfig[0]));
		}

		// RsltRでグループ化された項目情報（ELM,HVAL,HKEY,OTHER）を設定
		_vh.initColGroup(DispRsltTable, getRsltL());
		// カラム情報作成
		_vh.initColInfo(_DTL_COL_SCALE, 0, null, 0, _dtl_col_num);
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		// 色の設定
		setColorInfo();
	}

	/**
	 * テーブルの配色を設定する
	 */
	protected void setColorInfo() {
		MAUDP_CellConfig cc = (MAUDP_CellConfig) DispRsltTable.getCellConfig();
		cc.putColumnBG(DispRsltTable.getAllColumnConfigs(), _tblColor);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		//集計タブの初期条件
		setValueEx(Cnd_itm_flg, true);
		setValueEx(Cnd_itm_typ_flg, true);
		setValueEx(Cnd_itm_typ_d_flg, true);
		setValueEx(Cnd_itm_jnl_flg, true);
		setValueEx(Cnd_loc_flg, true);
		setValueEx(Cnd_sppl_flg, true);

		//取込タブの初期条件
		setValueEx(InsCnd_mfg_flg, true);
		setValueEx(InsCnd_purc_flg, true);

		//表示条件の初期条件
		setValueEx(Cnd_base_flg, true);

		initCalcCtg();

		displayColumn();
	}

	/** デフォルト計算カテゴリを初期表示する */
	protected void initCalcCtg() {
		if (Cnd_ope_INS.isSelected()) {
			setDefCalcCtg(InsCnd_calc_ctg_cd);
		}
	}


	// ///////////////////// NotificationChange イベント///////////////////////////

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		// 種別切替時には一覧をクリアする
		clearContainers(getDispRsltL());
		clearHiddenList();

		initCalcCtg();
		// 計画反映タブに計算Ｇ・計算ＮＯをコピーする
		if (Cnd_ope_INS.isSelected()) {
			copyComboValue(Cnd_calc_grp_cd, InsCnd_calc_grp_cd);
			copyComboValue(Cnd_calc_no, InsCnd_calc_no);
		}

		setSrchStatus();
	}

	/** fromからtoへコンボの値をコピーする */
	protected void copyComboValue(MCTextComboBox src, MCTextComboBox dest) {
		String srcVal = src.getValue();
		String destVal = dest.getValue();
		if (!isNull(srcVal) && !isSame(destVal, srcVal)) {
			setValueEx(dest, srcVal);
		}
	}

	@Override
	public void doCnd_no_loc_flg_NC(MCEventInfo info) {
		super.doCnd_no_loc_flg_NC(info);
		if (getCndR().no_loc_flg()) {
			setValueEx(Cnd_loc_cd, null);
			setValueEx(Cnd_loc_nm, null);
		}
	}

	@Override
	public void doCnd_no_sppl_flg_NC(MCEventInfo info) {
		super.doCnd_no_sppl_flg_NC(info);
		if (getCndR().no_sppl_flg()) {
			setValueEx(Cnd_sppl_cd, null);
			setValueEx(Cnd_sppl_nm, null);
		}
	}

	@Override
	public void doCnd_itm_typ_flg_NC(MCEventInfo info) {
		super.doCnd_itm_typ_flg_NC(info);
		// 品目区分をオフとしたら品目区分詳細もオフとする
		if (!getCndR().itm_typ_flg() && getCndR().itm_typ_d_flg()) {
			setValueEx(Cnd_itm_typ_d_flg, false);
		}
	}

	@Override
	public void doCnd_itm_typ_d_flg_NC(MCEventInfo info) {
		super.doCnd_itm_typ_d_flg_NC(info);
		// 品目区分詳細をオンにしたら品目区分もオンとする
		if (getCndR().itm_typ_d_flg() && !getCndR().itm_typ_flg()) {
			setValueEx(Cnd_itm_typ_flg, true);
		}
	}

	@Override
	public void doCnd_base_flg_NC(MCEventInfo info) {
		super.doCnd_base_flg_NC(info);
		changeDispFlg(info);
	}

	@Override
	public void doCnd_dim_flg_NC(MCEventInfo info) {
		super.doCnd_dim_flg_NC(info);
		changeDispFlg(info);
	}

	@Override
	public void doCnd_wt_flg_NC(MCEventInfo info) {
		super.doCnd_wt_flg_NC(info);
		changeDispFlg(info);
	}

	@Override
	public void doCnd_conts_flg_NC(MCEventInfo info) {
		super.doCnd_conts_flg_NC(info);
		changeDispFlg(info);
	}

	@Override
	public void doCnd_amt_flg_NC(MCEventInfo info) {
		super.doCnd_amt_flg_NC(info);
		changeDispFlg(info);
	}

	protected void changeDispFlg(MCEventInfo info) {
		if(!getCndR().base_flg()
				&& !getCndR().dim_flg()
				&& !getCndR().wt_flg()
				&& !getCndR().conts_flg()
				&& !getCndR().amt_flg()) {
			setValueEx(Cnd_base_flg, true);
		}

		dispChange();
	}

	protected void dispChange() {
		getDispRsltL().setAll(getNewList());
		DispRsltTable.sort();
		DispRsltTable.adjustAllWidth();
		_topIndex = getTopIndex();
		_dispOn = getDispOnCnt();
	}
	protected MCList<DispRsltR> getNewList() {
		MCList<DispRsltR> oldList = _cacheDispRsltL.subList(r -> isDisp(r));
		// 全ての項目を表示する場合は再集計の必要なし
		if (isSame(getDispOnCnt(),5)) {
			return oldList;
		}
		// 表示する項目の単位がすべて同じなら、key_idxを同じ（最小値）にして集計する
		MCIndexKey oldKey = oldList.createIndex(DispRsltR.$key_idx);
		MCList<DispRsltR> newList = MCList.create(DispRsltR.class); 
		for (MCList<RsltR> l : _keyIdxList.groupList(getDispUnit())) {
			MCNumber keyIdx = (MCNumber) l.min(RsltR.$key_idx);
			for (RsltR r : l) {
				for(DispRsltR oldR : oldList.subList(oldKey, r.key_idx())) {
					DispRsltR newR = oldR.clone();
					newR.key_idx(keyIdx);
					newList.add(newR);
				}
			}
		}
		MCGroupByPolicy policy = new MCGroupByPolicy(getNewListKey());
		policy.sum(getNewSumCol());
		newList = newList.groupBy(policy);
		return newList;
	}
	protected String[] getDispUnit() {
		List<String> temp = new ArrayList<String>();
		if (getCndR().base_flg()) {
			temp.add(RsltR.$base_unit_cd);
		}
		if (getCndR().dim_flg()) {
			temp.add(RsltR.$dim_unit_cd);
		}
		if (getCndR().wt_flg()) {
			temp.add(RsltR.$wt_unit_cd);
		}
		if (getCndR().conts_flg()) {
			temp.add(RsltR.$conts_unit_cd);
		}
		if (getCndR().amt_flg()) {
			temp.add(RsltR.$bcur_cd);
		}
		return temp.toArray(new String[0]);
	}
	protected String[] getNewListKey() {
		List<String> temp = getKeysByFlg(DispRsltR.create(), DispRsltR.$$SHOW, getCndR());
		temp.add(DispRsltR.$dec_place);
		temp.add(DispRsltR.$key_idx);
		temp.add(DispRsltR.$elm_no);
		temp.add(DispRsltR.$elm);
		temp.add(DispRsltR.$elm_nm);
		temp.add(DispRsltR.$unit_cd);
		temp.add(DispRsltR.$unit_nm);
		return temp.toArray(new String[0]);
	}
	protected String[] getNewSumCol() {
		List<String> temp = new ArrayList<>(Arrays.asList(_vh.getElmCols()));
		temp.add(DispRsltR.$ttl);
		return temp.toArray(new String[0]);
	}

	protected boolean isDisp(DispRsltR r) {
		if (getCndR().base_flg() && isSame(r.elm_no(), 0)) {
			return true;
		}
		else if (getCndR().dim_flg() && isSame(r.elm_no(), 1)) {
			return true;
		}
		else if (getCndR().wt_flg() && isSame(r.elm_no(), 2)) {
			return true;
		}
		else if (getCndR().conts_flg() && isSame(r.elm_no(), 3)) {
			return true;
		}
		else if (getCndR().amt_flg() && isSame(r.elm_no(), 4)) {
			return true;
		}
		return false;
	}

	@Override
	public void doDispRslt_NC(MCEventInfo info) {
		super.doDispRslt_NC(info);
		setBtnMode();
	}

	@Override
	public void doCnd_loc_nm_NC(MCEventInfo info) {
		super.doCnd_loc_nm_NC(info);
		if (!isNull(getCndR().loc_nm())) {
			setValueEx(Cnd_no_loc_flg, false);
		}
	}

	@Override
	public void doCnd_sppl_nm_NC(MCEventInfo info) {
		super.doCnd_sppl_nm_NC(info);
		if (!isNull(getCndR().sppl_nm())) {
			setValueEx(Cnd_no_sppl_flg, false);
		}
	}


	// ///////////////////// ListChanged イベント//////////////////////////////////

	@Override
	public void doCnd_loc_cd_LC(MCEventInfo info) {
		super.doCnd_loc_cd_LC(info);
		if (!isNull(getCndR().loc_cd())) {
			setValueEx(Cnd_no_loc_flg, false);
		}
	}

	@Override
	public void doCnd_sppl_cd_LC(MCEventInfo info) {
		super.doCnd_sppl_cd_LC(info);
		if (!isNull(getCndR().sppl_cd())) {
			setValueEx(Cnd_no_sppl_flg, false);
		}
	}


	// ///////////////////// DoubleClicked イベント ///////////////////////////////

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		int idx = info.getEventIndex();
		if (compo == DispRsltTable && idx > -1) {
			DispRsltR r = getDispRsltL().get(idx);
			if (isEnableBtn_open_MGBDP0110(r)) {
				openMGBDP0110(r);
			}
		}
	}


	// ///////////////////// POPUP ////////////////////////////////////////////

	@Override
	protected Set<MCColumnConfig> getCachedVisibleColumnConfigs(MCTable tbl, String type) {
		if (tbl == DispRsltTable) {
			// 動的に変わるので、キャッシュしない。
			return null;
		}
		return super.getCachedVisibleColumnConfigs(tbl, type);
	}

	@Override
	protected void customVisibleColumnConfigs(MCTable table, String type, Set<MCColumnConfig> confSet) {
		if (table == DispRsltTable) {
			// ポップアップで非表示にしたカラムが表示されるのを防ぐ
			confSet.removeAll(Arrays.asList(_vh.getConfs()));
			confSet.addAll(Arrays.asList(_vh.getConfs()).subList(0, _vh.getViewSize()));
			if (!confSet.contains(columnDispRslt_ttl)) {
				confSet.add(columnDispRslt_ttl);
			}
			if (isSame(SORT_ORDER_PANEL, type)) {
				confSet.add(columnDispRslt_key_idx);
				confSet.add(columnDispRslt_elm_no);
			}
		}
		super.customVisibleColumnConfigs(table, type, confSet);
	}


	// ///////////////////// List Logic ///////////////////////////////////////

	/** 表示資産区分 */
	protected MAC_ASST_TYP[] getDispAsstTyp(MCEventInfo info) {
		return new MAC_ASST_TYP[] {
				MAC_ASST_TYP.CO_PROD,
				MAC_ASST_TYP.CO_SLS};
	}

	@Override
	public MCList getCnd_asst_typ(MCRow row, MCEventInfo info){
		addListLogicCnd(row, getDispAsstTyp(info));
		return super.getCnd_asst_typ(row, info);
	}


	// ///////////////////// ClearScreen //////////////////////////////////////

	@Override
	public void screenClearBody() {
		super.screenClearBody();
		clearHiddenList();
	}


	// ///////////////////// Status ///////////////////////////////////////////

	/** 検索前ステータスに設定する */
	protected void setSrchStatus() {
		if (Cnd_ope_REF.isSelected()) {
			setSRCHStatus();
		}
		else if (Cnd_ope_INS.isSelected()) {
			setINSStatus();
		}

		// 検索枠を開く
		Ctrl_ctrl_PPanel.expand(true);
	}

	/** 検索後ステータスに設定する */
	protected void setRefStatus() {
		if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}

		// 検索枠を閉じる
		Ctrl_ctrl_PPanel.expand(false);
	}

	/** 参照ステータスであるかどうかを返す */
	protected boolean isRefStatus() {
		return isSame(getStatus(), REF);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setStatusCom();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setStatusCom();
	}

	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setStatusCom();
	}

	protected void setStatusCom() {
		displayColumn();
		displayVHColumn();
		setTabMode();
		setFocus();
		setBtnMode();
	}

	/** 集計タブにより表示されない項目を非表示にする */
	protected void displayColumn() {
		changeColumnMode(DispRsltTable, getCndR(), DispRsltR.$$SHOW);
	}

	/** 使用しない可変カラムを非表示にする */
	protected void displayVHColumn() {
		if(isRefStatus()) {
			_vh.setReadOnlyStatus();
		}
		else {
			_vh.setInvisibleColumnAll();
		}
	}

	/** 種別に応じて検索タブの活性／非活性を設定する */
	protected void setTabMode() {
		if(Cnd_ope_INS.isSelected()) {
			setTabComponentEnable(FoldTab, Tab5Panel);
		}
		else {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel, Tab3Panel, Tab4Panel);
		}
	}

	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			FoldTab.focusActiveFirstComponent();
		}
		else {
			DispRsltTable.selectLeftmostColumn(0);
		}
	}

	/** ボタンの押下モードの設定 */
	protected void setBtnMode() {
		DispRsltR r = DispRsltTable.getSelectedMCRow();
		// 画面遷移ボタン
		if(isRefStatus()){
			//工程展開
			setBtnModeByFlg(Btn_open_MGBDP0110, isEnableBtn_open_MGBDP0110(r));
			//工数展開
			setBtnModeByFlg(Btn_open_MGBDP0130, isEnableBtn_open_MGBDP0130(r));
			//投入展開（親）
			setBtnModeByFlg(Btn_open_MGBDP0120, isEnableBtn_open_MGBDP0120(r, false));
			//投入展開（子）
			setBtnModeByFlg(Btn_open_MGBDP0120_chd, isEnableBtn_open_MGBDP0120(r, true));
		}
	}

	/** 工程展開画面に遷移できるか */
	protected boolean isEnableBtn_open_MGBDP0110(DispRsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	/** 工数展開画面に遷移できるか */
	protected boolean isEnableBtn_open_MGBDP0130(DispRsltR r) {
		if (r == null) {
			return false;
		}
		return isWkCalc();
	}

	/** 投入展開画面に遷移できるか */
	protected boolean isEnableBtn_open_MGBDP0120(DispRsltR r, boolean child) {
		if (r == null) {
			return false;
		}
		return isInptCalc();
	}

	protected boolean isWkCalc() {
		return _cndR != null && _cndR.wk_calc_flg();
	}

	protected boolean isInptCalc() {
		return _cndR != null && _cndR.inpt_calc_flg();
	}


	// ///////////////////// CellConfig ///////////////////////////////////////

	protected DispRsltTableCellConfig createDispRsltTableCellConfig() {
		return new DispRsltTableCellConfig();
	}

	protected class DispRsltTableCellConfig extends MGUDP_CellConfig {

		// 一覧の各キー先頭行色の設定
		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
			DispRsltR row = (DispRsltR) table.getBaseTable().getRow(index);
			if (_dispOn > 1 && isTopRow(row)) {
				return _topColor;
			}
			return super.getPriorBG(index, column, table, mode);
		}

		// 一覧の文字色設定
		@Override
		public Boolean getPriorReverseFG(int index, MCColumnConfig column, MCTable<?> table, MCMode mode) {
			DispRsltR r = (DispRsltR) table.getBaseTable().getRow(index);
			if (!getCndR().disp_key() && !isTopRow(r) && getRevFgCtrlColumnConfigs().contains(column)) {
				return true;
			}
			return null;
		}

		/** 表示最上位行であるかを返す */
		protected boolean isTopRow(DispRsltR r) {
			return  isSame(r.elm_no(), _topIndex);
		}
	}

}