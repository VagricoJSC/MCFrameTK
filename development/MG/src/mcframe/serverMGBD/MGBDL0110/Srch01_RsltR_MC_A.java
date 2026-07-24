package mcframe.serverMGBD.MGBDL0110;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Term master (Dummy for join) 期マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_term = "dummy_term";
	/**
	 * Item classification master 1 (Dummy for join) 品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp1 = "dummy_itm_grp1";
	/**
	 * Item classification master 2 (Dummy for join) 品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp2 = "dummy_itm_grp2";
	/**
	 * Item classification master 3 (Dummy for join) 品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp3 = "dummy_itm_grp3";
	/**
	 * Item classification master 4 (Dummy for join) 品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp4 = "dummy_itm_grp4";
	/**
	 * Item classification master 5 (Dummy for join) 品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp5 = "dummy_itm_grp5";
	/**
	 * Item classification master 6 (Dummy for join) 品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp6 = "dummy_itm_grp6";
	/**
	 * Item classification master 7 (Dummy for join) 品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp7 = "dummy_itm_grp7";
	/**
	 * Item classification master 8 (Dummy for join) 品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp8 = "dummy_itm_grp8";
	/**
	 * Item classification master 9 (Dummy for join) 品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp9 = "dummy_itm_grp9";
	/**
	 * Item classification master 10 (Dummy for join) 品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp10 = "dummy_itm_grp10";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public static final String $mng_dpt_cd = "mng_dpt_cd";
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public static final String $mng_dpt_nm = "mng_dpt_nm";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
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
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Line name ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public static final String $asst_typ_nm = "asst_typ_nm";
	/**
	 * Routing 工順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Operation unit cd. 工程単位ＣＤ.<p>
	 *
	 */
	public static final String $oper_unit_cd = "oper_unit_cd";
	/**
	 * Operation unit name 工程単位名.<p>
	 *
	 */
	public static final String $oper_unit_nm = "oper_unit_nm";
	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public static final String $oper_dec_place = "oper_dec_place";
	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public static final String $oper_std_qty = "oper_std_qty";
	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public static final String $oper_conv_qty = "oper_conv_qty";
	/**
	 * Rounding type (Conversion) 換算端数処理区分.<p>
	 *
	 */
	public static final String $unit_conv_rnd_typ = "unit_conv_rnd_typ";
	/**
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public static final String $qty = "qty";


	public static final MCMeta dummy_term_META = createCommonMeta($dummy_term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta dummy_itm_grp1_META = createCommonMeta($dummy_itm_grp1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp2_META = createCommonMeta($dummy_itm_grp2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp3_META = createCommonMeta($dummy_itm_grp3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp4_META = createCommonMeta($dummy_itm_grp4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp5_META = createCommonMeta($dummy_itm_grp5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp6_META = createCommonMeta($dummy_itm_grp6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp7_META = createCommonMeta($dummy_itm_grp7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp8_META = createCommonMeta($dummy_itm_grp8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp9_META = createCommonMeta($dummy_itm_grp9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp10_META = createCommonMeta($dummy_itm_grp10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta mng_dpt_nm_META = createCommonMeta($mng_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta oper_unit_cd_META = createCommonMeta($oper_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta oper_unit_nm_META = createCommonMeta($oper_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta oper_dec_place_META = createCommonMeta($oper_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta oper_std_qty_META = createCommonMeta($oper_std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_conv_qty_META = createCommonMeta($oper_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unit_conv_rnd_typ_META = createCommonMeta($unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dummy_term_META,
			dummy_itm_grp1_META,
			dummy_itm_grp2_META,
			dummy_itm_grp3_META,
			dummy_itm_grp4_META,
			dummy_itm_grp5_META,
			dummy_itm_grp6_META,
			dummy_itm_grp7_META,
			dummy_itm_grp8_META,
			dummy_itm_grp9_META,
			dummy_itm_grp10_META,
			wg_cd_META,
			wg_nm_META,
			mng_dpt_cd_META,
			mng_dpt_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			itm_mfg_inst_no_META,
			mfg_act_no_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			site_cd_META,
			site_nm_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			asst_typ_META,
			asst_typ_nm_META,
			disp_seq_META,
			oper_cd_META,
			oper_nm_META,
			oper_seq_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			oper_unit_cd_META,
			oper_unit_nm_META,
			oper_dec_place_META,
			oper_std_qty_META,
			oper_conv_qty_META,
			unit_conv_rnd_typ_META,
			ym_META,
			qty_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$itm_typ, "MAC_ITM_TYP"},	// itm_typ
				{$asst_typ, "MAC_ASST_TYP"}	// asst_typ
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Term master (Dummy for join) 期マスタ（結合用ダミー）.<p>
	 *
	 */
	public MCDate dummy_term() {
		return getConstDate(offset + 0, $dummy_term);
	}

	/**
	 * Term master (Dummy for join) 期マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_term(MCDate value) {
		setConstDate(offset + 0, $dummy_term, value);
	}


	/**
	 * Item classification master 1 (Dummy for join) 品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp1() {
		return getConstString(offset + 1, $dummy_itm_grp1);
	}

	/**
	 * Item classification master 1 (Dummy for join) 品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp1(String value) {
		setConstString(offset + 1, $dummy_itm_grp1, value);
	}


	/**
	 * Item classification master 2 (Dummy for join) 品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp2() {
		return getConstString(offset + 2, $dummy_itm_grp2);
	}

	/**
	 * Item classification master 2 (Dummy for join) 品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp2(String value) {
		setConstString(offset + 2, $dummy_itm_grp2, value);
	}


	/**
	 * Item classification master 3 (Dummy for join) 品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp3() {
		return getConstString(offset + 3, $dummy_itm_grp3);
	}

	/**
	 * Item classification master 3 (Dummy for join) 品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp3(String value) {
		setConstString(offset + 3, $dummy_itm_grp3, value);
	}


	/**
	 * Item classification master 4 (Dummy for join) 品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp4() {
		return getConstString(offset + 4, $dummy_itm_grp4);
	}

	/**
	 * Item classification master 4 (Dummy for join) 品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp4(String value) {
		setConstString(offset + 4, $dummy_itm_grp4, value);
	}


	/**
	 * Item classification master 5 (Dummy for join) 品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp5() {
		return getConstString(offset + 5, $dummy_itm_grp5);
	}

	/**
	 * Item classification master 5 (Dummy for join) 品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp5(String value) {
		setConstString(offset + 5, $dummy_itm_grp5, value);
	}


	/**
	 * Item classification master 6 (Dummy for join) 品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp6() {
		return getConstString(offset + 6, $dummy_itm_grp6);
	}

	/**
	 * Item classification master 6 (Dummy for join) 品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp6(String value) {
		setConstString(offset + 6, $dummy_itm_grp6, value);
	}


	/**
	 * Item classification master 7 (Dummy for join) 品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp7() {
		return getConstString(offset + 7, $dummy_itm_grp7);
	}

	/**
	 * Item classification master 7 (Dummy for join) 品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp7(String value) {
		setConstString(offset + 7, $dummy_itm_grp7, value);
	}


	/**
	 * Item classification master 8 (Dummy for join) 品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp8() {
		return getConstString(offset + 8, $dummy_itm_grp8);
	}

	/**
	 * Item classification master 8 (Dummy for join) 品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp8(String value) {
		setConstString(offset + 8, $dummy_itm_grp8, value);
	}


	/**
	 * Item classification master 9 (Dummy for join) 品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp9() {
		return getConstString(offset + 9, $dummy_itm_grp9);
	}

	/**
	 * Item classification master 9 (Dummy for join) 品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp9(String value) {
		setConstString(offset + 9, $dummy_itm_grp9, value);
	}


	/**
	 * Item classification master 10 (Dummy for join) 品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp10() {
		return getConstString(offset + 10, $dummy_itm_grp10);
	}

	/**
	 * Item classification master 10 (Dummy for join) 品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp10(String value) {
		setConstString(offset + 10, $dummy_itm_grp10, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 11, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 11, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 12, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 12, $wg_nm, value);
	}


	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 13, $mng_dpt_cd);
	}

	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 13, $mng_dpt_cd, value);
	}


	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public String mng_dpt_nm() {
		return getConstString(offset + 14, $mng_dpt_nm);
	}

	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public void mng_dpt_nm(String value) {
		setConstString(offset + 14, $mng_dpt_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 15, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 15, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 16, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 16, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 17, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 17, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 18, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 18, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 19, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 19, $itm_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 20, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 20, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 21, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 21, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 22, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 22, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 23, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 23, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 24, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 24, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 25, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 25, $itm_jnl_nm, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 26, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 26, $itm_mfg_inst_no, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 27, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 27, $mfg_act_no, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 28, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 28, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 29, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 29, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 30, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 30, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 31, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 31, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 32, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 32, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 33, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 33, $sno4, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 34, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 34, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 35, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 35, $site_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 36, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 36, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 37, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 37, $loc_nm, value);
	}


	/**
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 38, $str_ln_cd);
	}

	/**
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 38, $str_ln_cd, value);
	}


	/**
	 * Line name ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 39, $str_ln_nm);
	}

	/**
	 * Line name ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 39, $str_ln_nm, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 40, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 40, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 41, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 41, $asst_typ_nm, value);
	}


	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 42, $disp_seq);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 42, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 42, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 42, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 42, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 42, $disp_seq, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 43, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 43, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 44, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 44, $oper_nm, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 45, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 45, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 45, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 45, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 45, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 45, $oper_seq, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 46, $unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 46, $unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 47, $unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 47, $unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 48, $dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 48, $dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 48, $dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 48, $dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 48, $dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 48, $dec_place, value);
	}


	/**
	 * Operation unit cd. 工程単位ＣＤ.<p>
	 *
	 */
	public String oper_unit_cd() {
		return getConstString(offset + 49, $oper_unit_cd);
	}

	/**
	 * Operation unit cd. 工程単位ＣＤ.<p>
	 *
	 */
	public void oper_unit_cd(String value) {
		setConstString(offset + 49, $oper_unit_cd, value);
	}


	/**
	 * Operation unit name 工程単位名.<p>
	 *
	 */
	public String oper_unit_nm() {
		return getConstString(offset + 50, $oper_unit_nm);
	}

	/**
	 * Operation unit name 工程単位名.<p>
	 *
	 */
	public void oper_unit_nm(String value) {
		setConstString(offset + 50, $oper_unit_nm, value);
	}


	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber oper_dec_place() {
		return getConstNumber(offset + 51, $oper_dec_place);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_dec_place(MCNumber value) {
		setConstNumber(offset + 51, $oper_dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_dec_place(int value) {
		setConstNumber(offset + 51, $oper_dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_dec_place(long value) {
		setConstNumber(offset + 51, $oper_dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_dec_place(float value) {
		setConstNumber(offset + 51, $oper_dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_dec_place(double value) {
		setConstNumber(offset + 51, $oper_dec_place, value);
	}


	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public MCNumber oper_std_qty() {
		return getConstNumber(offset + 52, $oper_std_qty);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(MCNumber value) {
		setConstNumber(offset + 52, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(int value) {
		setConstNumber(offset + 52, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(long value) {
		setConstNumber(offset + 52, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(float value) {
		setConstNumber(offset + 52, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(double value) {
		setConstNumber(offset + 52, $oper_std_qty, value);
	}


	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public MCNumber oper_conv_qty() {
		return getConstNumber(offset + 53, $oper_conv_qty);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(MCNumber value) {
		setConstNumber(offset + 53, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(int value) {
		setConstNumber(offset + 53, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(long value) {
		setConstNumber(offset + 53, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(float value) {
		setConstNumber(offset + 53, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(double value) {
		setConstNumber(offset + 53, $oper_conv_qty, value);
	}


	/**
	 * Rounding type (Conversion) 換算端数処理区分.<p>
	 *
	 */
	public String unit_conv_rnd_typ() {
		return getConstString(offset + 54, $unit_conv_rnd_typ);
	}

	/**
	 * Rounding type (Conversion) 換算端数処理区分.<p>
	 *
	 */
	public void unit_conv_rnd_typ(String value) {
		setConstString(offset + 54, $unit_conv_rnd_typ, value);
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 55, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 55, $ym, value);
	}


	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 56, $qty);
	}

	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 56, $qty, value);
	}

	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 56, $qty, value);
	}

	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 56, $qty, value);
	}

	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 56, $qty, value);
	}

	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 56, $qty, value);
	}


	public String getString(String name) {
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			return dummy_itm_grp1();
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			return dummy_itm_grp2();
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			return dummy_itm_grp3();
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			return dummy_itm_grp4();
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			return dummy_itm_grp5();
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			return dummy_itm_grp6();
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			return dummy_itm_grp7();
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			return dummy_itm_grp8();
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			return dummy_itm_grp9();
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			return dummy_itm_grp10();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
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
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return unit_conv_rnd_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($oper_dec_place.equalsIgnoreCase(name)) {
			return oper_dec_place();
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dummy_term.equalsIgnoreCase(name)) {
			return dummy_term();
		}
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			return dummy_itm_grp1();
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			return dummy_itm_grp2();
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			return dummy_itm_grp3();
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			return dummy_itm_grp4();
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			return dummy_itm_grp5();
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			return dummy_itm_grp6();
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			return dummy_itm_grp7();
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			return dummy_itm_grp8();
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			return dummy_itm_grp9();
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			return dummy_itm_grp10();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
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
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return unit_conv_rnd_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($oper_dec_place.equalsIgnoreCase(name)) {
			return oper_dec_place();
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dummy_term.equalsIgnoreCase(name)) {
			return dummy_term();
		}
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			dummy_itm_grp1(value);
			return;
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			dummy_itm_grp2(value);
			return;
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			dummy_itm_grp3(value);
			return;
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			dummy_itm_grp4(value);
			return;
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			dummy_itm_grp5(value);
			return;
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			dummy_itm_grp6(value);
			return;
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			dummy_itm_grp7(value);
			return;
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			dummy_itm_grp8(value);
			return;
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			dummy_itm_grp9(value);
			return;
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			dummy_itm_grp10(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
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
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			unit_conv_rnd_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_dec_place.equalsIgnoreCase(name)) {
			oper_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_dec_place.equalsIgnoreCase(name)) {
			oper_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_dec_place.equalsIgnoreCase(name)) {
			oper_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_dec_place.equalsIgnoreCase(name)) {
			oper_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_dec_place.equalsIgnoreCase(name)) {
			oper_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dummy_term.equalsIgnoreCase(name)) {
			dummy_term(value);
			return;
		}
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			dummy_itm_grp1(value);
			return;
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			dummy_itm_grp2(value);
			return;
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			dummy_itm_grp3(value);
			return;
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			dummy_itm_grp4(value);
			return;
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			dummy_itm_grp5(value);
			return;
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			dummy_itm_grp6(value);
			return;
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			dummy_itm_grp7(value);
			return;
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			dummy_itm_grp8(value);
			return;
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			dummy_itm_grp9(value);
			return;
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			dummy_itm_grp10(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
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
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			unit_conv_rnd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_dec_place.equalsIgnoreCase(name)) {
			oper_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_dec_place.equalsIgnoreCase(name)) {
			oper_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_dec_place.equalsIgnoreCase(name)) {
			oper_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_dec_place.equalsIgnoreCase(name)) {
			oper_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_dec_place.equalsIgnoreCase(name)) {
			oper_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dummy_term.equalsIgnoreCase(name)) {
			dummy_term(value);
			return;
		}
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

