package mcframe.clientMSBC.MSBCP1010;

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
 * ブロック"DtlReExt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlReExtR_MC_A extends MCConstRow {

	/**
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public static final String $chng_no = "chng_no";
	/**
	 * Order re-explosion type 指図再展開区分.<p>
	 *
	 */
	public static final String $re_ext_typ = "re_ext_typ";
	/**
	 * Order re-explosion type name 指図再展開区分名.<p>
	 *
	 */
	public static final String $re_ext_typ_nm = "re_ext_typ_nm";
	/**
	 * Unnecessary 不要.<p>
	 *
	 */
	public static final String $unneces_flg = "unneces_flg";
	/**
	 * Applied sequence 反映順.<p>
	 *
	 */
	public static final String $ref_ord = "ref_ord";
	/**
	 * Operation change 工程変更.<p>
	 *
	 */
	public static final String $oper_chng_flg = "oper_chng_flg";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Design changes contact remarks 設計変更連絡備考.<p>
	 *
	 */
	public static final String $plm_cnt_rmrks = "plm_cnt_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";


	public static final MCMeta chng_no_META = createCommonMeta($chng_no, mcframe.commonMA.meta.MA_META.CHNG_NO);
	public static final MCMeta re_ext_typ_META = createCommonMeta($re_ext_typ, mcframe.commonMS.meta.MS_META.RE_EXT_TYP);
	public static final MCMeta re_ext_typ_nm_META = createCommonMeta($re_ext_typ_nm, mcframe.commonMS.meta.MS_META.RE_EXT_TYP_NM);
	public static final MCMeta unneces_flg_META = createCommonMeta($unneces_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ref_ord_META = createCommonMeta($ref_ord, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_chng_flg_META = createCommonMeta($oper_chng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.RE_EXT_INTR_RMRKS);
	public static final MCMeta plm_cnt_rmrks_META = createCommonMeta($plm_cnt_rmrks, mcframe.commonMA.meta.MA_META.PLM_CNT_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.RE_EXT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.RE_EXT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.RE_EXT_SUB_CHAR3);

	protected static final ConstMetaList<DtlReExtR> constMetas = new ConstMetaList<DtlReExtR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			chng_no_META,
			re_ext_typ_META,
			re_ext_typ_nm_META,
			unneces_flg_META,
			ref_ord_META,
			oper_chng_flg_META,
			intr_rmrks_META,
			plm_cnt_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META
		},
		new String[][]{
			{
			},
			{
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
	protected DtlReExtR_MC_A(ConstMetaList<? extends DtlReExtR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlReExtR clone() {
		return (DtlReExtR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlReExtR createInstance() {
		return (DtlReExtR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlReExtR getValues(String... names) {
		return (DtlReExtR) super.getValues(names);
	}



	/**
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public String chng_no() {
		return getConstString(offset + 0, $chng_no);
	}

	/**
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public void chng_no(String value) {
		setConstString(offset + 0, $chng_no, value);
	}


	/**
	 * Order re-explosion type 指図再展開区分.<p>
	 *
	 */
	public String re_ext_typ() {
		return getConstString(offset + 1, $re_ext_typ);
	}

	/**
	 * Order re-explosion type 指図再展開区分.<p>
	 *
	 */
	public void re_ext_typ(String value) {
		setConstString(offset + 1, $re_ext_typ, value);
	}


	/**
	 * Order re-explosion type name 指図再展開区分名.<p>
	 *
	 */
	public String re_ext_typ_nm() {
		return getConstString(offset + 2, $re_ext_typ_nm);
	}

	/**
	 * Order re-explosion type name 指図再展開区分名.<p>
	 *
	 */
	public void re_ext_typ_nm(String value) {
		setConstString(offset + 2, $re_ext_typ_nm, value);
	}


	/**
	 * Unnecessary 不要.<p>
	 *
	 */
	public boolean unneces_flg() {
		return getConstBoolean(offset + 3, $unneces_flg);
	}

	/**
	 * Unnecessary 不要.<p>
	 *
	 */
	public void unneces_flg(boolean value) {
		setConstBoolean(offset + 3, $unneces_flg, value);
	}


	/**
	 * Applied sequence 反映順.<p>
	 *
	 */
	public MCNumber ref_ord() {
		return getConstNumber(offset + 4, $ref_ord);
	}

	/**
	 * Applied sequence 反映順.<p>
	 *
	 */
	public void ref_ord(MCNumber value) {
		setConstNumber(offset + 4, $ref_ord, value);
	}

	/**
	 * Applied sequence 反映順.<p>
	 *
	 */
	public void ref_ord(int value) {
		setConstNumber(offset + 4, $ref_ord, value);
	}

	/**
	 * Applied sequence 反映順.<p>
	 *
	 */
	public void ref_ord(long value) {
		setConstNumber(offset + 4, $ref_ord, value);
	}

	/**
	 * Applied sequence 反映順.<p>
	 *
	 */
	public void ref_ord(float value) {
		setConstNumber(offset + 4, $ref_ord, value);
	}

	/**
	 * Applied sequence 反映順.<p>
	 *
	 */
	public void ref_ord(double value) {
		setConstNumber(offset + 4, $ref_ord, value);
	}


	/**
	 * Operation change 工程変更.<p>
	 *
	 */
	public boolean oper_chng_flg() {
		return getConstBoolean(offset + 5, $oper_chng_flg);
	}

	/**
	 * Operation change 工程変更.<p>
	 *
	 */
	public void oper_chng_flg(boolean value) {
		setConstBoolean(offset + 5, $oper_chng_flg, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 6, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 6, $intr_rmrks, value);
	}


	/**
	 * Design changes contact remarks 設計変更連絡備考.<p>
	 *
	 */
	public String plm_cnt_rmrks() {
		return getConstString(offset + 7, $plm_cnt_rmrks);
	}

	/**
	 * Design changes contact remarks 設計変更連絡備考.<p>
	 *
	 */
	public void plm_cnt_rmrks(String value) {
		setConstString(offset + 7, $plm_cnt_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 8, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 8, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 9, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 9, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 10, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 10, $sub_char3, value);
	}


	public String getString(String name) {
		if ($chng_no.equalsIgnoreCase(name)) {
			return chng_no();
		}
		if ($re_ext_typ.equalsIgnoreCase(name)) {
			return re_ext_typ();
		}
		if ($re_ext_typ_nm.equalsIgnoreCase(name)) {
			return re_ext_typ_nm();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($plm_cnt_rmrks.equalsIgnoreCase(name)) {
			return plm_cnt_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($ref_ord.equalsIgnoreCase(name)) {
			return ref_ord();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($unneces_flg.equalsIgnoreCase(name)) {
			return unneces_flg();
		}
		if ($oper_chng_flg.equalsIgnoreCase(name)) {
			return oper_chng_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($chng_no.equalsIgnoreCase(name)) {
			return chng_no();
		}
		if ($re_ext_typ.equalsIgnoreCase(name)) {
			return re_ext_typ();
		}
		if ($re_ext_typ_nm.equalsIgnoreCase(name)) {
			return re_ext_typ_nm();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($plm_cnt_rmrks.equalsIgnoreCase(name)) {
			return plm_cnt_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($ref_ord.equalsIgnoreCase(name)) {
			return ref_ord();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($unneces_flg.equalsIgnoreCase(name)) {
			return unneces_flg();
		}
		if ($oper_chng_flg.equalsIgnoreCase(name)) {
			return oper_chng_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($chng_no.equalsIgnoreCase(name)) {
			chng_no(value);
			return;
		}
		if ($re_ext_typ.equalsIgnoreCase(name)) {
			re_ext_typ(value);
			return;
		}
		if ($re_ext_typ_nm.equalsIgnoreCase(name)) {
			re_ext_typ_nm(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($plm_cnt_rmrks.equalsIgnoreCase(name)) {
			plm_cnt_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($ref_ord.equalsIgnoreCase(name)) {
			ref_ord(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($ref_ord.equalsIgnoreCase(name)) {
			ref_ord(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($ref_ord.equalsIgnoreCase(name)) {
			ref_ord(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($ref_ord.equalsIgnoreCase(name)) {
			ref_ord(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($ref_ord.equalsIgnoreCase(name)) {
			ref_ord(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($unneces_flg.equalsIgnoreCase(name)) {
			unneces_flg(value);
			return;
		}
		if ($oper_chng_flg.equalsIgnoreCase(name)) {
			oper_chng_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($chng_no.equalsIgnoreCase(name)) {
			chng_no(value);
			return;
		}
		if ($re_ext_typ.equalsIgnoreCase(name)) {
			re_ext_typ(value);
			return;
		}
		if ($re_ext_typ_nm.equalsIgnoreCase(name)) {
			re_ext_typ_nm(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($plm_cnt_rmrks.equalsIgnoreCase(name)) {
			plm_cnt_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($ref_ord.equalsIgnoreCase(name)) {
			ref_ord(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($ref_ord.equalsIgnoreCase(name)) {
			ref_ord(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($ref_ord.equalsIgnoreCase(name)) {
			ref_ord(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($ref_ord.equalsIgnoreCase(name)) {
			ref_ord(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($ref_ord.equalsIgnoreCase(name)) {
			ref_ord(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($unneces_flg.equalsIgnoreCase(name)) {
			unneces_flg(value);
			return;
		}
		if ($oper_chng_flg.equalsIgnoreCase(name)) {
			oper_chng_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

