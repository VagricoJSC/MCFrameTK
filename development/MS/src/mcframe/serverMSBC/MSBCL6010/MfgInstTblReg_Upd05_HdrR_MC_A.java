package mcframe.serverMSBC.MSBCL6010;

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
 * ブロック"MfgInstTblReg_Upd05_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstTblReg_Upd05_HdrR_MC_A extends MCConstRow {

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Save order flg. 指図保存ＦＬＧ.<p>
	 *
	 */
	public static final String $sts_sav_flg = "sts_sav_flg";
	/**
	 * Number of allocatable items 引当対象件数.<p>
	 *
	 */
	public static final String $alloc_tgt_cnt = "alloc_tgt_cnt";
	/**
	 * Number of allocation succeeded 引当成功件数.<p>
	 *
	 */
	public static final String $alloc_success_cnt = "alloc_success_cnt";
	/**
	 * Number of allocation failures 引当失敗件数.<p>
	 *
	 */
	public static final String $alloc_failure_cnt = "alloc_failure_cnt";


	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta sts_sav_flg_META = createCommonMeta($sts_sav_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_tgt_cnt_META = createCommonMeta($alloc_tgt_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta alloc_success_cnt_META = createCommonMeta($alloc_success_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta alloc_failure_cnt_META = createCommonMeta($alloc_failure_cnt, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<MfgInstTblReg_Upd05_HdrR> constMetas = new ConstMetaList<MfgInstTblReg_Upd05_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			sts_sav_flg_META,
			alloc_tgt_cnt_META,
			alloc_success_cnt_META,
			alloc_failure_cnt_META
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
	protected MfgInstTblReg_Upd05_HdrR_MC_A(ConstMetaList<? extends MfgInstTblReg_Upd05_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstTblReg_Upd05_HdrR clone() {
		return (MfgInstTblReg_Upd05_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstTblReg_Upd05_HdrR createInstance() {
		return (MfgInstTblReg_Upd05_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstTblReg_Upd05_HdrR getValues(String... names) {
		return (MfgInstTblReg_Upd05_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 0, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}


	/**
	 * Save order flg. 指図保存ＦＬＧ.<p>
	 *
	 */
	public boolean sts_sav_flg() {
		return getConstBoolean(offset + 1, $sts_sav_flg);
	}

	/**
	 * Save order flg. 指図保存ＦＬＧ.<p>
	 *
	 */
	public void sts_sav_flg(boolean value) {
		setConstBoolean(offset + 1, $sts_sav_flg, value);
	}


	/**
	 * Number of allocatable items 引当対象件数.<p>
	 *
	 */
	public MCNumber alloc_tgt_cnt() {
		return getConstNumber(offset + 2, $alloc_tgt_cnt);
	}

	/**
	 * Number of allocatable items 引当対象件数.<p>
	 *
	 */
	public void alloc_tgt_cnt(MCNumber value) {
		setConstNumber(offset + 2, $alloc_tgt_cnt, value);
	}

	/**
	 * Number of allocatable items 引当対象件数.<p>
	 *
	 */
	public void alloc_tgt_cnt(int value) {
		setConstNumber(offset + 2, $alloc_tgt_cnt, value);
	}

	/**
	 * Number of allocatable items 引当対象件数.<p>
	 *
	 */
	public void alloc_tgt_cnt(long value) {
		setConstNumber(offset + 2, $alloc_tgt_cnt, value);
	}

	/**
	 * Number of allocatable items 引当対象件数.<p>
	 *
	 */
	public void alloc_tgt_cnt(float value) {
		setConstNumber(offset + 2, $alloc_tgt_cnt, value);
	}

	/**
	 * Number of allocatable items 引当対象件数.<p>
	 *
	 */
	public void alloc_tgt_cnt(double value) {
		setConstNumber(offset + 2, $alloc_tgt_cnt, value);
	}


	/**
	 * Number of allocation succeeded 引当成功件数.<p>
	 *
	 */
	public MCNumber alloc_success_cnt() {
		return getConstNumber(offset + 3, $alloc_success_cnt);
	}

	/**
	 * Number of allocation succeeded 引当成功件数.<p>
	 *
	 */
	public void alloc_success_cnt(MCNumber value) {
		setConstNumber(offset + 3, $alloc_success_cnt, value);
	}

	/**
	 * Number of allocation succeeded 引当成功件数.<p>
	 *
	 */
	public void alloc_success_cnt(int value) {
		setConstNumber(offset + 3, $alloc_success_cnt, value);
	}

	/**
	 * Number of allocation succeeded 引当成功件数.<p>
	 *
	 */
	public void alloc_success_cnt(long value) {
		setConstNumber(offset + 3, $alloc_success_cnt, value);
	}

	/**
	 * Number of allocation succeeded 引当成功件数.<p>
	 *
	 */
	public void alloc_success_cnt(float value) {
		setConstNumber(offset + 3, $alloc_success_cnt, value);
	}

	/**
	 * Number of allocation succeeded 引当成功件数.<p>
	 *
	 */
	public void alloc_success_cnt(double value) {
		setConstNumber(offset + 3, $alloc_success_cnt, value);
	}


	/**
	 * Number of allocation failures 引当失敗件数.<p>
	 *
	 */
	public MCNumber alloc_failure_cnt() {
		return getConstNumber(offset + 4, $alloc_failure_cnt);
	}

	/**
	 * Number of allocation failures 引当失敗件数.<p>
	 *
	 */
	public void alloc_failure_cnt(MCNumber value) {
		setConstNumber(offset + 4, $alloc_failure_cnt, value);
	}

	/**
	 * Number of allocation failures 引当失敗件数.<p>
	 *
	 */
	public void alloc_failure_cnt(int value) {
		setConstNumber(offset + 4, $alloc_failure_cnt, value);
	}

	/**
	 * Number of allocation failures 引当失敗件数.<p>
	 *
	 */
	public void alloc_failure_cnt(long value) {
		setConstNumber(offset + 4, $alloc_failure_cnt, value);
	}

	/**
	 * Number of allocation failures 引当失敗件数.<p>
	 *
	 */
	public void alloc_failure_cnt(float value) {
		setConstNumber(offset + 4, $alloc_failure_cnt, value);
	}

	/**
	 * Number of allocation failures 引当失敗件数.<p>
	 *
	 */
	public void alloc_failure_cnt(double value) {
		setConstNumber(offset + 4, $alloc_failure_cnt, value);
	}


	public MCNumber getNumber(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($alloc_tgt_cnt.equalsIgnoreCase(name)) {
			return alloc_tgt_cnt();
		}
		if ($alloc_success_cnt.equalsIgnoreCase(name)) {
			return alloc_success_cnt();
		}
		if ($alloc_failure_cnt.equalsIgnoreCase(name)) {
			return alloc_failure_cnt();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($sts_sav_flg.equalsIgnoreCase(name)) {
			return sts_sav_flg();
		}
		return super.getBoolean(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($alloc_tgt_cnt.equalsIgnoreCase(name)) {
			return alloc_tgt_cnt();
		}
		if ($alloc_success_cnt.equalsIgnoreCase(name)) {
			return alloc_success_cnt();
		}
		if ($alloc_failure_cnt.equalsIgnoreCase(name)) {
			return alloc_failure_cnt();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sts_sav_flg.equalsIgnoreCase(name)) {
			return sts_sav_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($alloc_tgt_cnt.equalsIgnoreCase(name)) {
			alloc_tgt_cnt(value);
			return;
		}
		if ($alloc_success_cnt.equalsIgnoreCase(name)) {
			alloc_success_cnt(value);
			return;
		}
		if ($alloc_failure_cnt.equalsIgnoreCase(name)) {
			alloc_failure_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($alloc_tgt_cnt.equalsIgnoreCase(name)) {
			alloc_tgt_cnt(value);
			return;
		}
		if ($alloc_success_cnt.equalsIgnoreCase(name)) {
			alloc_success_cnt(value);
			return;
		}
		if ($alloc_failure_cnt.equalsIgnoreCase(name)) {
			alloc_failure_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($alloc_tgt_cnt.equalsIgnoreCase(name)) {
			alloc_tgt_cnt(value);
			return;
		}
		if ($alloc_success_cnt.equalsIgnoreCase(name)) {
			alloc_success_cnt(value);
			return;
		}
		if ($alloc_failure_cnt.equalsIgnoreCase(name)) {
			alloc_failure_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($alloc_tgt_cnt.equalsIgnoreCase(name)) {
			alloc_tgt_cnt(value);
			return;
		}
		if ($alloc_success_cnt.equalsIgnoreCase(name)) {
			alloc_success_cnt(value);
			return;
		}
		if ($alloc_failure_cnt.equalsIgnoreCase(name)) {
			alloc_failure_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($alloc_tgt_cnt.equalsIgnoreCase(name)) {
			alloc_tgt_cnt(value);
			return;
		}
		if ($alloc_success_cnt.equalsIgnoreCase(name)) {
			alloc_success_cnt(value);
			return;
		}
		if ($alloc_failure_cnt.equalsIgnoreCase(name)) {
			alloc_failure_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sts_sav_flg.equalsIgnoreCase(name)) {
			sts_sav_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($alloc_tgt_cnt.equalsIgnoreCase(name)) {
			alloc_tgt_cnt(value);
			return;
		}
		if ($alloc_success_cnt.equalsIgnoreCase(name)) {
			alloc_success_cnt(value);
			return;
		}
		if ($alloc_failure_cnt.equalsIgnoreCase(name)) {
			alloc_failure_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($alloc_tgt_cnt.equalsIgnoreCase(name)) {
			alloc_tgt_cnt(value);
			return;
		}
		if ($alloc_success_cnt.equalsIgnoreCase(name)) {
			alloc_success_cnt(value);
			return;
		}
		if ($alloc_failure_cnt.equalsIgnoreCase(name)) {
			alloc_failure_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($alloc_tgt_cnt.equalsIgnoreCase(name)) {
			alloc_tgt_cnt(value);
			return;
		}
		if ($alloc_success_cnt.equalsIgnoreCase(name)) {
			alloc_success_cnt(value);
			return;
		}
		if ($alloc_failure_cnt.equalsIgnoreCase(name)) {
			alloc_failure_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($alloc_tgt_cnt.equalsIgnoreCase(name)) {
			alloc_tgt_cnt(value);
			return;
		}
		if ($alloc_success_cnt.equalsIgnoreCase(name)) {
			alloc_success_cnt(value);
			return;
		}
		if ($alloc_failure_cnt.equalsIgnoreCase(name)) {
			alloc_failure_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($alloc_tgt_cnt.equalsIgnoreCase(name)) {
			alloc_tgt_cnt(value);
			return;
		}
		if ($alloc_success_cnt.equalsIgnoreCase(name)) {
			alloc_success_cnt(value);
			return;
		}
		if ($alloc_failure_cnt.equalsIgnoreCase(name)) {
			alloc_failure_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sts_sav_flg.equalsIgnoreCase(name)) {
			sts_sav_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

