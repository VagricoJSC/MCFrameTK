package mcframe.serverMSBB.MSBBL4020;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Quotation sales order reason cd. 見積受注理由ＣＤ.<p>
	 *
	 */
	public static final String $slo_rsn_cd = "slo_rsn_cd";
	/**
	 * Quotation sales order reason name 見積受注理由名.<p>
	 *
	 */
	public static final String $slo_rsn_nm = "slo_rsn_nm";
	/**
	 * Quotation terms off 見積条件オフ.<p>
	 *
	 */
	public static final String $off_qtn_term_flg = "off_qtn_term_flg";
	/**
	 * Quotation terms on 見積条件オン.<p>
	 *
	 */
	public static final String $on_qtn_term_flg = "on_qtn_term_flg";
	/**
	 * Quotation result off 見積結果オフ.<p>
	 *
	 */
	public static final String $off_qtn_rslt_flg = "off_qtn_rslt_flg";
	/**
	 * Quotation result on 見積結果オン.<p>
	 *
	 */
	public static final String $on_qtn_rslt_flg = "on_qtn_rslt_flg";
	/**
	 * Sales order cancel off 受注取消オフ.<p>
	 *
	 */
	public static final String $off_slo_can_flg = "off_slo_can_flg";
	/**
	 * Sales order cancel on 受注取消オン.<p>
	 *
	 */
	public static final String $on_slo_can_flg = "on_slo_can_flg";
	/**
	 * Logical delete off 論理削除オフ.<p>
	 *
	 */
	public static final String $off_del_flg = "off_del_flg";
	/**
	 * Logical delete on 論理削除オン.<p>
	 *
	 */
	public static final String $on_del_flg = "on_del_flg";
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";


	public static final MCMeta slo_rsn_cd_META = createCommonMeta($slo_rsn_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta slo_rsn_nm_META = createCommonMeta($slo_rsn_nm, mcframe.commonMS.meta.MS_META.SLO_RSN_NM);
	public static final MCMeta off_qtn_term_flg_META = createCommonMeta($off_qtn_term_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_qtn_term_flg_META = createCommonMeta($on_qtn_term_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta off_qtn_rslt_flg_META = createCommonMeta($off_qtn_rslt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_qtn_rslt_flg_META = createCommonMeta($on_qtn_rslt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta off_slo_can_flg_META = createCommonMeta($off_slo_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_slo_can_flg_META = createCommonMeta($on_slo_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta off_del_flg_META = createCommonMeta($off_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_del_flg_META = createCommonMeta($on_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			slo_rsn_cd_META,
			slo_rsn_nm_META,
			off_qtn_term_flg_META,
			on_qtn_term_flg_META,
			off_qtn_rslt_flg_META,
			on_qtn_rslt_flg_META,
			off_slo_can_flg_META,
			on_slo_can_flg_META,
			off_del_flg_META,
			on_del_flg_META,
			memo1_META,
			memo2_META,
			memo3_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Quotation sales order reason cd. 見積受注理由ＣＤ.<p>
	 *
	 */
	public String slo_rsn_cd() {
		return getConstString(offset + 0, $slo_rsn_cd);
	}

	/**
	 * Quotation sales order reason cd. 見積受注理由ＣＤ.<p>
	 *
	 */
	public void slo_rsn_cd(String value) {
		setConstString(offset + 0, $slo_rsn_cd, value);
	}


	/**
	 * Quotation sales order reason name 見積受注理由名.<p>
	 *
	 */
	public String slo_rsn_nm() {
		return getConstString(offset + 1, $slo_rsn_nm);
	}

	/**
	 * Quotation sales order reason name 見積受注理由名.<p>
	 *
	 */
	public void slo_rsn_nm(String value) {
		setConstString(offset + 1, $slo_rsn_nm, value);
	}


	/**
	 * Quotation terms off 見積条件オフ.<p>
	 *
	 */
	public boolean off_qtn_term_flg() {
		return getConstBoolean(offset + 2, $off_qtn_term_flg);
	}

	/**
	 * Quotation terms off 見積条件オフ.<p>
	 *
	 */
	public void off_qtn_term_flg(boolean value) {
		setConstBoolean(offset + 2, $off_qtn_term_flg, value);
	}


	/**
	 * Quotation terms on 見積条件オン.<p>
	 *
	 */
	public boolean on_qtn_term_flg() {
		return getConstBoolean(offset + 3, $on_qtn_term_flg);
	}

	/**
	 * Quotation terms on 見積条件オン.<p>
	 *
	 */
	public void on_qtn_term_flg(boolean value) {
		setConstBoolean(offset + 3, $on_qtn_term_flg, value);
	}


	/**
	 * Quotation result off 見積結果オフ.<p>
	 *
	 */
	public boolean off_qtn_rslt_flg() {
		return getConstBoolean(offset + 4, $off_qtn_rslt_flg);
	}

	/**
	 * Quotation result off 見積結果オフ.<p>
	 *
	 */
	public void off_qtn_rslt_flg(boolean value) {
		setConstBoolean(offset + 4, $off_qtn_rslt_flg, value);
	}


	/**
	 * Quotation result on 見積結果オン.<p>
	 *
	 */
	public boolean on_qtn_rslt_flg() {
		return getConstBoolean(offset + 5, $on_qtn_rslt_flg);
	}

	/**
	 * Quotation result on 見積結果オン.<p>
	 *
	 */
	public void on_qtn_rslt_flg(boolean value) {
		setConstBoolean(offset + 5, $on_qtn_rslt_flg, value);
	}


	/**
	 * Sales order cancel off 受注取消オフ.<p>
	 *
	 */
	public boolean off_slo_can_flg() {
		return getConstBoolean(offset + 6, $off_slo_can_flg);
	}

	/**
	 * Sales order cancel off 受注取消オフ.<p>
	 *
	 */
	public void off_slo_can_flg(boolean value) {
		setConstBoolean(offset + 6, $off_slo_can_flg, value);
	}


	/**
	 * Sales order cancel on 受注取消オン.<p>
	 *
	 */
	public boolean on_slo_can_flg() {
		return getConstBoolean(offset + 7, $on_slo_can_flg);
	}

	/**
	 * Sales order cancel on 受注取消オン.<p>
	 *
	 */
	public void on_slo_can_flg(boolean value) {
		setConstBoolean(offset + 7, $on_slo_can_flg, value);
	}


	/**
	 * Logical delete off 論理削除オフ.<p>
	 *
	 */
	public boolean off_del_flg() {
		return getConstBoolean(offset + 8, $off_del_flg);
	}

	/**
	 * Logical delete off 論理削除オフ.<p>
	 *
	 */
	public void off_del_flg(boolean value) {
		setConstBoolean(offset + 8, $off_del_flg, value);
	}


	/**
	 * Logical delete on 論理削除オン.<p>
	 *
	 */
	public boolean on_del_flg() {
		return getConstBoolean(offset + 9, $on_del_flg);
	}

	/**
	 * Logical delete on 論理削除オン.<p>
	 *
	 */
	public void on_del_flg(boolean value) {
		setConstBoolean(offset + 9, $on_del_flg, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 10, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 10, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 11, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 11, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 12, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 12, $memo3, value);
	}


	public String getString(String name) {
		if ($slo_rsn_cd.equalsIgnoreCase(name)) {
			return slo_rsn_cd();
		}
		if ($slo_rsn_nm.equalsIgnoreCase(name)) {
			return slo_rsn_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($off_qtn_term_flg.equalsIgnoreCase(name)) {
			return off_qtn_term_flg();
		}
		if ($on_qtn_term_flg.equalsIgnoreCase(name)) {
			return on_qtn_term_flg();
		}
		if ($off_qtn_rslt_flg.equalsIgnoreCase(name)) {
			return off_qtn_rslt_flg();
		}
		if ($on_qtn_rslt_flg.equalsIgnoreCase(name)) {
			return on_qtn_rslt_flg();
		}
		if ($off_slo_can_flg.equalsIgnoreCase(name)) {
			return off_slo_can_flg();
		}
		if ($on_slo_can_flg.equalsIgnoreCase(name)) {
			return on_slo_can_flg();
		}
		if ($off_del_flg.equalsIgnoreCase(name)) {
			return off_del_flg();
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			return on_del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($slo_rsn_cd.equalsIgnoreCase(name)) {
			return slo_rsn_cd();
		}
		if ($slo_rsn_nm.equalsIgnoreCase(name)) {
			return slo_rsn_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($off_qtn_term_flg.equalsIgnoreCase(name)) {
			return off_qtn_term_flg();
		}
		if ($on_qtn_term_flg.equalsIgnoreCase(name)) {
			return on_qtn_term_flg();
		}
		if ($off_qtn_rslt_flg.equalsIgnoreCase(name)) {
			return off_qtn_rslt_flg();
		}
		if ($on_qtn_rslt_flg.equalsIgnoreCase(name)) {
			return on_qtn_rslt_flg();
		}
		if ($off_slo_can_flg.equalsIgnoreCase(name)) {
			return off_slo_can_flg();
		}
		if ($on_slo_can_flg.equalsIgnoreCase(name)) {
			return on_slo_can_flg();
		}
		if ($off_del_flg.equalsIgnoreCase(name)) {
			return off_del_flg();
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			return on_del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($slo_rsn_cd.equalsIgnoreCase(name)) {
			slo_rsn_cd(value);
			return;
		}
		if ($slo_rsn_nm.equalsIgnoreCase(name)) {
			slo_rsn_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($off_qtn_term_flg.equalsIgnoreCase(name)) {
			off_qtn_term_flg(value);
			return;
		}
		if ($on_qtn_term_flg.equalsIgnoreCase(name)) {
			on_qtn_term_flg(value);
			return;
		}
		if ($off_qtn_rslt_flg.equalsIgnoreCase(name)) {
			off_qtn_rslt_flg(value);
			return;
		}
		if ($on_qtn_rslt_flg.equalsIgnoreCase(name)) {
			on_qtn_rslt_flg(value);
			return;
		}
		if ($off_slo_can_flg.equalsIgnoreCase(name)) {
			off_slo_can_flg(value);
			return;
		}
		if ($on_slo_can_flg.equalsIgnoreCase(name)) {
			on_slo_can_flg(value);
			return;
		}
		if ($off_del_flg.equalsIgnoreCase(name)) {
			off_del_flg(value);
			return;
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			on_del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($slo_rsn_cd.equalsIgnoreCase(name)) {
			slo_rsn_cd(value);
			return;
		}
		if ($slo_rsn_nm.equalsIgnoreCase(name)) {
			slo_rsn_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($off_qtn_term_flg.equalsIgnoreCase(name)) {
			off_qtn_term_flg(value);
			return;
		}
		if ($on_qtn_term_flg.equalsIgnoreCase(name)) {
			on_qtn_term_flg(value);
			return;
		}
		if ($off_qtn_rslt_flg.equalsIgnoreCase(name)) {
			off_qtn_rslt_flg(value);
			return;
		}
		if ($on_qtn_rslt_flg.equalsIgnoreCase(name)) {
			on_qtn_rslt_flg(value);
			return;
		}
		if ($off_slo_can_flg.equalsIgnoreCase(name)) {
			off_slo_can_flg(value);
			return;
		}
		if ($on_slo_can_flg.equalsIgnoreCase(name)) {
			on_slo_can_flg(value);
			return;
		}
		if ($off_del_flg.equalsIgnoreCase(name)) {
			off_del_flg(value);
			return;
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			on_del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

