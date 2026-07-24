package mcframe.clientMABG.MABGP0530;

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
	public static final String $term_p = "term_p";
	/**
	 * Allocation destination department pattern 配賦先部門パタン.<p>
	 *
	 */
	public static final String $pre_alc_dpt_ptn = "pre_alc_dpt_ptn";
	/**
	 * Allocation source dept. cd. 配賦元部門ＣＤ.<p>
	 *
	 */
	public static final String $src_dpt_cd = "src_dpt_cd";
	/**
	 * Allocation source dept. name 配賦元部門名.<p>
	 *
	 */
	public static final String $src_dpt_nm = "src_dpt_nm";
	/**
	 * Allocation destination dept. cd. 配賦先部門ＣＤ.<p>
	 *
	 */
	public static final String $dst_dpt_cd = "dst_dpt_cd";
	/**
	 * Allocation destination dept. name 配賦先部門名.<p>
	 *
	 */
	public static final String $dst_dpt_nm = "dst_dpt_nm";
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

	public static final String $term_fr = $term_p + ".term_fr";
	public static final String $term_fr_nm = $term_p + ".term_fr_nm";
	public static final String $term_to = $term_p + ".term_to";
	public static final String $term_to_nm = $term_p + ".term_to_nm";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta term_p_META = createInnerRowMeta($term_p, mcframe.clientMAUB.MAUBP0240.TermR.class);
	public static final MCMeta pre_alc_dpt_ptn_META = createCommonMeta($pre_alc_dpt_ptn, mcframe.commonMA.meta.MA_META.PRE_ALC_DPT_PTN);
	public static final MCMeta src_dpt_cd_META = createCommonMeta($src_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta src_dpt_nm_META = createCommonMeta($src_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta dst_dpt_cd_META = createCommonMeta($dst_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta dst_dpt_nm_META = createCommonMeta($dst_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta off_del_flg_META = createCommonMeta($off_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_del_flg_META = createCommonMeta($on_del_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			term_p_META,
			pre_alc_dpt_ptn_META,
			src_dpt_cd_META,
			src_dpt_nm_META,
			dst_dpt_cd_META,
			dst_dpt_nm_META,
			memo1_META,
			memo2_META,
			memo3_META,
			off_del_flg_META,
			on_del_flg_META
		},
		new String[][]{
			{
				"term_fr",
				"term_fr_nm",
				"term_to",
				"term_to_nm"
			},
			{
				$term_fr,
				$term_fr_nm,
				$term_to,
				$term_to_nm
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$term_p + ".term_fr", "term"},	// term_p.term_fr
				{$term_p + ".term_to", "term"},	// term_p.term_to
				{$src_dpt_cd, "dpt_nm"},	// src_dpt_cd
				{$dst_dpt_cd, "dpt_nm"}	// dst_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$src_dpt_cd, "term_fr;true"},	// src_dpt_cd
				{$dst_dpt_cd, "term_fr;true"}	// dst_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$src_dpt_cd, "ym;mode_this_month_flg"},	// src_dpt_cd
				{$dst_dpt_cd, "ym;mode_this_month_flg"}	// dst_dpt_cd
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


	public mcframe.clientMAUB.MAUBP0240.TermR term_p(){
		return (mcframe.clientMAUB.MAUBP0240.TermR) getConstInnerRow(offset + 1, $term_p);
	}
	
	public void term_p(mcframe.clientMAUB.MAUBP0240.TermR row){
		setConstInnerRow(offset + 1, $term_p, row);
	}


	/**
	 * Allocation destination department pattern 配賦先部門パタン.<p>
	 *
	 */
	public String pre_alc_dpt_ptn() {
		return getConstString(offset + 2, $pre_alc_dpt_ptn);
	}

	/**
	 * Allocation destination department pattern 配賦先部門パタン.<p>
	 *
	 */
	public void pre_alc_dpt_ptn(String value) {
		setConstString(offset + 2, $pre_alc_dpt_ptn, value);
	}


	/**
	 * Allocation source dept. cd. 配賦元部門ＣＤ.<p>
	 *
	 */
	public String src_dpt_cd() {
		return getConstString(offset + 3, $src_dpt_cd);
	}

	/**
	 * Allocation source dept. cd. 配賦元部門ＣＤ.<p>
	 *
	 */
	public void src_dpt_cd(String value) {
		setConstString(offset + 3, $src_dpt_cd, value);
	}


	/**
	 * Allocation source dept. name 配賦元部門名.<p>
	 *
	 */
	public String src_dpt_nm() {
		return getConstString(offset + 4, $src_dpt_nm);
	}

	/**
	 * Allocation source dept. name 配賦元部門名.<p>
	 *
	 */
	public void src_dpt_nm(String value) {
		setConstString(offset + 4, $src_dpt_nm, value);
	}


	/**
	 * Allocation destination dept. cd. 配賦先部門ＣＤ.<p>
	 *
	 */
	public String dst_dpt_cd() {
		return getConstString(offset + 5, $dst_dpt_cd);
	}

	/**
	 * Allocation destination dept. cd. 配賦先部門ＣＤ.<p>
	 *
	 */
	public void dst_dpt_cd(String value) {
		setConstString(offset + 5, $dst_dpt_cd, value);
	}


	/**
	 * Allocation destination dept. name 配賦先部門名.<p>
	 *
	 */
	public String dst_dpt_nm() {
		return getConstString(offset + 6, $dst_dpt_nm);
	}

	/**
	 * Allocation destination dept. name 配賦先部門名.<p>
	 *
	 */
	public void dst_dpt_nm(String value) {
		setConstString(offset + 6, $dst_dpt_nm, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 7, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 7, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 8, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 8, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 9, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 9, $memo3, value);
	}


	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public boolean off_del_flg() {
		return getConstBoolean(offset + 10, $off_del_flg);
	}

	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public void off_del_flg(boolean value) {
		setConstBoolean(offset + 10, $off_del_flg, value);
	}


	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public boolean on_del_flg() {
		return getConstBoolean(offset + 11, $on_del_flg);
	}

	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public void on_del_flg(boolean value) {
		setConstBoolean(offset + 11, $on_del_flg, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($pre_alc_dpt_ptn.equalsIgnoreCase(name)) {
			return pre_alc_dpt_ptn();
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			return src_dpt_cd();
		}
		if ($src_dpt_nm.equalsIgnoreCase(name)) {
			return src_dpt_nm();
		}
		if ($dst_dpt_cd.equalsIgnoreCase(name)) {
			return dst_dpt_cd();
		}
		if ($dst_dpt_nm.equalsIgnoreCase(name)) {
			return dst_dpt_nm();
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
		if ($pre_alc_dpt_ptn.equalsIgnoreCase(name)) {
			return pre_alc_dpt_ptn();
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			return src_dpt_cd();
		}
		if ($src_dpt_nm.equalsIgnoreCase(name)) {
			return src_dpt_nm();
		}
		if ($dst_dpt_cd.equalsIgnoreCase(name)) {
			return dst_dpt_cd();
		}
		if ($dst_dpt_nm.equalsIgnoreCase(name)) {
			return dst_dpt_nm();
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
		if ($pre_alc_dpt_ptn.equalsIgnoreCase(name)) {
			pre_alc_dpt_ptn(value);
			return;
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			src_dpt_cd(value);
			return;
		}
		if ($src_dpt_nm.equalsIgnoreCase(name)) {
			src_dpt_nm(value);
			return;
		}
		if ($dst_dpt_cd.equalsIgnoreCase(name)) {
			dst_dpt_cd(value);
			return;
		}
		if ($dst_dpt_nm.equalsIgnoreCase(name)) {
			dst_dpt_nm(value);
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
		if ($pre_alc_dpt_ptn.equalsIgnoreCase(name)) {
			pre_alc_dpt_ptn(value);
			return;
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			src_dpt_cd(value);
			return;
		}
		if ($src_dpt_nm.equalsIgnoreCase(name)) {
			src_dpt_nm(value);
			return;
		}
		if ($dst_dpt_cd.equalsIgnoreCase(name)) {
			dst_dpt_cd(value);
			return;
		}
		if ($dst_dpt_nm.equalsIgnoreCase(name)) {
			dst_dpt_nm(value);
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
		if ($term_p.equalsIgnoreCase(name)) {
			return term_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($term_p.equalsIgnoreCase(name)) {
			term_p(
				((MCContainerMeta) term_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0240.TermR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCDate term_fr() {
		return term_p().term_fr();
	}

	public void term_fr(MCDate value) {
		term_p().term_fr(value);
	}

	public String term_fr_nm() {
		return term_p().term_fr_nm();
	}

	public void term_fr_nm(String value) {
		term_p().term_fr_nm(value);
	}

	public MCDate term_to() {
		return term_p().term_to();
	}

	public void term_to(MCDate value) {
		term_p().term_to(value);
	}

	public String term_to_nm() {
		return term_p().term_to_nm();
	}

	public void term_to_nm(String value) {
		term_p().term_to_nm(value);
	}

}

