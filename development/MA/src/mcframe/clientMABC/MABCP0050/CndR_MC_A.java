package mcframe.clientMABC.MABCP0050;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public static final String $ope = "ope";
	public static final String $dt_p = "dt_p";
	/**
	 * Exchange-from currency cd. 換算元通貨ＣＤ.<p>
	 *
	 */
	public static final String $fr_cur_cd = "fr_cur_cd";
	/**
	 * Exchange-from currency name 換算元通貨名.<p>
	 *
	 */
	public static final String $fr_cur_nm = "fr_cur_nm";
	/**
	 * Exchange-to currency cd. 換算先通貨ＣＤ.<p>
	 *
	 */
	public static final String $to_cur_cd = "to_cur_cd";
	/**
	 * Exchange-to currency name 換算先通貨名.<p>
	 *
	 */
	public static final String $to_cur_nm = "to_cur_nm";
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public static final String $xrate_nm = "xrate_nm";
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
	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public static final String $off_del_flg = "off_del_flg";
	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public static final String $on_del_flg = "on_del_flg";

	public static final String $st_dt_fr = $dt_p + ".st_dt_fr";
	public static final String $st_dt_to = $dt_p + ".st_dt_to";
	public static final String $end_dt_fr = $dt_p + ".end_dt_fr";
	public static final String $end_dt_to = $dt_p + ".end_dt_to";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta dt_p_META = createInnerRowMeta($dt_p, mcframe.clientMAUB.MAUBP0020.StEndDtR.class);
	public static final MCMeta fr_cur_cd_META = createCommonMeta($fr_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta fr_cur_nm_META = createCommonMeta($fr_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta to_cur_cd_META = createCommonMeta($to_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta to_cur_nm_META = createCommonMeta($to_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta xrate_nm_META = createCommonMeta($xrate_nm, mcframe.commonMA.meta.MA_META.XRATE_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta off_del_flg_META = createCommonMeta($off_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_del_flg_META = createCommonMeta($on_del_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			dt_p_META,
			fr_cur_cd_META,
			fr_cur_nm_META,
			to_cur_cd_META,
			to_cur_nm_META,
			xrate_cd_META,
			xrate_nm_META,
			memo1_META,
			memo2_META,
			memo3_META,
			off_del_flg_META,
			on_del_flg_META
		},
		new String[][]{
			{
				"st_dt_fr",
				"st_dt_to",
				"end_dt_fr",
				"end_dt_to"
			},
			{
				$st_dt_fr,
				$st_dt_to,
				$end_dt_fr,
				$end_dt_to
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$fr_cur_cd, "cur_nm"},	// fr_cur_cd
				{$to_cur_cd, "cur_nm"}	// to_cur_cd
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	public mcframe.clientMAUB.MAUBP0020.StEndDtR dt_p(){
		return (mcframe.clientMAUB.MAUBP0020.StEndDtR) getConstInnerRow(offset + 1, $dt_p);
	}
	
	public void dt_p(mcframe.clientMAUB.MAUBP0020.StEndDtR row){
		setConstInnerRow(offset + 1, $dt_p, row);
	}


	/**
	 * Exchange-from currency cd. 換算元通貨ＣＤ.<p>
	 *
	 */
	public String fr_cur_cd() {
		return getConstString(offset + 2, $fr_cur_cd);
	}

	/**
	 * Exchange-from currency cd. 換算元通貨ＣＤ.<p>
	 *
	 */
	public void fr_cur_cd(String value) {
		setConstString(offset + 2, $fr_cur_cd, value);
	}


	/**
	 * Exchange-from currency name 換算元通貨名.<p>
	 *
	 */
	public String fr_cur_nm() {
		return getConstString(offset + 3, $fr_cur_nm);
	}

	/**
	 * Exchange-from currency name 換算元通貨名.<p>
	 *
	 */
	public void fr_cur_nm(String value) {
		setConstString(offset + 3, $fr_cur_nm, value);
	}


	/**
	 * Exchange-to currency cd. 換算先通貨ＣＤ.<p>
	 *
	 */
	public String to_cur_cd() {
		return getConstString(offset + 4, $to_cur_cd);
	}

	/**
	 * Exchange-to currency cd. 換算先通貨ＣＤ.<p>
	 *
	 */
	public void to_cur_cd(String value) {
		setConstString(offset + 4, $to_cur_cd, value);
	}


	/**
	 * Exchange-to currency name 換算先通貨名.<p>
	 *
	 */
	public String to_cur_nm() {
		return getConstString(offset + 5, $to_cur_nm);
	}

	/**
	 * Exchange-to currency name 換算先通貨名.<p>
	 *
	 */
	public void to_cur_nm(String value) {
		setConstString(offset + 5, $to_cur_nm, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 6, $xrate_cd);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 6, $xrate_cd, value);
	}


	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public String xrate_nm() {
		return getConstString(offset + 7, $xrate_nm);
	}

	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public void xrate_nm(String value) {
		setConstString(offset + 7, $xrate_nm, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 8, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 8, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 9, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 9, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 10, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 10, $memo3, value);
	}


	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public boolean off_del_flg() {
		return getConstBoolean(offset + 11, $off_del_flg);
	}

	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public void off_del_flg(boolean value) {
		setConstBoolean(offset + 11, $off_del_flg, value);
	}


	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public boolean on_del_flg() {
		return getConstBoolean(offset + 12, $on_del_flg);
	}

	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public void on_del_flg(boolean value) {
		setConstBoolean(offset + 12, $on_del_flg, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($fr_cur_cd.equalsIgnoreCase(name)) {
			return fr_cur_cd();
		}
		if ($fr_cur_nm.equalsIgnoreCase(name)) {
			return fr_cur_nm();
		}
		if ($to_cur_cd.equalsIgnoreCase(name)) {
			return to_cur_cd();
		}
		if ($to_cur_nm.equalsIgnoreCase(name)) {
			return to_cur_nm();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			return xrate_nm();
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
		if ($off_del_flg.equalsIgnoreCase(name)) {
			return off_del_flg();
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			return on_del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($fr_cur_cd.equalsIgnoreCase(name)) {
			return fr_cur_cd();
		}
		if ($fr_cur_nm.equalsIgnoreCase(name)) {
			return fr_cur_nm();
		}
		if ($to_cur_cd.equalsIgnoreCase(name)) {
			return to_cur_cd();
		}
		if ($to_cur_nm.equalsIgnoreCase(name)) {
			return to_cur_nm();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			return xrate_nm();
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
		if ($off_del_flg.equalsIgnoreCase(name)) {
			return off_del_flg();
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			return on_del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($fr_cur_cd.equalsIgnoreCase(name)) {
			fr_cur_cd(value);
			return;
		}
		if ($fr_cur_nm.equalsIgnoreCase(name)) {
			fr_cur_nm(value);
			return;
		}
		if ($to_cur_cd.equalsIgnoreCase(name)) {
			to_cur_cd(value);
			return;
		}
		if ($to_cur_nm.equalsIgnoreCase(name)) {
			to_cur_nm(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			xrate_nm(value);
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
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($fr_cur_cd.equalsIgnoreCase(name)) {
			fr_cur_cd(value);
			return;
		}
		if ($fr_cur_nm.equalsIgnoreCase(name)) {
			fr_cur_nm(value);
			return;
		}
		if ($to_cur_cd.equalsIgnoreCase(name)) {
			to_cur_cd(value);
			return;
		}
		if ($to_cur_nm.equalsIgnoreCase(name)) {
			to_cur_nm(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			xrate_nm(value);
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

	public MCRow getInnerRow(String name) {
		if ($dt_p.equalsIgnoreCase(name)) {
			return dt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($dt_p.equalsIgnoreCase(name)) {
			dt_p(
				((MCContainerMeta) dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0020.StEndDtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCDate st_dt_fr() {
		return dt_p().st_dt_fr();
	}

	public void st_dt_fr(MCDate value) {
		dt_p().st_dt_fr(value);
	}

	public MCDate st_dt_to() {
		return dt_p().st_dt_to();
	}

	public void st_dt_to(MCDate value) {
		dt_p().st_dt_to(value);
	}

	public MCDate end_dt_fr() {
		return dt_p().end_dt_fr();
	}

	public void end_dt_fr(MCDate value) {
		dt_p().end_dt_fr(value);
	}

	public MCDate end_dt_to() {
		return dt_p().end_dt_to();
	}

	public void end_dt_to(MCDate value) {
		dt_p().end_dt_to(value);
	}

}

