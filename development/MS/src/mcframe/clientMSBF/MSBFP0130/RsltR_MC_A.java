package mcframe.clientMSBF.MSBFP0130;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	public static final String $hrrchy_p = "hrrchy_p";
	public static final String $itm_p = "itm_p";
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
	public static final String $ver_no_p = "ver_no_p";
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	public static final String $sno_p = "sno_p";
	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public static final String $mfg_aprv_sts_typ = "mfg_aprv_sts_typ";
	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public static final String $mfg_aprv_sts_typ_nm = "mfg_aprv_sts_typ_nm";
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public static final String $stk_insp_typ = "stk_insp_typ";
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public static final String $stk_insp_typ_nm = "stk_insp_typ_nm";
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public static final String $quality_typ_nm = "quality_typ_nm";
	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public static final String $lot_rmrks = "lot_rmrks";
	/**
	 * Lot spare (String) 1 ロット予備（文字列）１.<p>
	 *
	 */
	public static final String $lot_sub_char1 = "lot_sub_char1";
	/**
	 * Lot spare (String) 2 ロット予備（文字列）２.<p>
	 *
	 */
	public static final String $lot_sub_char2 = "lot_sub_char2";
	/**
	 * Lot spare (String) 3 ロット予備（文字列）３.<p>
	 *
	 */
	public static final String $lot_sub_char3 = "lot_sub_char3";
	/**
	 * Lot spare (String) 4 ロット予備（文字列）４.<p>
	 *
	 */
	public static final String $lot_sub_char4 = "lot_sub_char4";
	/**
	 * Lot spare (String) 5 ロット予備（文字列）５.<p>
	 *
	 */
	public static final String $lot_sub_char5 = "lot_sub_char5";
	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public static final String $lot_sub_num1 = "lot_sub_num1";
	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public static final String $lot_sub_num2 = "lot_sub_num2";
	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public static final String $lot_sub_num3 = "lot_sub_num3";
	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public static final String $lot_sub_num4 = "lot_sub_num4";
	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public static final String $lot_sub_num5 = "lot_sub_num5";
	/**
	 * Lot spare (Date) 1 ロット予備（日付）１.<p>
	 *
	 */
	public static final String $lot_sub_dt1 = "lot_sub_dt1";
	/**
	 * Lot spare (Date) 2 ロット予備（日付）２.<p>
	 *
	 */
	public static final String $lot_sub_dt2 = "lot_sub_dt2";
	/**
	 * Lot spare (Date) 3 ロット予備（日付）３.<p>
	 *
	 */
	public static final String $lot_sub_dt3 = "lot_sub_dt3";
	/**
	 * Lot spare (Date) 4 ロット予備（日付）４.<p>
	 *
	 */
	public static final String $lot_sub_dt4 = "lot_sub_dt4";
	/**
	 * Lot spare (Date) 5 ロット予備（日付）５.<p>
	 *
	 */
	public static final String $lot_sub_dt5 = "lot_sub_dt5";
	/**
	 * Lot spare (flg.) 1 ロット予備（ＦＬＧ）１.<p>
	 *
	 */
	public static final String $lot_sub_flg1 = "lot_sub_flg1";
	/**
	 * Lot spare (flg.) 2 ロット予備（ＦＬＧ）２.<p>
	 *
	 */
	public static final String $lot_sub_flg2 = "lot_sub_flg2";
	/**
	 * Lot spare (flg.) 3 ロット予備（ＦＬＧ）３.<p>
	 *
	 */
	public static final String $lot_sub_flg3 = "lot_sub_flg3";
	/**
	 * Lot spare (flg.) 4 ロット予備（ＦＬＧ）４.<p>
	 *
	 */
	public static final String $lot_sub_flg4 = "lot_sub_flg4";
	/**
	 * Lot spare (flg.) 5 ロット予備（ＦＬＧ）５.<p>
	 *
	 */
	public static final String $lot_sub_flg5 = "lot_sub_flg5";
	/**
	 * Lot No. management type ロットＮＯ管理区分.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * Lot No. management type name ロットＮＯ管理区分名.<p>
	 *
	 */
	public static final String $lot_mng_typ_nm = "lot_mng_typ_nm";
	/**
	 * Sublot No. management type サブロットＮＯ管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	/**
	 * Sublot No. management type name サブロットＮＯ管理区分名.<p>
	 *
	 */
	public static final String $sublot_mng_typ_nm = "sublot_mng_typ_nm";
	public static final String $par_itm_p = "par_itm_p";
	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public static final String $par_lot_no = "par_lot_no";
	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public static final String $par_sublot_no = "par_sublot_no";
	public static final String $par_sno_p = "par_sno_p";
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	/**
	 * Inventory management type name 在庫管理区分名.<p>
	 *
	 */
	public static final String $stk_mng_typ_nm = "stk_mng_typ_nm";

	public static final String $hrrchy = $hrrchy_p + ".hrrchy";
	public static final String $extno = $hrrchy_p + ".extno";
	public static final String $par_extno = $hrrchy_p + ".par_extno";
	public static final String $loop_flg = $hrrchy_p + ".loop_flg";
	public static final String $leaf = $hrrchy_p + ".leaf";
	public static final String $leaf_str = $hrrchy_p + ".leaf_str";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $sno1 = $sno_p + ".sno1";
	public static final String $sno2 = $sno_p + ".sno2";
	public static final String $sno3 = $sno_p + ".sno3";
	public static final String $sno4 = $sno_p + ".sno4";
	public static final String $par_itm_cd = $par_itm_p + ".itm_cd";
	public static final String $par_itm_sub1 = $par_itm_p + ".itm_sub1";
	public static final String $par_itm_sub2 = $par_itm_p + ".itm_sub2";
	public static final String $par_itm_sub3 = $par_itm_p + ".itm_sub3";
	public static final String $par_sno1 = $par_sno_p + ".sno1";
	public static final String $par_sno2 = $par_sno_p + ".sno2";
	public static final String $par_sno3 = $par_sno_p + ".sno3";
	public static final String $par_sno4 = $par_sno_p + ".sno4";

	public static final MCMeta hrrchy_p_META = createInnerRowMeta($hrrchy_p, mcframe.clientMAUB.MAUBP5210.HrrchyR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP5250.VerNoR.class);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMAUB.MAUBP5070.SnoR.class);
	public static final MCMeta mfg_aprv_sts_typ_META = createCommonMeta($mfg_aprv_sts_typ, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP);
	public static final MCMeta mfg_aprv_sts_typ_nm_META = createCommonMeta($mfg_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP_NM);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_insp_typ_nm_META = createCommonMeta($stk_insp_typ_nm, mcframe.commonMS.meta.MS_META.STK_INSP_TYP_NM);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta lot_rmrks_META = createCommonMeta($lot_rmrks, mcframe.commonMS.meta.MS_META.LOT_RMRKS);
	public static final MCMeta lot_sub_char1_META = createCommonMeta($lot_sub_char1, mcframe.commonMS.meta.MS_META.LOT_SUB_CHAR1);
	public static final MCMeta lot_sub_char2_META = createCommonMeta($lot_sub_char2, mcframe.commonMS.meta.MS_META.LOT_SUB_CHAR2);
	public static final MCMeta lot_sub_char3_META = createCommonMeta($lot_sub_char3, mcframe.commonMS.meta.MS_META.LOT_SUB_CHAR3);
	public static final MCMeta lot_sub_char4_META = createCommonMeta($lot_sub_char4, mcframe.commonMS.meta.MS_META.LOT_SUB_CHAR4);
	public static final MCMeta lot_sub_char5_META = createCommonMeta($lot_sub_char5, mcframe.commonMS.meta.MS_META.LOT_SUB_CHAR5);
	public static final MCMeta lot_sub_num1_META = createCommonMeta($lot_sub_num1, mcframe.commonMS.meta.MS_META.LOT_SUB_NUM1);
	public static final MCMeta lot_sub_num2_META = createCommonMeta($lot_sub_num2, mcframe.commonMS.meta.MS_META.LOT_SUB_NUM2);
	public static final MCMeta lot_sub_num3_META = createCommonMeta($lot_sub_num3, mcframe.commonMS.meta.MS_META.LOT_SUB_NUM3);
	public static final MCMeta lot_sub_num4_META = createCommonMeta($lot_sub_num4, mcframe.commonMS.meta.MS_META.LOT_SUB_NUM4);
	public static final MCMeta lot_sub_num5_META = createCommonMeta($lot_sub_num5, mcframe.commonMS.meta.MS_META.LOT_SUB_NUM5);
	public static final MCMeta lot_sub_dt1_META = createCommonMeta($lot_sub_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_sub_dt2_META = createCommonMeta($lot_sub_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_sub_dt3_META = createCommonMeta($lot_sub_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_sub_dt4_META = createCommonMeta($lot_sub_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_sub_dt5_META = createCommonMeta($lot_sub_dt5, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_sub_flg1_META = createCommonMeta($lot_sub_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_sub_flg2_META = createCommonMeta($lot_sub_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_sub_flg3_META = createCommonMeta($lot_sub_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_sub_flg4_META = createCommonMeta($lot_sub_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_sub_flg5_META = createCommonMeta($lot_sub_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta lot_mng_typ_nm_META = createCommonMeta($lot_mng_typ_nm, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP_NM);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_nm_META = createCommonMeta($sublot_mng_typ_nm, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP_NM);
	public static final MCMeta par_itm_p_META = createInnerRowMeta($par_itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta par_lot_no_META = createCommonMeta($par_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta par_sublot_no_META = createCommonMeta($par_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta par_sno_p_META = createInnerRowMeta($par_sno_p, mcframe.clientMAUB.MAUBP5070.SnoR.class);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta stk_mng_typ_nm_META = createCommonMeta($stk_mng_typ_nm, mcframe.commonMA.meta.MA_META.STK_MNG_TYP_NM);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hrrchy_p_META,
			itm_p_META,
			lot_no_META,
			sublot_no_META,
			ver_no_p_META,
			bp_lot_no_META,
			sno_p_META,
			mfg_aprv_sts_typ_META,
			mfg_aprv_sts_typ_nm_META,
			stk_insp_typ_META,
			stk_insp_typ_nm_META,
			quality_typ_META,
			quality_typ_nm_META,
			lot_rmrks_META,
			lot_sub_char1_META,
			lot_sub_char2_META,
			lot_sub_char3_META,
			lot_sub_char4_META,
			lot_sub_char5_META,
			lot_sub_num1_META,
			lot_sub_num2_META,
			lot_sub_num3_META,
			lot_sub_num4_META,
			lot_sub_num5_META,
			lot_sub_dt1_META,
			lot_sub_dt2_META,
			lot_sub_dt3_META,
			lot_sub_dt4_META,
			lot_sub_dt5_META,
			lot_sub_flg1_META,
			lot_sub_flg2_META,
			lot_sub_flg3_META,
			lot_sub_flg4_META,
			lot_sub_flg5_META,
			lot_mng_typ_META,
			lot_mng_typ_nm_META,
			sublot_mng_typ_META,
			sublot_mng_typ_nm_META,
			par_itm_p_META,
			par_lot_no_META,
			par_sublot_no_META,
			par_sno_p_META,
			stk_mng_typ_META,
			stk_mng_typ_nm_META
		},
		new String[][]{
			{
				"hrrchy",
				"extno",
				"par_extno",
				"loop_flg",
				"leaf",
				"leaf_str",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"ver_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"par_itm_cd",
				"par_itm_sub1",
				"par_itm_sub2",
				"par_itm_sub3",
				"par_sno1",
				"par_sno2",
				"par_sno3",
				"par_sno4"
			},
			{
				$hrrchy,
				$extno,
				$par_extno,
				$loop_flg,
				$leaf,
				$leaf_str,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$ver_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$par_itm_cd,
				$par_itm_sub1,
				$par_itm_sub2,
				$par_itm_sub3,
				$par_sno1,
				$par_sno2,
				$par_sno3,
				$par_sno4
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$ver_no_p + ".ver_no", "VER_NO"},	// ver_no_p.ver_no
				{$mfg_aprv_sts_typ, "MFG_APRV"},	// mfg_aprv_sts_typ
				{$mfg_aprv_sts_typ_nm, "MFG_APRV"}	// mfg_aprv_sts_typ_nm
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
	}



	public mcframe.clientMAUB.MAUBP5210.HrrchyR hrrchy_p(){
		return (mcframe.clientMAUB.MAUBP5210.HrrchyR) getConstInnerRow(offset + 0, $hrrchy_p);
	}
	
	public void hrrchy_p(mcframe.clientMAUB.MAUBP5210.HrrchyR row){
		setConstInnerRow(offset + 0, $hrrchy_p, row);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 1, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 1, $itm_p, row);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 2, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 2, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 3, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 3, $sublot_no, value);
	}


	public mcframe.clientMAUB.MAUBP5250.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP5250.VerNoR) getConstInnerRow(offset + 4, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP5250.VerNoR row){
		setConstInnerRow(offset + 4, $ver_no_p, row);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 5, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 5, $bp_lot_no, value);
	}


	public mcframe.clientMAUB.MAUBP5070.SnoR sno_p(){
		return (mcframe.clientMAUB.MAUBP5070.SnoR) getConstInnerRow(offset + 6, $sno_p);
	}
	
	public void sno_p(mcframe.clientMAUB.MAUBP5070.SnoR row){
		setConstInnerRow(offset + 6, $sno_p, row);
	}


	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public String mfg_aprv_sts_typ() {
		return getConstString(offset + 7, $mfg_aprv_sts_typ);
	}

	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public void mfg_aprv_sts_typ(String value) {
		setConstString(offset + 7, $mfg_aprv_sts_typ, value);
	}


	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public String mfg_aprv_sts_typ_nm() {
		return getConstString(offset + 8, $mfg_aprv_sts_typ_nm);
	}

	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public void mfg_aprv_sts_typ_nm(String value) {
		setConstString(offset + 8, $mfg_aprv_sts_typ_nm, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 9, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 9, $stk_insp_typ, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 10, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 10, $stk_insp_typ_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 11, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 11, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 12, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 12, $quality_typ_nm, value);
	}


	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public String lot_rmrks() {
		return getConstString(offset + 13, $lot_rmrks);
	}

	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public void lot_rmrks(String value) {
		setConstString(offset + 13, $lot_rmrks, value);
	}


	/**
	 * Lot spare (String) 1 ロット予備（文字列）１.<p>
	 *
	 */
	public String lot_sub_char1() {
		return getConstString(offset + 14, $lot_sub_char1);
	}

	/**
	 * Lot spare (String) 1 ロット予備（文字列）１.<p>
	 *
	 */
	public void lot_sub_char1(String value) {
		setConstString(offset + 14, $lot_sub_char1, value);
	}


	/**
	 * Lot spare (String) 2 ロット予備（文字列）２.<p>
	 *
	 */
	public String lot_sub_char2() {
		return getConstString(offset + 15, $lot_sub_char2);
	}

	/**
	 * Lot spare (String) 2 ロット予備（文字列）２.<p>
	 *
	 */
	public void lot_sub_char2(String value) {
		setConstString(offset + 15, $lot_sub_char2, value);
	}


	/**
	 * Lot spare (String) 3 ロット予備（文字列）３.<p>
	 *
	 */
	public String lot_sub_char3() {
		return getConstString(offset + 16, $lot_sub_char3);
	}

	/**
	 * Lot spare (String) 3 ロット予備（文字列）３.<p>
	 *
	 */
	public void lot_sub_char3(String value) {
		setConstString(offset + 16, $lot_sub_char3, value);
	}


	/**
	 * Lot spare (String) 4 ロット予備（文字列）４.<p>
	 *
	 */
	public String lot_sub_char4() {
		return getConstString(offset + 17, $lot_sub_char4);
	}

	/**
	 * Lot spare (String) 4 ロット予備（文字列）４.<p>
	 *
	 */
	public void lot_sub_char4(String value) {
		setConstString(offset + 17, $lot_sub_char4, value);
	}


	/**
	 * Lot spare (String) 5 ロット予備（文字列）５.<p>
	 *
	 */
	public String lot_sub_char5() {
		return getConstString(offset + 18, $lot_sub_char5);
	}

	/**
	 * Lot spare (String) 5 ロット予備（文字列）５.<p>
	 *
	 */
	public void lot_sub_char5(String value) {
		setConstString(offset + 18, $lot_sub_char5, value);
	}


	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public MCNumber lot_sub_num1() {
		return getConstNumber(offset + 19, $lot_sub_num1);
	}

	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public void lot_sub_num1(MCNumber value) {
		setConstNumber(offset + 19, $lot_sub_num1, value);
	}

	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public void lot_sub_num1(int value) {
		setConstNumber(offset + 19, $lot_sub_num1, value);
	}

	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public void lot_sub_num1(long value) {
		setConstNumber(offset + 19, $lot_sub_num1, value);
	}

	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public void lot_sub_num1(float value) {
		setConstNumber(offset + 19, $lot_sub_num1, value);
	}

	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public void lot_sub_num1(double value) {
		setConstNumber(offset + 19, $lot_sub_num1, value);
	}


	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public MCNumber lot_sub_num2() {
		return getConstNumber(offset + 20, $lot_sub_num2);
	}

	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public void lot_sub_num2(MCNumber value) {
		setConstNumber(offset + 20, $lot_sub_num2, value);
	}

	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public void lot_sub_num2(int value) {
		setConstNumber(offset + 20, $lot_sub_num2, value);
	}

	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public void lot_sub_num2(long value) {
		setConstNumber(offset + 20, $lot_sub_num2, value);
	}

	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public void lot_sub_num2(float value) {
		setConstNumber(offset + 20, $lot_sub_num2, value);
	}

	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public void lot_sub_num2(double value) {
		setConstNumber(offset + 20, $lot_sub_num2, value);
	}


	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public MCNumber lot_sub_num3() {
		return getConstNumber(offset + 21, $lot_sub_num3);
	}

	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public void lot_sub_num3(MCNumber value) {
		setConstNumber(offset + 21, $lot_sub_num3, value);
	}

	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public void lot_sub_num3(int value) {
		setConstNumber(offset + 21, $lot_sub_num3, value);
	}

	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public void lot_sub_num3(long value) {
		setConstNumber(offset + 21, $lot_sub_num3, value);
	}

	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public void lot_sub_num3(float value) {
		setConstNumber(offset + 21, $lot_sub_num3, value);
	}

	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public void lot_sub_num3(double value) {
		setConstNumber(offset + 21, $lot_sub_num3, value);
	}


	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public MCNumber lot_sub_num4() {
		return getConstNumber(offset + 22, $lot_sub_num4);
	}

	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public void lot_sub_num4(MCNumber value) {
		setConstNumber(offset + 22, $lot_sub_num4, value);
	}

	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public void lot_sub_num4(int value) {
		setConstNumber(offset + 22, $lot_sub_num4, value);
	}

	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public void lot_sub_num4(long value) {
		setConstNumber(offset + 22, $lot_sub_num4, value);
	}

	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public void lot_sub_num4(float value) {
		setConstNumber(offset + 22, $lot_sub_num4, value);
	}

	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public void lot_sub_num4(double value) {
		setConstNumber(offset + 22, $lot_sub_num4, value);
	}


	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public MCNumber lot_sub_num5() {
		return getConstNumber(offset + 23, $lot_sub_num5);
	}

	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public void lot_sub_num5(MCNumber value) {
		setConstNumber(offset + 23, $lot_sub_num5, value);
	}

	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public void lot_sub_num5(int value) {
		setConstNumber(offset + 23, $lot_sub_num5, value);
	}

	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public void lot_sub_num5(long value) {
		setConstNumber(offset + 23, $lot_sub_num5, value);
	}

	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public void lot_sub_num5(float value) {
		setConstNumber(offset + 23, $lot_sub_num5, value);
	}

	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public void lot_sub_num5(double value) {
		setConstNumber(offset + 23, $lot_sub_num5, value);
	}


	/**
	 * Lot spare (Date) 1 ロット予備（日付）１.<p>
	 *
	 */
	public MCDate lot_sub_dt1() {
		return getConstDate(offset + 24, $lot_sub_dt1);
	}

	/**
	 * Lot spare (Date) 1 ロット予備（日付）１.<p>
	 *
	 */
	public void lot_sub_dt1(MCDate value) {
		setConstDate(offset + 24, $lot_sub_dt1, value);
	}


	/**
	 * Lot spare (Date) 2 ロット予備（日付）２.<p>
	 *
	 */
	public MCDate lot_sub_dt2() {
		return getConstDate(offset + 25, $lot_sub_dt2);
	}

	/**
	 * Lot spare (Date) 2 ロット予備（日付）２.<p>
	 *
	 */
	public void lot_sub_dt2(MCDate value) {
		setConstDate(offset + 25, $lot_sub_dt2, value);
	}


	/**
	 * Lot spare (Date) 3 ロット予備（日付）３.<p>
	 *
	 */
	public MCDate lot_sub_dt3() {
		return getConstDate(offset + 26, $lot_sub_dt3);
	}

	/**
	 * Lot spare (Date) 3 ロット予備（日付）３.<p>
	 *
	 */
	public void lot_sub_dt3(MCDate value) {
		setConstDate(offset + 26, $lot_sub_dt3, value);
	}


	/**
	 * Lot spare (Date) 4 ロット予備（日付）４.<p>
	 *
	 */
	public MCDate lot_sub_dt4() {
		return getConstDate(offset + 27, $lot_sub_dt4);
	}

	/**
	 * Lot spare (Date) 4 ロット予備（日付）４.<p>
	 *
	 */
	public void lot_sub_dt4(MCDate value) {
		setConstDate(offset + 27, $lot_sub_dt4, value);
	}


	/**
	 * Lot spare (Date) 5 ロット予備（日付）５.<p>
	 *
	 */
	public MCDate lot_sub_dt5() {
		return getConstDate(offset + 28, $lot_sub_dt5);
	}

	/**
	 * Lot spare (Date) 5 ロット予備（日付）５.<p>
	 *
	 */
	public void lot_sub_dt5(MCDate value) {
		setConstDate(offset + 28, $lot_sub_dt5, value);
	}


	/**
	 * Lot spare (flg.) 1 ロット予備（ＦＬＧ）１.<p>
	 *
	 */
	public boolean lot_sub_flg1() {
		return getConstBoolean(offset + 29, $lot_sub_flg1);
	}

	/**
	 * Lot spare (flg.) 1 ロット予備（ＦＬＧ）１.<p>
	 *
	 */
	public void lot_sub_flg1(boolean value) {
		setConstBoolean(offset + 29, $lot_sub_flg1, value);
	}


	/**
	 * Lot spare (flg.) 2 ロット予備（ＦＬＧ）２.<p>
	 *
	 */
	public boolean lot_sub_flg2() {
		return getConstBoolean(offset + 30, $lot_sub_flg2);
	}

	/**
	 * Lot spare (flg.) 2 ロット予備（ＦＬＧ）２.<p>
	 *
	 */
	public void lot_sub_flg2(boolean value) {
		setConstBoolean(offset + 30, $lot_sub_flg2, value);
	}


	/**
	 * Lot spare (flg.) 3 ロット予備（ＦＬＧ）３.<p>
	 *
	 */
	public boolean lot_sub_flg3() {
		return getConstBoolean(offset + 31, $lot_sub_flg3);
	}

	/**
	 * Lot spare (flg.) 3 ロット予備（ＦＬＧ）３.<p>
	 *
	 */
	public void lot_sub_flg3(boolean value) {
		setConstBoolean(offset + 31, $lot_sub_flg3, value);
	}


	/**
	 * Lot spare (flg.) 4 ロット予備（ＦＬＧ）４.<p>
	 *
	 */
	public boolean lot_sub_flg4() {
		return getConstBoolean(offset + 32, $lot_sub_flg4);
	}

	/**
	 * Lot spare (flg.) 4 ロット予備（ＦＬＧ）４.<p>
	 *
	 */
	public void lot_sub_flg4(boolean value) {
		setConstBoolean(offset + 32, $lot_sub_flg4, value);
	}


	/**
	 * Lot spare (flg.) 5 ロット予備（ＦＬＧ）５.<p>
	 *
	 */
	public boolean lot_sub_flg5() {
		return getConstBoolean(offset + 33, $lot_sub_flg5);
	}

	/**
	 * Lot spare (flg.) 5 ロット予備（ＦＬＧ）５.<p>
	 *
	 */
	public void lot_sub_flg5(boolean value) {
		setConstBoolean(offset + 33, $lot_sub_flg5, value);
	}


	/**
	 * Lot No. management type ロットＮＯ管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 34, $lot_mng_typ);
	}

	/**
	 * Lot No. management type ロットＮＯ管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 34, $lot_mng_typ, value);
	}


	/**
	 * Lot No. management type name ロットＮＯ管理区分名.<p>
	 *
	 */
	public String lot_mng_typ_nm() {
		return getConstString(offset + 35, $lot_mng_typ_nm);
	}

	/**
	 * Lot No. management type name ロットＮＯ管理区分名.<p>
	 *
	 */
	public void lot_mng_typ_nm(String value) {
		setConstString(offset + 35, $lot_mng_typ_nm, value);
	}


	/**
	 * Sublot No. management type サブロットＮＯ管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 36, $sublot_mng_typ);
	}

	/**
	 * Sublot No. management type サブロットＮＯ管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 36, $sublot_mng_typ, value);
	}


	/**
	 * Sublot No. management type name サブロットＮＯ管理区分名.<p>
	 *
	 */
	public String sublot_mng_typ_nm() {
		return getConstString(offset + 37, $sublot_mng_typ_nm);
	}

	/**
	 * Sublot No. management type name サブロットＮＯ管理区分名.<p>
	 *
	 */
	public void sublot_mng_typ_nm(String value) {
		setConstString(offset + 37, $sublot_mng_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR par_itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 38, $par_itm_p);
	}
	
	public void par_itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 38, $par_itm_p, row);
	}


	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public String par_lot_no() {
		return getConstString(offset + 39, $par_lot_no);
	}

	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public void par_lot_no(String value) {
		setConstString(offset + 39, $par_lot_no, value);
	}


	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public String par_sublot_no() {
		return getConstString(offset + 40, $par_sublot_no);
	}

	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public void par_sublot_no(String value) {
		setConstString(offset + 40, $par_sublot_no, value);
	}


	public mcframe.clientMAUB.MAUBP5070.SnoR par_sno_p(){
		return (mcframe.clientMAUB.MAUBP5070.SnoR) getConstInnerRow(offset + 41, $par_sno_p);
	}
	
	public void par_sno_p(mcframe.clientMAUB.MAUBP5070.SnoR row){
		setConstInnerRow(offset + 41, $par_sno_p, row);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 42, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 42, $stk_mng_typ, value);
	}


	/**
	 * Inventory management type name 在庫管理区分名.<p>
	 *
	 */
	public String stk_mng_typ_nm() {
		return getConstString(offset + 43, $stk_mng_typ_nm);
	}

	/**
	 * Inventory management type name 在庫管理区分名.<p>
	 *
	 */
	public void stk_mng_typ_nm(String value) {
		setConstString(offset + 43, $stk_mng_typ_nm, value);
	}


	public String getString(String name) {
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ_nm();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
		}
		if ($lot_sub_char1.equalsIgnoreCase(name)) {
			return lot_sub_char1();
		}
		if ($lot_sub_char2.equalsIgnoreCase(name)) {
			return lot_sub_char2();
		}
		if ($lot_sub_char3.equalsIgnoreCase(name)) {
			return lot_sub_char3();
		}
		if ($lot_sub_char4.equalsIgnoreCase(name)) {
			return lot_sub_char4();
		}
		if ($lot_sub_char5.equalsIgnoreCase(name)) {
			return lot_sub_char5();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_mng_typ_nm.equalsIgnoreCase(name)) {
			return lot_mng_typ_nm();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_mng_typ_nm.equalsIgnoreCase(name)) {
			return sublot_mng_typ_nm();
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			return par_lot_no();
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			return par_sublot_no();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($stk_mng_typ_nm.equalsIgnoreCase(name)) {
			return stk_mng_typ_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			return lot_sub_num1();
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			return lot_sub_num2();
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			return lot_sub_num3();
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			return lot_sub_num4();
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			return lot_sub_num5();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($lot_sub_dt1.equalsIgnoreCase(name)) {
			return lot_sub_dt1();
		}
		if ($lot_sub_dt2.equalsIgnoreCase(name)) {
			return lot_sub_dt2();
		}
		if ($lot_sub_dt3.equalsIgnoreCase(name)) {
			return lot_sub_dt3();
		}
		if ($lot_sub_dt4.equalsIgnoreCase(name)) {
			return lot_sub_dt4();
		}
		if ($lot_sub_dt5.equalsIgnoreCase(name)) {
			return lot_sub_dt5();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($lot_sub_flg1.equalsIgnoreCase(name)) {
			return lot_sub_flg1();
		}
		if ($lot_sub_flg2.equalsIgnoreCase(name)) {
			return lot_sub_flg2();
		}
		if ($lot_sub_flg3.equalsIgnoreCase(name)) {
			return lot_sub_flg3();
		}
		if ($lot_sub_flg4.equalsIgnoreCase(name)) {
			return lot_sub_flg4();
		}
		if ($lot_sub_flg5.equalsIgnoreCase(name)) {
			return lot_sub_flg5();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ_nm();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
		}
		if ($lot_sub_char1.equalsIgnoreCase(name)) {
			return lot_sub_char1();
		}
		if ($lot_sub_char2.equalsIgnoreCase(name)) {
			return lot_sub_char2();
		}
		if ($lot_sub_char3.equalsIgnoreCase(name)) {
			return lot_sub_char3();
		}
		if ($lot_sub_char4.equalsIgnoreCase(name)) {
			return lot_sub_char4();
		}
		if ($lot_sub_char5.equalsIgnoreCase(name)) {
			return lot_sub_char5();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_mng_typ_nm.equalsIgnoreCase(name)) {
			return lot_mng_typ_nm();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_mng_typ_nm.equalsIgnoreCase(name)) {
			return sublot_mng_typ_nm();
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			return par_lot_no();
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			return par_sublot_no();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($stk_mng_typ_nm.equalsIgnoreCase(name)) {
			return stk_mng_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			return lot_sub_num1();
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			return lot_sub_num2();
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			return lot_sub_num3();
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			return lot_sub_num4();
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			return lot_sub_num5();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($lot_sub_dt1.equalsIgnoreCase(name)) {
			return lot_sub_dt1();
		}
		if ($lot_sub_dt2.equalsIgnoreCase(name)) {
			return lot_sub_dt2();
		}
		if ($lot_sub_dt3.equalsIgnoreCase(name)) {
			return lot_sub_dt3();
		}
		if ($lot_sub_dt4.equalsIgnoreCase(name)) {
			return lot_sub_dt4();
		}
		if ($lot_sub_dt5.equalsIgnoreCase(name)) {
			return lot_sub_dt5();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($lot_sub_flg1.equalsIgnoreCase(name)) {
			return lot_sub_flg1();
		}
		if ($lot_sub_flg2.equalsIgnoreCase(name)) {
			return lot_sub_flg2();
		}
		if ($lot_sub_flg3.equalsIgnoreCase(name)) {
			return lot_sub_flg3();
		}
		if ($lot_sub_flg4.equalsIgnoreCase(name)) {
			return lot_sub_flg4();
		}
		if ($lot_sub_flg5.equalsIgnoreCase(name)) {
			return lot_sub_flg5();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ(value);
			return;
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ_nm(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
			return;
		}
		if ($lot_sub_char1.equalsIgnoreCase(name)) {
			lot_sub_char1(value);
			return;
		}
		if ($lot_sub_char2.equalsIgnoreCase(name)) {
			lot_sub_char2(value);
			return;
		}
		if ($lot_sub_char3.equalsIgnoreCase(name)) {
			lot_sub_char3(value);
			return;
		}
		if ($lot_sub_char4.equalsIgnoreCase(name)) {
			lot_sub_char4(value);
			return;
		}
		if ($lot_sub_char5.equalsIgnoreCase(name)) {
			lot_sub_char5(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($lot_mng_typ_nm.equalsIgnoreCase(name)) {
			lot_mng_typ_nm(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ_nm.equalsIgnoreCase(name)) {
			sublot_mng_typ_nm(value);
			return;
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			par_lot_no(value);
			return;
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			par_sublot_no(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($stk_mng_typ_nm.equalsIgnoreCase(name)) {
			stk_mng_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($lot_sub_dt1.equalsIgnoreCase(name)) {
			lot_sub_dt1(value);
			return;
		}
		if ($lot_sub_dt2.equalsIgnoreCase(name)) {
			lot_sub_dt2(value);
			return;
		}
		if ($lot_sub_dt3.equalsIgnoreCase(name)) {
			lot_sub_dt3(value);
			return;
		}
		if ($lot_sub_dt4.equalsIgnoreCase(name)) {
			lot_sub_dt4(value);
			return;
		}
		if ($lot_sub_dt5.equalsIgnoreCase(name)) {
			lot_sub_dt5(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($lot_sub_flg1.equalsIgnoreCase(name)) {
			lot_sub_flg1(value);
			return;
		}
		if ($lot_sub_flg2.equalsIgnoreCase(name)) {
			lot_sub_flg2(value);
			return;
		}
		if ($lot_sub_flg3.equalsIgnoreCase(name)) {
			lot_sub_flg3(value);
			return;
		}
		if ($lot_sub_flg4.equalsIgnoreCase(name)) {
			lot_sub_flg4(value);
			return;
		}
		if ($lot_sub_flg5.equalsIgnoreCase(name)) {
			lot_sub_flg5(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ(value);
			return;
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ_nm(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
			return;
		}
		if ($lot_sub_char1.equalsIgnoreCase(name)) {
			lot_sub_char1(value);
			return;
		}
		if ($lot_sub_char2.equalsIgnoreCase(name)) {
			lot_sub_char2(value);
			return;
		}
		if ($lot_sub_char3.equalsIgnoreCase(name)) {
			lot_sub_char3(value);
			return;
		}
		if ($lot_sub_char4.equalsIgnoreCase(name)) {
			lot_sub_char4(value);
			return;
		}
		if ($lot_sub_char5.equalsIgnoreCase(name)) {
			lot_sub_char5(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($lot_mng_typ_nm.equalsIgnoreCase(name)) {
			lot_mng_typ_nm(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ_nm.equalsIgnoreCase(name)) {
			sublot_mng_typ_nm(value);
			return;
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			par_lot_no(value);
			return;
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			par_sublot_no(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($stk_mng_typ_nm.equalsIgnoreCase(name)) {
			stk_mng_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($lot_sub_dt1.equalsIgnoreCase(name)) {
			lot_sub_dt1(value);
			return;
		}
		if ($lot_sub_dt2.equalsIgnoreCase(name)) {
			lot_sub_dt2(value);
			return;
		}
		if ($lot_sub_dt3.equalsIgnoreCase(name)) {
			lot_sub_dt3(value);
			return;
		}
		if ($lot_sub_dt4.equalsIgnoreCase(name)) {
			lot_sub_dt4(value);
			return;
		}
		if ($lot_sub_dt5.equalsIgnoreCase(name)) {
			lot_sub_dt5(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($lot_sub_flg1.equalsIgnoreCase(name)) {
			lot_sub_flg1(value);
			return;
		}
		if ($lot_sub_flg2.equalsIgnoreCase(name)) {
			lot_sub_flg2(value);
			return;
		}
		if ($lot_sub_flg3.equalsIgnoreCase(name)) {
			lot_sub_flg3(value);
			return;
		}
		if ($lot_sub_flg4.equalsIgnoreCase(name)) {
			lot_sub_flg4(value);
			return;
		}
		if ($lot_sub_flg5.equalsIgnoreCase(name)) {
			lot_sub_flg5(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($hrrchy_p.equalsIgnoreCase(name)) {
			return hrrchy_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			return sno_p();
		}
		if ($par_itm_p.equalsIgnoreCase(name)) {
			return par_itm_p();
		}
		if ($par_sno_p.equalsIgnoreCase(name)) {
			return par_sno_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($hrrchy_p.equalsIgnoreCase(name)) {
			hrrchy_p(
				((MCContainerMeta) hrrchy_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5210.HrrchyR.class, value)
			);
			return;
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			ver_no_p(
				((MCContainerMeta) ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5250.VerNoR.class, value)
			);
			return;
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			sno_p(
				((MCContainerMeta) sno_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5070.SnoR.class, value)
			);
			return;
		}
		if ($par_itm_p.equalsIgnoreCase(name)) {
			par_itm_p(
				((MCContainerMeta) par_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($par_sno_p.equalsIgnoreCase(name)) {
			par_sno_p(
				((MCContainerMeta) par_sno_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5070.SnoR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCNumber hrrchy() {
		return hrrchy_p().hrrchy();
	}

	public void hrrchy(MCNumber value) {
		hrrchy_p().hrrchy(value);
	}

	public void hrrchy(int value) {
		hrrchy_p().hrrchy(value);
	}

	public void hrrchy(long value) {
		hrrchy_p().hrrchy(value);
	}

	public void hrrchy(float value) {
		hrrchy_p().hrrchy(value);
	}

	public void hrrchy(double value) {
		hrrchy_p().hrrchy(value);
	}

	public MCNumber extno() {
		return hrrchy_p().extno();
	}

	public void extno(MCNumber value) {
		hrrchy_p().extno(value);
	}

	public void extno(int value) {
		hrrchy_p().extno(value);
	}

	public void extno(long value) {
		hrrchy_p().extno(value);
	}

	public void extno(float value) {
		hrrchy_p().extno(value);
	}

	public void extno(double value) {
		hrrchy_p().extno(value);
	}

	public MCNumber par_extno() {
		return hrrchy_p().par_extno();
	}

	public void par_extno(MCNumber value) {
		hrrchy_p().par_extno(value);
	}

	public void par_extno(int value) {
		hrrchy_p().par_extno(value);
	}

	public void par_extno(long value) {
		hrrchy_p().par_extno(value);
	}

	public void par_extno(float value) {
		hrrchy_p().par_extno(value);
	}

	public void par_extno(double value) {
		hrrchy_p().par_extno(value);
	}

	public boolean loop_flg() {
		return hrrchy_p().loop_flg();
	}

	public void loop_flg(boolean value) {
		hrrchy_p().loop_flg(value);
	}

	public String leaf() {
		return hrrchy_p().leaf();
	}

	public void leaf(String value) {
		hrrchy_p().leaf(value);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public String leaf_str() {
		return hrrchy_p().leaf_str();
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void leaf_str(String value) {
		hrrchy_p().leaf_str(value);
	}

	public String itm_cd() {
		return itm_p().itm_cd();
	}

	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	public String itm_nm() {
		return itm_p().itm_nm();
	}

	public void itm_nm(String value) {
		itm_p().itm_nm(value);
	}

	public String ver_no() {
		return ver_no_p().ver_no();
	}

	public void ver_no(String value) {
		ver_no_p().ver_no(value);
	}

	public String sno1() {
		return sno_p().sno1();
	}

	public void sno1(String value) {
		sno_p().sno1(value);
	}

	public String sno2() {
		return sno_p().sno2();
	}

	public void sno2(String value) {
		sno_p().sno2(value);
	}

	public String sno3() {
		return sno_p().sno3();
	}

	public void sno3(String value) {
		sno_p().sno3(value);
	}

	public String sno4() {
		return sno_p().sno4();
	}

	public void sno4(String value) {
		sno_p().sno4(value);
	}

	public String par_itm_cd() {
		return par_itm_p().itm_cd();
	}

	public void par_itm_cd(String value) {
		par_itm_p().itm_cd(value);
	}

	public String par_itm_sub1() {
		return par_itm_p().itm_sub1();
	}

	public void par_itm_sub1(String value) {
		par_itm_p().itm_sub1(value);
	}

	public String par_itm_sub2() {
		return par_itm_p().itm_sub2();
	}

	public void par_itm_sub2(String value) {
		par_itm_p().itm_sub2(value);
	}

	public String par_itm_sub3() {
		return par_itm_p().itm_sub3();
	}

	public void par_itm_sub3(String value) {
		par_itm_p().itm_sub3(value);
	}

	public String par_sno1() {
		return par_sno_p().sno1();
	}

	public void par_sno1(String value) {
		par_sno_p().sno1(value);
	}

	public String par_sno2() {
		return par_sno_p().sno2();
	}

	public void par_sno2(String value) {
		par_sno_p().sno2(value);
	}

	public String par_sno3() {
		return par_sno_p().sno3();
	}

	public void par_sno3(String value) {
		par_sno_p().sno3(value);
	}

	public String par_sno4() {
		return par_sno_p().sno4();
	}

	public void par_sno4(String value) {
		par_sno_p().sno4(value);
	}

}

