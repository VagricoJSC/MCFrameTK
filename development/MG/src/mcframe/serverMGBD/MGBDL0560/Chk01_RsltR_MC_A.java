package mcframe.serverMGBD.MGBDL0560;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Chk01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_RsltR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	public static final String $dbc = "dbc";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_nm = "calc_ctg_nm";
	/**
	 * Term name 期名称.<p>
	 *
	 */
	public static final String $term_nm = "term_nm";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public static final String $itm_typ_nm = "itm_typ_nm";
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * WG cd. (Master) ワーキンググループＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $mst_wg_cd = "mst_wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Operation management unit name 工程管理単位名.<p>
	 *
	 */
	public static final String $oper_unit_nm = "oper_unit_nm";
	/**
	 * Rounding type name (Conversion) 換算端数処理区分名.<p>
	 *
	 */
	public static final String $unit_conv_rnd_typ_nm = "unit_conv_rnd_typ_nm";

	public static final String $calc_ctg_cd = $dbc + ".calc_ctg_cd";
	public static final String $term = $dbc + ".term";
	public static final String $itm_cd = $dbc + ".itm_cd";
	public static final String $itm_sub1 = $dbc + ".itm_sub1";
	public static final String $itm_sub2 = $dbc + ".itm_sub2";
	public static final String $itm_sub3 = $dbc + ".itm_sub3";
	public static final String $loc_cd = $dbc + ".loc_cd";
	public static final String $wg_cd = $dbc + ".wg_cd";
	public static final String $oper_ptn = $dbc + ".oper_ptn";
	public static final String $disp_seq = $dbc + ".disp_seq";
	public static final String $oper_cd = $dbc + ".oper_cd";
	public static final String $oper_seq = $dbc + ".oper_seq";
	public static final String $nmr_qty = $dbc + ".nmr_qty";
	public static final String $dnm_qty = $dbc + ".dnm_qty";
	public static final String $yield_oper_flg = $dbc + ".yield_oper_flg";
	public static final String $oper_unit_cd = $dbc + ".oper_unit_cd";
	public static final String $oper_dec_place = $dbc + ".dec_place";
	public static final String $oper_std_qty = $dbc + ".oper_std_qty";
	public static final String $oper_conv_qty = $dbc + ".oper_conv_qty";
	public static final String $unit_conv_rnd_typ = $dbc + ".unit_conv_rnd_typ";
	public static final String $rmrks = $dbc + ".rmrks";
	public static final String $sub_char1 = $dbc + ".sub_char1";
	public static final String $sub_char2 = $dbc + ".sub_char2";
	public static final String $sub_char3 = $dbc + ".sub_char3";
	public static final String $non_calc_flg = $dbc + ".non_calc_flg";
	public static final String $upd_cntr = $dbc + ".upd_cntr";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta dbc_META = createInnerRowMeta($dbc, mcframe.serverMG.dbc.MGT_ITM_OPER_R.class);
	public static final MCMeta calc_ctg_nm_META = createCommonMeta($calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta term_nm_META = createCommonMeta($term_nm, mcframe.commonMA.meta.MA_META.TERM_NM);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta mst_wg_cd_META = createCommonMeta($mst_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta oper_unit_nm_META = createCommonMeta($oper_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta unit_conv_rnd_typ_nm_META = createCommonMeta($unit_conv_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);

	protected static final ConstMetaList<Chk01_RsltR> constMetas = new ConstMetaList<Chk01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			rtn_sts_typ_META,
			dbc_META,
			calc_ctg_nm_META,
			term_nm_META,
			itm_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			loc_nm_META,
			mst_wg_cd_META,
			wg_nm_META,
			oper_nm_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			oper_unit_nm_META,
			unit_conv_rnd_typ_nm_META
		},
		new String[][]{
			{
				"calc_ctg_cd",
				"term",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"loc_cd",
				"wg_cd",
				"oper_ptn",
				"disp_seq",
				"oper_cd",
				"oper_seq",
				"nmr_qty",
				"dnm_qty",
				"yield_oper_flg",
				"oper_unit_cd",
				"oper_dec_place",
				"oper_std_qty",
				"oper_conv_qty",
				"unit_conv_rnd_typ",
				"rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"non_calc_flg",
				"upd_cntr"
			},
			{
				$calc_ctg_cd,
				$term,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$loc_cd,
				$wg_cd,
				$oper_ptn,
				$disp_seq,
				$oper_cd,
				$oper_seq,
				$nmr_qty,
				$dnm_qty,
				$yield_oper_flg,
				$oper_unit_cd,
				$oper_dec_place,
				$oper_std_qty,
				$oper_conv_qty,
				$unit_conv_rnd_typ,
				$rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$non_calc_flg,
				$upd_cntr
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
				{$dbc + ".calc_ctg_cd", "I,U"},	// dbc.calc_ctg_cd
				{$dbc + ".term", "I,U"},	// dbc.term
				{$dbc + ".itm_cd", "I,U"},	// dbc.itm_cd
				{$dbc + ".wg_cd", "I,U"},	// dbc.wg_cd
				{$dbc + ".oper_ptn", "I,U"},	// dbc.oper_ptn
				{$dbc + ".oper_seq", "I,U"}	// dbc.oper_seq
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$dbc + ".disp_seq", "E"},	// dbc.disp_seq
				{$dbc + ".nmr_qty", "E"},	// dbc.nmr_qty
				{$dbc + ".dnm_qty", "E"}	// dbc.dnm_qty
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$dbc + ".disp_seq", "positive"},	// dbc.disp_seq
				{$dbc + ".nmr_qty", "positive"},	// dbc.nmr_qty
				{$dbc + ".dnm_qty", "positive"},	// dbc.dnm_qty
				{$dbc + ".oper_std_qty", "positive"}	// dbc.oper_std_qty
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$dbc + ".oper_seq", "0:"},	// dbc.oper_seq
				{$dbc + ".dec_place", "0:8"},	// dbc.dec_place
				{$dbc + ".oper_conv_qty", "0:"}	// dbc.oper_conv_qty
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
				{$dbc + ".calc_ctg_cd", "Key"},	// dbc.calc_ctg_cd
				{$dbc + ".term", "Key"},	// dbc.term
				{$dbc + ".itm_cd", "Key"},	// dbc.itm_cd
				{$dbc + ".itm_sub1", "Key"},	// dbc.itm_sub1
				{$dbc + ".itm_sub2", "Key"},	// dbc.itm_sub2
				{$dbc + ".itm_sub3", "Key"},	// dbc.itm_sub3
				{$dbc + ".loc_cd", "Key"},	// dbc.loc_cd
				{$dbc + ".wg_cd", "Key"},	// dbc.wg_cd
				{$dbc + ".oper_ptn", "Key"},	// dbc.oper_ptn
				{$dbc + ".oper_cd", "Key"},	// dbc.oper_cd
				{$dbc + ".oper_seq", "Key"}	// dbc.oper_seq
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$dbc + ".calc_ctg_cd", "MA.MAUAL0010.CalcCtg"},	// dbc.calc_ctg_cd
				{$dbc + ".term", "MA.MAUAL0010.Term"},	// dbc.term
				{$dbc + ".itm_sub3", "MA.MAUAL0010.ItmSub3"},	// dbc.itm_sub3
				{$dbc + ".loc_cd", "MA.MAUAL0010.Loc"},	// dbc.loc_cd
				{$dbc + ".wg_cd", "MA.MAUAL0010.CostWg"},	// dbc.wg_cd
				{$dbc + ".oper_cd", "MA.MAUAL0010.Oper"},	// dbc.oper_cd
				{$dbc + ".oper_unit_cd", "MA.MAUAL0010.Unit"},	// dbc.oper_unit_cd
				{$itm_jnl_cd, "MA.MAUAL0010.ItmJnl"}	// itm_jnl_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$dbc + ".calc_ctg_cd", "calc_ctg_nm"},	// dbc.calc_ctg_cd
				{$dbc + ".term", "term_nm"},	// dbc.term
				{$dbc + ".itm_sub3", "itm_nm;itm_jnl_cd;unit_cd;unit_nm;dec_place;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm"},	// dbc.itm_sub3
				{$dbc + ".loc_cd", "loc_nm;mst_wg_cd"},	// dbc.loc_cd
				{$dbc + ".wg_cd", "wg_nm"},	// dbc.wg_cd
				{$dbc + ".oper_cd", "oper_nm"},	// dbc.oper_cd
				{$dbc + ".oper_unit_cd", "oper_unit_nm"},	// dbc.oper_unit_cd
				{$itm_jnl_cd, "itm_jnl_nm"}	// itm_jnl_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$dbc + ".loc_cd", "loc_nm;wg_cd"},	// dbc.loc_cd
				{$dbc + ".wg_cd", "wg_nm"},	// dbc.wg_cd
				{$dbc + ".oper_unit_cd", "unit_nm"}	// dbc.oper_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$dbc + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.ASSET1;itm_cd;itm_sub1;itm_sub2;true;true"},	// dbc.itm_sub3
				{$dbc + ".loc_cd", "MAC_LOC_IS_SRCH_TYP.MFG_WG_ALL;true"},	// dbc.loc_cd
				{$dbc + ".oper_cd", "true"}	// dbc.oper_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$dbc + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"},	// dbc.itm_sub3
				{$dbc + ".loc_cd", "loc_is_srch_typ;mode_nullval_flg"},	// dbc.loc_cd
				{$dbc + ".oper_cd", "mode_nullval_flg"}	// dbc.oper_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$dbc + ".unit_conv_rnd_typ", "MAC_RND_TYP"}	// dbc.unit_conv_rnd_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$dbc + ".itm_sub1", "E"},	// dbc.itm_sub1
				{$dbc + ".itm_sub2", "E"},	// dbc.itm_sub2
				{$dbc + ".itm_sub3", "E"},	// dbc.itm_sub3
				{$dbc + ".loc_cd", "E"},	// dbc.loc_cd
				{$dbc + ".oper_cd", "E"}	// dbc.oper_cd
			}
		))
	);

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected Chk01_RsltR_MC_A(ConstMetaList<? extends Chk01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR clone() {
		return (Chk01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR createInstance() {
		return (Chk01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR getValues(String... names) {
		return (Chk01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 2, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 2, $rtn_sts_typ, value);
	}


	public mcframe.serverMG.dbc.MGT_ITM_OPER_R dbc(){
		return (mcframe.serverMG.dbc.MGT_ITM_OPER_R) getConstInnerRow(offset + 3, $dbc);
	}
	
	public void dbc(mcframe.serverMG.dbc.MGT_ITM_OPER_R row){
		setConstInnerRow(offset + 3, $dbc, row);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm() {
		return getConstString(offset + 4, $calc_ctg_nm);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm(String value) {
		setConstString(offset + 4, $calc_ctg_nm, value);
	}


	/**
	 * Term name 期名称.<p>
	 *
	 */
	public String term_nm() {
		return getConstString(offset + 5, $term_nm);
	}

	/**
	 * Term name 期名称.<p>
	 *
	 */
	public void term_nm(String value) {
		setConstString(offset + 5, $term_nm, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 6, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 6, $itm_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 7, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 7, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 8, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 8, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 9, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 9, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 10, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 10, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 11, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 11, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 12, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 12, $itm_jnl_nm, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 13, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 13, $loc_nm, value);
	}


	/**
	 * WG cd. (Master) ワーキンググループＣＤ（マスタ）.<p>
	 *
	 */
	public String mst_wg_cd() {
		return getConstString(offset + 14, $mst_wg_cd);
	}

	/**
	 * WG cd. (Master) ワーキンググループＣＤ（マスタ）.<p>
	 *
	 */
	public void mst_wg_cd(String value) {
		setConstString(offset + 14, $mst_wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 15, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 15, $wg_nm, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 16, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 16, $oper_nm, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 17, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 17, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 18, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 18, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 19, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 19, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 19, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 19, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 19, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 19, $dec_place, value);
	}


	/**
	 * Operation management unit name 工程管理単位名.<p>
	 *
	 */
	public String oper_unit_nm() {
		return getConstString(offset + 20, $oper_unit_nm);
	}

	/**
	 * Operation management unit name 工程管理単位名.<p>
	 *
	 */
	public void oper_unit_nm(String value) {
		setConstString(offset + 20, $oper_unit_nm, value);
	}


	/**
	 * Rounding type name (Conversion) 換算端数処理区分名.<p>
	 *
	 */
	public String unit_conv_rnd_typ_nm() {
		return getConstString(offset + 21, $unit_conv_rnd_typ_nm);
	}

	/**
	 * Rounding type name (Conversion) 換算端数処理区分名.<p>
	 *
	 */
	public void unit_conv_rnd_typ_nm(String value) {
		setConstString(offset + 21, $unit_conv_rnd_typ_nm, value);
	}


	public String getString(String name) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			return term_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($mst_wg_cd.equalsIgnoreCase(name)) {
			return mst_wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($unit_conv_rnd_typ_nm.equalsIgnoreCase(name)) {
			return unit_conv_rnd_typ_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			return term_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($mst_wg_cd.equalsIgnoreCase(name)) {
			return mst_wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($unit_conv_rnd_typ_nm.equalsIgnoreCase(name)) {
			return unit_conv_rnd_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
			return;
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			term_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($mst_wg_cd.equalsIgnoreCase(name)) {
			mst_wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($unit_conv_rnd_typ_nm.equalsIgnoreCase(name)) {
			unit_conv_rnd_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
			return;
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			term_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($mst_wg_cd.equalsIgnoreCase(name)) {
			mst_wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($unit_conv_rnd_typ_nm.equalsIgnoreCase(name)) {
			unit_conv_rnd_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($dbc.equalsIgnoreCase(name)) {
			return dbc();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($dbc.equalsIgnoreCase(name)) {
			dbc(
				((MCContainerMeta) dbc_META).castInnerRow(mcframe.serverMG.dbc.MGT_ITM_OPER_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return dbc().calc_ctg_cd();
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		dbc().calc_ctg_cd(value);
	}

	/**
	 * Term 期.<p>
	 *
	 */
	public MCDate term() {
		return dbc().term();
	}

	/**
	 * Term 期.<p>
	 *
	 */
	public void term(MCDate value) {
		dbc().term(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return dbc().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		dbc().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return dbc().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		dbc().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return dbc().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		dbc().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return dbc().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		dbc().itm_sub3(value);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return dbc().loc_cd();
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		dbc().loc_cd(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return dbc().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		dbc().wg_cd(value);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return dbc().oper_ptn();
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		dbc().oper_ptn(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return dbc().disp_seq();
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		dbc().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(int value) {
		dbc().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(long value) {
		dbc().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(float value) {
		dbc().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(double value) {
		dbc().disp_seq(value);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return dbc().oper_cd();
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		dbc().oper_cd(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return dbc().oper_seq();
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		dbc().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		dbc().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		dbc().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		dbc().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		dbc().oper_seq(value);
	}

	/**
	 * Yield mfg. qty. 歩留製造数量.<p>
	 *
	 */
	public MCNumber nmr_qty() {
		return dbc().nmr_qty();
	}

	/**
	 * Yield mfg. qty. 歩留製造数量.<p>
	 *
	 */
	public void nmr_qty(MCNumber value) {
		dbc().nmr_qty(value);
	}

	/**
	 * Yield mfg. qty. 歩留製造数量.<p>
	 *
	 */
	public void nmr_qty(int value) {
		dbc().nmr_qty(value);
	}

	/**
	 * Yield mfg. qty. 歩留製造数量.<p>
	 *
	 */
	public void nmr_qty(long value) {
		dbc().nmr_qty(value);
	}

	/**
	 * Yield mfg. qty. 歩留製造数量.<p>
	 *
	 */
	public void nmr_qty(float value) {
		dbc().nmr_qty(value);
	}

	/**
	 * Yield mfg. qty. 歩留製造数量.<p>
	 *
	 */
	public void nmr_qty(double value) {
		dbc().nmr_qty(value);
	}

	/**
	 * Ideal mfg. qty. 理論製造数量.<p>
	 *
	 */
	public MCNumber dnm_qty() {
		return dbc().dnm_qty();
	}

	/**
	 * Ideal mfg. qty. 理論製造数量.<p>
	 *
	 */
	public void dnm_qty(MCNumber value) {
		dbc().dnm_qty(value);
	}

	/**
	 * Ideal mfg. qty. 理論製造数量.<p>
	 *
	 */
	public void dnm_qty(int value) {
		dbc().dnm_qty(value);
	}

	/**
	 * Ideal mfg. qty. 理論製造数量.<p>
	 *
	 */
	public void dnm_qty(long value) {
		dbc().dnm_qty(value);
	}

	/**
	 * Ideal mfg. qty. 理論製造数量.<p>
	 *
	 */
	public void dnm_qty(float value) {
		dbc().dnm_qty(value);
	}

	/**
	 * Ideal mfg. qty. 理論製造数量.<p>
	 *
	 */
	public void dnm_qty(double value) {
		dbc().dnm_qty(value);
	}

	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public boolean yield_oper_flg() {
		return dbc().yield_oper_flg();
	}

	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public void yield_oper_flg(boolean value) {
		dbc().yield_oper_flg(value);
	}

	/**
	 * Operation management unit cd. 工程管理単位ＣＤ.<p>
	 *
	 */
	public String oper_unit_cd() {
		return dbc().oper_unit_cd();
	}

	/**
	 * Operation management unit cd. 工程管理単位ＣＤ.<p>
	 *
	 */
	public void oper_unit_cd(String value) {
		dbc().oper_unit_cd(value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber oper_dec_place() {
		return dbc().dec_place();
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void oper_dec_place(MCNumber value) {
		dbc().dec_place(value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void oper_dec_place(int value) {
		dbc().dec_place(value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void oper_dec_place(long value) {
		dbc().dec_place(value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void oper_dec_place(float value) {
		dbc().dec_place(value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void oper_dec_place(double value) {
		dbc().dec_place(value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public MCNumber oper_std_qty() {
		return dbc().oper_std_qty();
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(MCNumber value) {
		dbc().oper_std_qty(value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(int value) {
		dbc().oper_std_qty(value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(long value) {
		dbc().oper_std_qty(value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(float value) {
		dbc().oper_std_qty(value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(double value) {
		dbc().oper_std_qty(value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public MCNumber oper_conv_qty() {
		return dbc().oper_conv_qty();
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(MCNumber value) {
		dbc().oper_conv_qty(value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(int value) {
		dbc().oper_conv_qty(value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(long value) {
		dbc().oper_conv_qty(value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(float value) {
		dbc().oper_conv_qty(value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(double value) {
		dbc().oper_conv_qty(value);
	}

	/**
	 * Rounding type (Conversion) 換算端数処理区分.<p>
	 *
	 */
	public String unit_conv_rnd_typ() {
		return dbc().unit_conv_rnd_typ();
	}

	/**
	 * Rounding type (Conversion) 換算端数処理区分.<p>
	 *
	 */
	public void unit_conv_rnd_typ(String value) {
		dbc().unit_conv_rnd_typ(value);
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public String rmrks() {
		return dbc().rmrks();
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public void rmrks(String value) {
		dbc().rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return dbc().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		dbc().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return dbc().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		dbc().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return dbc().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		dbc().sub_char3(value);
	}

	/**
	 * Not to calculate 計算対象外.<p>
	 *
	 */
	public boolean non_calc_flg() {
		return dbc().non_calc_flg();
	}

	/**
	 * Not to calculate 計算対象外.<p>
	 *
	 */
	public void non_calc_flg(boolean value) {
		dbc().non_calc_flg(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return dbc().upd_cntr();
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		dbc().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		dbc().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		dbc().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		dbc().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		dbc().upd_cntr(value);
	}

}

