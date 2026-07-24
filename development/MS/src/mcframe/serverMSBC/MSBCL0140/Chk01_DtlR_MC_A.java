package mcframe.serverMSBC.MSBCL0140;

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
 * ブロック"Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Pegging No. branch number 紐付けＮＯ枝番.<p>
	 *
	 */
	public static final String $peg_no_d = "peg_no_d";
	public static final String $oord = "oord";
	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public static final String $master_dt = "master_dt";
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
	 * Operation order status type name 工程オーダ状況区分名.<p>
	 *
	 */
	public static final String $oper_ord_sts_typ_nm = "oper_ord_sts_typ_nm";
	/**
	 * Operation offset type name 工程オフセット区分名.<p>
	 *
	 */
	public static final String $oper_offst_typ_nm = "oper_offst_typ_nm";

	public static final String $oper_ord_no = $oord + ".oper_ord_no";
	public static final String $itm_ord_no = $oord + ".itm_ord_no";
	public static final String $oper_ord_sts_typ = $oord + ".oper_ord_sts_typ";
	public static final String $oper_cd = $oord + ".oper_cd";
	public static final String $oper_seq = $oord + ".oper_seq";
	public static final String $oper_ptn = $oord + ".oper_ptn";
	public static final String $loc_cd = $oord + ".loc_cd";
	public static final String $disp_seq = $oord + ".disp_seq";
	public static final String $oper_schd_qty = $oord + ".oper_schd_qty";
	public static final String $yield_oper_flg = $oord + ".yield_oper_flg";
	public static final String $st_schd_tm = $oord + ".st_schd_tm";
	public static final String $end_schd_tm = $oord + ".end_schd_tm";
	public static final String $wg_cd = $oord + ".wg_cd";
	public static final String $oper_lt = $oord + ".oper_lt";
	public static final String $oper_offst_typ = $oord + ".oper_offst_typ";
	public static final String $oper_offst = $oord + ".oper_offst";
	public static final String $intr_rmrks = $oord + ".intr_rmrks";
	public static final String $sub_char1 = $oord + ".sub_char1";
	public static final String $sub_char2 = $oord + ".sub_char2";
	public static final String $sub_char3 = $oord + ".sub_char3";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_d_META = createCommonMeta($peg_no_d, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oord_META = createInnerRowMeta($oord, mcframe.serverMS.dbc.MST_PRCD_OPER_ORDER_R.class);
	public static final MCMeta master_dt_META = createCommonMeta($master_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta oper_ord_sts_typ_nm_META = createCommonMeta($oper_ord_sts_typ_nm, mcframe.commonMS.meta.MS_META.OPER_ORD_STS_TYP_NM);
	public static final MCMeta oper_offst_typ_nm_META = createCommonMeta($oper_offst_typ_nm, mcframe.commonMA.meta.MA_META.OFFST_TYP_NM);

	protected static final ConstMetaList<Chk01_DtlR> constMetas = new ConstMetaList<Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			peg_no_d_META,
			oord_META,
			master_dt_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			oper_ord_sts_typ_nm_META,
			oper_offst_typ_nm_META
		},
		new String[][]{
			{
				"oper_ord_no",
				"itm_ord_no",
				"oper_ord_sts_typ",
				"oper_cd",
				"oper_seq",
				"oper_ptn",
				"loc_cd",
				"disp_seq",
				"oper_schd_qty",
				"yield_oper_flg",
				"st_schd_tm",
				"end_schd_tm",
				"wg_cd",
				"oper_lt",
				"oper_offst_typ",
				"oper_offst",
				"intr_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3"
			},
			{
				$oper_ord_no,
				$itm_ord_no,
				$oper_ord_sts_typ,
				$oper_cd,
				$oper_seq,
				$oper_ptn,
				$loc_cd,
				$disp_seq,
				$oper_schd_qty,
				$yield_oper_flg,
				$st_schd_tm,
				$end_schd_tm,
				$wg_cd,
				$oper_lt,
				$oper_offst_typ,
				$oper_offst,
				$intr_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$oord + ".oper_ord_sts_typ", "MSC_OPER_ORD_STS_TYP"},	// oord.oper_ord_sts_typ
				{$oord + ".oper_offst_typ", "MAC_OFFST_TYP"}	// oord.oper_offst_typ
			}
		)),
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$oord + ".loc_cd", "MA.MAUAL0010.Loc"}	// oord.loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$oord + ".loc_cd", "wg_cd"}	// oord.loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$oord + ".loc_cd", "wg_cd"}	// oord.loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$oord + ".loc_cd", "loc_cd;MAC_DPT_IS_SRCH_TYP.COMM"}	// oord.loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$oord + ".loc_cd", "loc_cd;loc_is_srch_typ"}	// oord.loc_cd
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
	protected Chk01_DtlR_MC_A(ConstMetaList<? extends Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_DtlR clone() {
		return (Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_DtlR createInstance() {
		return (Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_DtlR getValues(String... names) {
		return (Chk01_DtlR) super.getValues(names);
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
	 * Pegging No. branch number 紐付けＮＯ枝番.<p>
	 *
	 */
	public MCNumber peg_no_d() {
		return getConstNumber(offset + 1, $peg_no_d);
	}

	/**
	 * Pegging No. branch number 紐付けＮＯ枝番.<p>
	 *
	 */
	public void peg_no_d(MCNumber value) {
		setConstNumber(offset + 1, $peg_no_d, value);
	}

	/**
	 * Pegging No. branch number 紐付けＮＯ枝番.<p>
	 *
	 */
	public void peg_no_d(int value) {
		setConstNumber(offset + 1, $peg_no_d, value);
	}

	/**
	 * Pegging No. branch number 紐付けＮＯ枝番.<p>
	 *
	 */
	public void peg_no_d(long value) {
		setConstNumber(offset + 1, $peg_no_d, value);
	}

	/**
	 * Pegging No. branch number 紐付けＮＯ枝番.<p>
	 *
	 */
	public void peg_no_d(float value) {
		setConstNumber(offset + 1, $peg_no_d, value);
	}

	/**
	 * Pegging No. branch number 紐付けＮＯ枝番.<p>
	 *
	 */
	public void peg_no_d(double value) {
		setConstNumber(offset + 1, $peg_no_d, value);
	}


	public mcframe.serverMS.dbc.MST_PRCD_OPER_ORDER_R oord(){
		return (mcframe.serverMS.dbc.MST_PRCD_OPER_ORDER_R) getConstInnerRow(offset + 2, $oord);
	}
	
	public void oord(mcframe.serverMS.dbc.MST_PRCD_OPER_ORDER_R row){
		setConstInnerRow(offset + 2, $oord, row);
	}


	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDate master_dt() {
		return getConstDate(offset + 3, $master_dt);
	}

	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		setConstDate(offset + 3, $master_dt, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 4, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 4, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 5, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 5, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 6, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 6, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 7, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 7, $itm_sub3, value);
	}


	/**
	 * Operation order status type name 工程オーダ状況区分名.<p>
	 *
	 */
	public String oper_ord_sts_typ_nm() {
		return getConstString(offset + 8, $oper_ord_sts_typ_nm);
	}

	/**
	 * Operation order status type name 工程オーダ状況区分名.<p>
	 *
	 */
	public void oper_ord_sts_typ_nm(String value) {
		setConstString(offset + 8, $oper_ord_sts_typ_nm, value);
	}


	/**
	 * Operation offset type name 工程オフセット区分名.<p>
	 *
	 */
	public String oper_offst_typ_nm() {
		return getConstString(offset + 9, $oper_offst_typ_nm);
	}

	/**
	 * Operation offset type name 工程オフセット区分名.<p>
	 *
	 */
	public void oper_offst_typ_nm(String value) {
		setConstString(offset + 9, $oper_offst_typ_nm, value);
	}


	public String getString(String name) {
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
		if ($oper_ord_sts_typ_nm.equalsIgnoreCase(name)) {
			return oper_ord_sts_typ_nm();
		}
		if ($oper_offst_typ_nm.equalsIgnoreCase(name)) {
			return oper_offst_typ_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($peg_no_d.equalsIgnoreCase(name)) {
			return peg_no_d();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
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
		if ($oper_ord_sts_typ_nm.equalsIgnoreCase(name)) {
			return oper_ord_sts_typ_nm();
		}
		if ($oper_offst_typ_nm.equalsIgnoreCase(name)) {
			return oper_offst_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($peg_no_d.equalsIgnoreCase(name)) {
			return peg_no_d();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
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
		if ($oper_ord_sts_typ_nm.equalsIgnoreCase(name)) {
			oper_ord_sts_typ_nm(value);
			return;
		}
		if ($oper_offst_typ_nm.equalsIgnoreCase(name)) {
			oper_offst_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_no_d.equalsIgnoreCase(name)) {
			peg_no_d(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_no_d.equalsIgnoreCase(name)) {
			peg_no_d(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_no_d.equalsIgnoreCase(name)) {
			peg_no_d(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_no_d.equalsIgnoreCase(name)) {
			peg_no_d(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_no_d.equalsIgnoreCase(name)) {
			peg_no_d(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($oper_ord_sts_typ_nm.equalsIgnoreCase(name)) {
			oper_ord_sts_typ_nm(value);
			return;
		}
		if ($oper_offst_typ_nm.equalsIgnoreCase(name)) {
			oper_offst_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_no_d.equalsIgnoreCase(name)) {
			peg_no_d(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_no_d.equalsIgnoreCase(name)) {
			peg_no_d(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_no_d.equalsIgnoreCase(name)) {
			peg_no_d(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_no_d.equalsIgnoreCase(name)) {
			peg_no_d(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_no_d.equalsIgnoreCase(name)) {
			peg_no_d(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($oord.equalsIgnoreCase(name)) {
			return oord();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($oord.equalsIgnoreCase(name)) {
			oord(
				((MCContainerMeta) oord_META).castInnerRow(mcframe.serverMS.dbc.MST_PRCD_OPER_ORDER_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public String oper_ord_no() {
		return oord().oper_ord_no();
	}

	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public void oper_ord_no(String value) {
		oord().oper_ord_no(value);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return oord().itm_ord_no();
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		oord().itm_ord_no(value);
	}

	/**
	 * Operation order status type 工程オーダ状況区分.<p>
	 *
	 */
	public String oper_ord_sts_typ() {
		return oord().oper_ord_sts_typ();
	}

	/**
	 * Operation order status type 工程オーダ状況区分.<p>
	 *
	 */
	public void oper_ord_sts_typ(String value) {
		oord().oper_ord_sts_typ(value);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return oord().oper_cd();
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		oord().oper_cd(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return oord().oper_seq();
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		oord().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		oord().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		oord().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		oord().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		oord().oper_seq(value);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return oord().oper_ptn();
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		oord().oper_ptn(value);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return oord().loc_cd();
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		oord().loc_cd(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return oord().disp_seq();
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		oord().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(int value) {
		oord().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(long value) {
		oord().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(float value) {
		oord().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(double value) {
		oord().disp_seq(value);
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public MCNumber oper_schd_qty() {
		return oord().oper_schd_qty();
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public void oper_schd_qty(MCNumber value) {
		oord().oper_schd_qty(value);
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public void oper_schd_qty(int value) {
		oord().oper_schd_qty(value);
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public void oper_schd_qty(long value) {
		oord().oper_schd_qty(value);
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public void oper_schd_qty(float value) {
		oord().oper_schd_qty(value);
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public void oper_schd_qty(double value) {
		oord().oper_schd_qty(value);
	}

	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public boolean yield_oper_flg() {
		return oord().yield_oper_flg();
	}

	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public void yield_oper_flg(boolean value) {
		oord().yield_oper_flg(value);
	}

	/**
	 * Scheduled operation start date and time 工程着手予定日時.<p>
	 *
	 */
	public MCDate st_schd_tm() {
		return oord().st_schd_tm();
	}

	/**
	 * Scheduled operation start date and time 工程着手予定日時.<p>
	 *
	 */
	public void st_schd_tm(MCDate value) {
		oord().st_schd_tm(value);
	}

	/**
	 * Scheduled operation end date and time 工程終了予定日時.<p>
	 *
	 */
	public MCDate end_schd_tm() {
		return oord().end_schd_tm();
	}

	/**
	 * Scheduled operation end date and time 工程終了予定日時.<p>
	 *
	 */
	public void end_schd_tm(MCDate value) {
		oord().end_schd_tm(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return oord().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		oord().wg_cd(value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public MCNumber oper_lt() {
		return oord().oper_lt();
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(MCNumber value) {
		oord().oper_lt(value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(int value) {
		oord().oper_lt(value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(long value) {
		oord().oper_lt(value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(float value) {
		oord().oper_lt(value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(double value) {
		oord().oper_lt(value);
	}

	/**
	 * Operation offset type 工程オフセット区分.<p>
	 *
	 */
	public String oper_offst_typ() {
		return oord().oper_offst_typ();
	}

	/**
	 * Operation offset type 工程オフセット区分.<p>
	 *
	 */
	public void oper_offst_typ(String value) {
		oord().oper_offst_typ(value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public MCNumber oper_offst() {
		return oord().oper_offst();
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(MCNumber value) {
		oord().oper_offst(value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(int value) {
		oord().oper_offst(value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(long value) {
		oord().oper_offst(value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(float value) {
		oord().oper_offst(value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(double value) {
		oord().oper_offst(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return oord().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		oord().intr_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return oord().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		oord().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return oord().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		oord().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return oord().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		oord().sub_char3(value);
	}

}

