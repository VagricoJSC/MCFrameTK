package mcframe.serverMSBC.MSBCL6060;

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
 * ブロック"MfgActTblReg_Upd04_DtlOper"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgActTblReg_Upd04_DtlOperR_MC_A extends MCConstRow {

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public static final String $oper_peg_no = "oper_peg_no";
	/**
	 * Number of BF バックフラッシュ対象件数.<p>
	 *
	 */
	public static final String $bkf_tgt_cnt = "bkf_tgt_cnt";
	/**
	 * Number of backflush succeeded バックフラッシュ成功件数.<p>
	 *
	 */
	public static final String $bkf_success_cnt = "bkf_success_cnt";
	/**
	 * Number of backflush failed バックフラッシュ失敗件数.<p>
	 *
	 */
	public static final String $bkf_failure_cnt = "bkf_failure_cnt";


	public static final MCMeta oper_peg_no_META = createCommonMeta($oper_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta bkf_tgt_cnt_META = createCommonMeta($bkf_tgt_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta bkf_success_cnt_META = createCommonMeta($bkf_success_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta bkf_failure_cnt_META = createCommonMeta($bkf_failure_cnt, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<MfgActTblReg_Upd04_DtlOperR> constMetas = new ConstMetaList<MfgActTblReg_Upd04_DtlOperR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			oper_peg_no_META,
			bkf_tgt_cnt_META,
			bkf_success_cnt_META,
			bkf_failure_cnt_META
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
	protected MfgActTblReg_Upd04_DtlOperR_MC_A(ConstMetaList<? extends MfgActTblReg_Upd04_DtlOperR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActTblReg_Upd04_DtlOperR clone() {
		return (MfgActTblReg_Upd04_DtlOperR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActTblReg_Upd04_DtlOperR createInstance() {
		return (MfgActTblReg_Upd04_DtlOperR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActTblReg_Upd04_DtlOperR getValues(String... names) {
		return (MfgActTblReg_Upd04_DtlOperR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public MCNumber oper_peg_no() {
		return getConstNumber(offset + 0, $oper_peg_no);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(int value) {
		setConstNumber(offset + 0, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(long value) {
		setConstNumber(offset + 0, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(float value) {
		setConstNumber(offset + 0, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(double value) {
		setConstNumber(offset + 0, $oper_peg_no, value);
	}


	/**
	 * Number of BF バックフラッシュ対象件数.<p>
	 *
	 */
	public MCNumber bkf_tgt_cnt() {
		return getConstNumber(offset + 1, $bkf_tgt_cnt);
	}

	/**
	 * Number of BF バックフラッシュ対象件数.<p>
	 *
	 */
	public void bkf_tgt_cnt(MCNumber value) {
		setConstNumber(offset + 1, $bkf_tgt_cnt, value);
	}

	/**
	 * Number of BF バックフラッシュ対象件数.<p>
	 *
	 */
	public void bkf_tgt_cnt(int value) {
		setConstNumber(offset + 1, $bkf_tgt_cnt, value);
	}

	/**
	 * Number of BF バックフラッシュ対象件数.<p>
	 *
	 */
	public void bkf_tgt_cnt(long value) {
		setConstNumber(offset + 1, $bkf_tgt_cnt, value);
	}

	/**
	 * Number of BF バックフラッシュ対象件数.<p>
	 *
	 */
	public void bkf_tgt_cnt(float value) {
		setConstNumber(offset + 1, $bkf_tgt_cnt, value);
	}

	/**
	 * Number of BF バックフラッシュ対象件数.<p>
	 *
	 */
	public void bkf_tgt_cnt(double value) {
		setConstNumber(offset + 1, $bkf_tgt_cnt, value);
	}


	/**
	 * Number of backflush succeeded バックフラッシュ成功件数.<p>
	 *
	 */
	public MCNumber bkf_success_cnt() {
		return getConstNumber(offset + 2, $bkf_success_cnt);
	}

	/**
	 * Number of backflush succeeded バックフラッシュ成功件数.<p>
	 *
	 */
	public void bkf_success_cnt(MCNumber value) {
		setConstNumber(offset + 2, $bkf_success_cnt, value);
	}

	/**
	 * Number of backflush succeeded バックフラッシュ成功件数.<p>
	 *
	 */
	public void bkf_success_cnt(int value) {
		setConstNumber(offset + 2, $bkf_success_cnt, value);
	}

	/**
	 * Number of backflush succeeded バックフラッシュ成功件数.<p>
	 *
	 */
	public void bkf_success_cnt(long value) {
		setConstNumber(offset + 2, $bkf_success_cnt, value);
	}

	/**
	 * Number of backflush succeeded バックフラッシュ成功件数.<p>
	 *
	 */
	public void bkf_success_cnt(float value) {
		setConstNumber(offset + 2, $bkf_success_cnt, value);
	}

	/**
	 * Number of backflush succeeded バックフラッシュ成功件数.<p>
	 *
	 */
	public void bkf_success_cnt(double value) {
		setConstNumber(offset + 2, $bkf_success_cnt, value);
	}


	/**
	 * Number of backflush failed バックフラッシュ失敗件数.<p>
	 *
	 */
	public MCNumber bkf_failure_cnt() {
		return getConstNumber(offset + 3, $bkf_failure_cnt);
	}

	/**
	 * Number of backflush failed バックフラッシュ失敗件数.<p>
	 *
	 */
	public void bkf_failure_cnt(MCNumber value) {
		setConstNumber(offset + 3, $bkf_failure_cnt, value);
	}

	/**
	 * Number of backflush failed バックフラッシュ失敗件数.<p>
	 *
	 */
	public void bkf_failure_cnt(int value) {
		setConstNumber(offset + 3, $bkf_failure_cnt, value);
	}

	/**
	 * Number of backflush failed バックフラッシュ失敗件数.<p>
	 *
	 */
	public void bkf_failure_cnt(long value) {
		setConstNumber(offset + 3, $bkf_failure_cnt, value);
	}

	/**
	 * Number of backflush failed バックフラッシュ失敗件数.<p>
	 *
	 */
	public void bkf_failure_cnt(float value) {
		setConstNumber(offset + 3, $bkf_failure_cnt, value);
	}

	/**
	 * Number of backflush failed バックフラッシュ失敗件数.<p>
	 *
	 */
	public void bkf_failure_cnt(double value) {
		setConstNumber(offset + 3, $bkf_failure_cnt, value);
	}


	public MCNumber getNumber(String name) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($bkf_tgt_cnt.equalsIgnoreCase(name)) {
			return bkf_tgt_cnt();
		}
		if ($bkf_success_cnt.equalsIgnoreCase(name)) {
			return bkf_success_cnt();
		}
		if ($bkf_failure_cnt.equalsIgnoreCase(name)) {
			return bkf_failure_cnt();
		}
		return super.getNumber(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($bkf_tgt_cnt.equalsIgnoreCase(name)) {
			return bkf_tgt_cnt();
		}
		if ($bkf_success_cnt.equalsIgnoreCase(name)) {
			return bkf_success_cnt();
		}
		if ($bkf_failure_cnt.equalsIgnoreCase(name)) {
			return bkf_failure_cnt();
		}
		return super.getNumberNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($bkf_tgt_cnt.equalsIgnoreCase(name)) {
			bkf_tgt_cnt(value);
			return;
		}
		if ($bkf_success_cnt.equalsIgnoreCase(name)) {
			bkf_success_cnt(value);
			return;
		}
		if ($bkf_failure_cnt.equalsIgnoreCase(name)) {
			bkf_failure_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($bkf_tgt_cnt.equalsIgnoreCase(name)) {
			bkf_tgt_cnt(value);
			return;
		}
		if ($bkf_success_cnt.equalsIgnoreCase(name)) {
			bkf_success_cnt(value);
			return;
		}
		if ($bkf_failure_cnt.equalsIgnoreCase(name)) {
			bkf_failure_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($bkf_tgt_cnt.equalsIgnoreCase(name)) {
			bkf_tgt_cnt(value);
			return;
		}
		if ($bkf_success_cnt.equalsIgnoreCase(name)) {
			bkf_success_cnt(value);
			return;
		}
		if ($bkf_failure_cnt.equalsIgnoreCase(name)) {
			bkf_failure_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($bkf_tgt_cnt.equalsIgnoreCase(name)) {
			bkf_tgt_cnt(value);
			return;
		}
		if ($bkf_success_cnt.equalsIgnoreCase(name)) {
			bkf_success_cnt(value);
			return;
		}
		if ($bkf_failure_cnt.equalsIgnoreCase(name)) {
			bkf_failure_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($bkf_tgt_cnt.equalsIgnoreCase(name)) {
			bkf_tgt_cnt(value);
			return;
		}
		if ($bkf_success_cnt.equalsIgnoreCase(name)) {
			bkf_success_cnt(value);
			return;
		}
		if ($bkf_failure_cnt.equalsIgnoreCase(name)) {
			bkf_failure_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($bkf_tgt_cnt.equalsIgnoreCase(name)) {
			bkf_tgt_cnt(value);
			return;
		}
		if ($bkf_success_cnt.equalsIgnoreCase(name)) {
			bkf_success_cnt(value);
			return;
		}
		if ($bkf_failure_cnt.equalsIgnoreCase(name)) {
			bkf_failure_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($bkf_tgt_cnt.equalsIgnoreCase(name)) {
			bkf_tgt_cnt(value);
			return;
		}
		if ($bkf_success_cnt.equalsIgnoreCase(name)) {
			bkf_success_cnt(value);
			return;
		}
		if ($bkf_failure_cnt.equalsIgnoreCase(name)) {
			bkf_failure_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($bkf_tgt_cnt.equalsIgnoreCase(name)) {
			bkf_tgt_cnt(value);
			return;
		}
		if ($bkf_success_cnt.equalsIgnoreCase(name)) {
			bkf_success_cnt(value);
			return;
		}
		if ($bkf_failure_cnt.equalsIgnoreCase(name)) {
			bkf_failure_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($bkf_tgt_cnt.equalsIgnoreCase(name)) {
			bkf_tgt_cnt(value);
			return;
		}
		if ($bkf_success_cnt.equalsIgnoreCase(name)) {
			bkf_success_cnt(value);
			return;
		}
		if ($bkf_failure_cnt.equalsIgnoreCase(name)) {
			bkf_failure_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($bkf_tgt_cnt.equalsIgnoreCase(name)) {
			bkf_tgt_cnt(value);
			return;
		}
		if ($bkf_success_cnt.equalsIgnoreCase(name)) {
			bkf_success_cnt(value);
			return;
		}
		if ($bkf_failure_cnt.equalsIgnoreCase(name)) {
			bkf_failure_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

