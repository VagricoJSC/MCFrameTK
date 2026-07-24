package mcframe.serverMSBB.MSBBL1210;

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
 * ブロック"Rslt_DtlSpec"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Rslt_DtlSpecR_MC_A extends MCConstRow {

	/**
	 * Sales item specification detail No. 販売品目仕様項目ＮＯ.<p>
	 *
	 */
	public static final String $spec_desc_no = "spec_desc_no";
	/**
	 * Sales item specification No. 販売品目仕様ＮＯ.<p>
	 *
	 */
	public static final String $sls_itm_spec_no = "sls_itm_spec_no";
	/**
	 * Sales item No. 販売品目ＮＯ.<p>
	 *
	 */
	public static final String $sls_itm_no = "sls_itm_no";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Specification row No. 仕様行ＮＯ.<p>
	 *
	 */
	public static final String $slo_itm_spec_lno = "slo_itm_spec_lno";
	/**
	 * Configuration row No. 構成行ＮＯ.<p>
	 *
	 */
	public static final String $slo_itm_comp_lno = "slo_itm_comp_lno";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Specification cd. 仕様ＣＤ.<p>
	 *
	 */
	public static final String $spec_cd = "spec_cd";
	/**
	 * Specification detail cd. 仕様項目ＣＤ.<p>
	 *
	 */
	public static final String $spec_desc_cd = "spec_desc_cd";
	/**
	 * Specification detail remarks 仕様項目備考.<p>
	 *
	 */
	public static final String $rmrks = "rmrks";
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
	/**
	 * Sales item configuration specification detail No. 販売品目構成仕様項目ＮＯ.<p>
	 *
	 */
	public static final String $comp_spec_desc_no = "comp_spec_desc_no";


	public static final MCMeta spec_desc_no_META = createCommonMeta($spec_desc_no, mcframe.commonMA.meta.MA_META.SPEC_DESC_NO);
	public static final MCMeta sls_itm_spec_no_META = createCommonMeta($sls_itm_spec_no, mcframe.commonMA.meta.MA_META.SLS_ITM_SPEC_NO);
	public static final MCMeta sls_itm_no_META = createCommonMeta($sls_itm_no, mcframe.commonMA.meta.MA_META.SLS_ITM_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta slo_itm_spec_lno_META = createCommonMeta($slo_itm_spec_lno, mcframe.commonMA.meta.MA_META.ITM_SPEC_LNO);
	public static final MCMeta slo_itm_comp_lno_META = createCommonMeta($slo_itm_comp_lno, mcframe.commonMA.meta.MA_META.ITM_COMP_LNO);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta spec_cd_META = createCommonMeta($spec_cd, mcframe.commonMA.meta.MA_META.SPEC_CD);
	public static final MCMeta spec_desc_cd_META = createCommonMeta($spec_desc_cd, mcframe.commonMA.meta.MA_META.SPEC_DESC_CD);
	public static final MCMeta rmrks_META = createCommonMeta($rmrks, mcframe.commonMS.meta.MS_META.SPEC_DESC_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SPEC_DESC_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SPEC_DESC_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SPEC_DESC_SUB_CHAR3);
	public static final MCMeta comp_spec_desc_no_META = createCommonMeta($comp_spec_desc_no, mcframe.commonMA.meta.MA_META.COMP_SPEC_DESC_NO);

	protected static final ConstMetaList<Rslt_DtlSpecR> constMetas = new ConstMetaList<Rslt_DtlSpecR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			spec_desc_no_META,
			sls_itm_spec_no_META,
			sls_itm_no_META,
			slo_d_no_META,
			slo_itm_spec_lno_META,
			slo_itm_comp_lno_META,
			itm_cd_META,
			itm_nm_META,
			spec_cd_META,
			spec_desc_cd_META,
			rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			comp_spec_desc_no_META
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
	protected Rslt_DtlSpecR_MC_A(ConstMetaList<? extends Rslt_DtlSpecR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Rslt_DtlSpecR clone() {
		return (Rslt_DtlSpecR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Rslt_DtlSpecR createInstance() {
		return (Rslt_DtlSpecR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Rslt_DtlSpecR getValues(String... names) {
		return (Rslt_DtlSpecR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Sales item specification detail No. 販売品目仕様項目ＮＯ.<p>
	 *
	 */
	public String spec_desc_no() {
		return getConstString(offset + 0, $spec_desc_no);
	}

	/**
	 * Sales item specification detail No. 販売品目仕様項目ＮＯ.<p>
	 *
	 */
	public void spec_desc_no(String value) {
		setConstString(offset + 0, $spec_desc_no, value);
	}


	/**
	 * Sales item specification No. 販売品目仕様ＮＯ.<p>
	 *
	 */
	public String sls_itm_spec_no() {
		return getConstString(offset + 1, $sls_itm_spec_no);
	}

	/**
	 * Sales item specification No. 販売品目仕様ＮＯ.<p>
	 *
	 */
	public void sls_itm_spec_no(String value) {
		setConstString(offset + 1, $sls_itm_spec_no, value);
	}


	/**
	 * Sales item No. 販売品目ＮＯ.<p>
	 *
	 */
	public String sls_itm_no() {
		return getConstString(offset + 2, $sls_itm_no);
	}

	/**
	 * Sales item No. 販売品目ＮＯ.<p>
	 *
	 */
	public void sls_itm_no(String value) {
		setConstString(offset + 2, $sls_itm_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 3, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 3, $slo_d_no, value);
	}


	/**
	 * Specification row No. 仕様行ＮＯ.<p>
	 *
	 */
	public String slo_itm_spec_lno() {
		return getConstString(offset + 4, $slo_itm_spec_lno);
	}

	/**
	 * Specification row No. 仕様行ＮＯ.<p>
	 *
	 */
	public void slo_itm_spec_lno(String value) {
		setConstString(offset + 4, $slo_itm_spec_lno, value);
	}


	/**
	 * Configuration row No. 構成行ＮＯ.<p>
	 *
	 */
	public String slo_itm_comp_lno() {
		return getConstString(offset + 5, $slo_itm_comp_lno);
	}

	/**
	 * Configuration row No. 構成行ＮＯ.<p>
	 *
	 */
	public void slo_itm_comp_lno(String value) {
		setConstString(offset + 5, $slo_itm_comp_lno, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 6, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 6, $itm_cd, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 7, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 7, $itm_nm, value);
	}


	/**
	 * Specification cd. 仕様ＣＤ.<p>
	 *
	 */
	public String spec_cd() {
		return getConstString(offset + 8, $spec_cd);
	}

	/**
	 * Specification cd. 仕様ＣＤ.<p>
	 *
	 */
	public void spec_cd(String value) {
		setConstString(offset + 8, $spec_cd, value);
	}


	/**
	 * Specification detail cd. 仕様項目ＣＤ.<p>
	 *
	 */
	public String spec_desc_cd() {
		return getConstString(offset + 9, $spec_desc_cd);
	}

	/**
	 * Specification detail cd. 仕様項目ＣＤ.<p>
	 *
	 */
	public void spec_desc_cd(String value) {
		setConstString(offset + 9, $spec_desc_cd, value);
	}


	/**
	 * Specification detail remarks 仕様項目備考.<p>
	 *
	 */
	public String rmrks() {
		return getConstString(offset + 10, $rmrks);
	}

	/**
	 * Specification detail remarks 仕様項目備考.<p>
	 *
	 */
	public void rmrks(String value) {
		setConstString(offset + 10, $rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 11, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 11, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 12, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 12, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 13, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 13, $sub_char3, value);
	}


	/**
	 * Sales item configuration specification detail No. 販売品目構成仕様項目ＮＯ.<p>
	 *
	 */
	public String comp_spec_desc_no() {
		return getConstString(offset + 14, $comp_spec_desc_no);
	}

	/**
	 * Sales item configuration specification detail No. 販売品目構成仕様項目ＮＯ.<p>
	 *
	 */
	public void comp_spec_desc_no(String value) {
		setConstString(offset + 14, $comp_spec_desc_no, value);
	}


	public String getString(String name) {
		if ($spec_desc_no.equalsIgnoreCase(name)) {
			return spec_desc_no();
		}
		if ($sls_itm_spec_no.equalsIgnoreCase(name)) {
			return sls_itm_spec_no();
		}
		if ($sls_itm_no.equalsIgnoreCase(name)) {
			return sls_itm_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($slo_itm_spec_lno.equalsIgnoreCase(name)) {
			return slo_itm_spec_lno();
		}
		if ($slo_itm_comp_lno.equalsIgnoreCase(name)) {
			return slo_itm_comp_lno();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($spec_cd.equalsIgnoreCase(name)) {
			return spec_cd();
		}
		if ($spec_desc_cd.equalsIgnoreCase(name)) {
			return spec_desc_cd();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
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
		if ($comp_spec_desc_no.equalsIgnoreCase(name)) {
			return comp_spec_desc_no();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($spec_desc_no.equalsIgnoreCase(name)) {
			return spec_desc_no();
		}
		if ($sls_itm_spec_no.equalsIgnoreCase(name)) {
			return sls_itm_spec_no();
		}
		if ($sls_itm_no.equalsIgnoreCase(name)) {
			return sls_itm_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($slo_itm_spec_lno.equalsIgnoreCase(name)) {
			return slo_itm_spec_lno();
		}
		if ($slo_itm_comp_lno.equalsIgnoreCase(name)) {
			return slo_itm_comp_lno();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($spec_cd.equalsIgnoreCase(name)) {
			return spec_cd();
		}
		if ($spec_desc_cd.equalsIgnoreCase(name)) {
			return spec_desc_cd();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
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
		if ($comp_spec_desc_no.equalsIgnoreCase(name)) {
			return comp_spec_desc_no();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($spec_desc_no.equalsIgnoreCase(name)) {
			spec_desc_no(value);
			return;
		}
		if ($sls_itm_spec_no.equalsIgnoreCase(name)) {
			sls_itm_spec_no(value);
			return;
		}
		if ($sls_itm_no.equalsIgnoreCase(name)) {
			sls_itm_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($slo_itm_spec_lno.equalsIgnoreCase(name)) {
			slo_itm_spec_lno(value);
			return;
		}
		if ($slo_itm_comp_lno.equalsIgnoreCase(name)) {
			slo_itm_comp_lno(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($spec_cd.equalsIgnoreCase(name)) {
			spec_cd(value);
			return;
		}
		if ($spec_desc_cd.equalsIgnoreCase(name)) {
			spec_desc_cd(value);
			return;
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
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
		if ($comp_spec_desc_no.equalsIgnoreCase(name)) {
			comp_spec_desc_no(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($spec_desc_no.equalsIgnoreCase(name)) {
			spec_desc_no(value);
			return;
		}
		if ($sls_itm_spec_no.equalsIgnoreCase(name)) {
			sls_itm_spec_no(value);
			return;
		}
		if ($sls_itm_no.equalsIgnoreCase(name)) {
			sls_itm_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($slo_itm_spec_lno.equalsIgnoreCase(name)) {
			slo_itm_spec_lno(value);
			return;
		}
		if ($slo_itm_comp_lno.equalsIgnoreCase(name)) {
			slo_itm_comp_lno(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($spec_cd.equalsIgnoreCase(name)) {
			spec_cd(value);
			return;
		}
		if ($spec_desc_cd.equalsIgnoreCase(name)) {
			spec_desc_cd(value);
			return;
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
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
		if ($comp_spec_desc_no.equalsIgnoreCase(name)) {
			comp_spec_desc_no(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

