package mcframe.clientMGUC.MGUCP0040;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

import mcframe.clientCore.beans.MCMode;
import mcframe.clientCore.beans.table.MCColumnConfig;
import mcframe.clientCore.beans.table.MCTable;
import mcframe.clientCore.container.MCConstRow;
import mcframe.clientCore.event.MCEventBeans;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonFXBA.FXBAC0050.FXBAC_RLBase;
import mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
/**
 * 縦横処理を行う共通クラスです。<BR>
 * <UI><LI>非表示で保持しているリストで同じキー項目を持つ複数行を、画面で１行に横展開できます</LI>
 * <LI>横展開のキーと、横展開したときに表示する値には任意のカラムが指定できます</LI>
 * <LI>横展開のキー１つに対して複数のカラムを表示することができます</LI>
 * <LI>画面表示行を通信用リストに逆展開できます</LI>
 * <LI>横展開カラムの表示制御ができます</LI>
 * <LI>横展開したカラムの合計を計算し、指定したカラムに値をセットできます</LI>
 * </UI><BR>
 * 使用方法
 * <OL><LI>
 * 実装仕様書でグループキーを指定します。<BR>
 * 指定するキーは、「ELM」、「HVAL」、「HKEY」、「OTHER」の4つです。<BR>
 * ELM：横に展開する要素<BR>
 * HVAL：横に展開したときに表示する値<BR>
 * HKEY：横1行を現すキー<BR>
 * OTHER：ELM、HKEY以外で横に展開する項目<BR>
 * </LI>
 * <LI>本クラスをnewしてインスタンス化します。</LI>
 * <LI>{@link #initColGroup}、{@link #initColInfo}の順に呼び出します</LI>
 * <LI>検索処理後、{@link #createHList}メソッドを呼び出すことで検索したリストを画面表示リストに展開できます</LI>
 * <LI>登録処理前、{@link #setHV}メソッドを呼び出すことで画面表示リストを通信用リストに逆展開できます</LI>
 * </OL>
 */
abstract public class MGUCP_VHConverter_MC<V extends MCConstRow, H extends MCConstRow> {


	// 画面表示テーブル
	protected MCTable<H> _dispTable;

	public void setDispTable(MCTable<H> dispTable) {
		_dispTable = dispTable;
	}

	public MCTable<H> getDispTable() {
		return _dispTable;
	}

	// 非表示リスト
	protected MCList<V> _vList;

	public void setVList(MCList<V> vList) {
		_vList = vList;
	}

	// 可変カラムの表示数
	protected int _viewSize;

	protected void setViewSize(int viewSize) {
		_viewSize = viewSize;
	}

	public int getViewSize() {
		return _viewSize;
	}

	// 可変カラムの開始インデックス
	protected int _startPos;

	protected void setStartPos(int startPos) {
		_startPos = startPos;
	}

	// 実装仕様書で定義した可変カラムの最大数
	protected int _maxPos;

	protected void setMaxPos(int maxPos) {
		_maxPos = maxPos;
	}

	// 横展開キー
	// 例：費目ＣＤを横展開する場合、setElmCol("expns_cd")
	protected String _elmCol;

	public void setElmCol(String elmCol) {
		_elmCol = elmCol;
	}

	// _elmColを横に展開した際に表示する値を持つ縦のカラム名._elmColに対して複数の表示が可能.
	// 例：費目を横展開する場合で、費目毎に２カラム（act_cost、std_cost）を表示したい場合
	// setHValCol("act_cost","std_cost")
	protected String[] _hValCol;

	public void setHValCol(String... hValCol) {
		_hValCol = hValCol;
	}

	// キー項目。横１行を識別する。
	protected String[] _keys;

	public String[] getKeys() {
		return _keys;
	}

	public void setKeys(String... keys) {
		_keys = keys;
	}

	// 非キー項目。キー項目、横展開キー以外の項目が存在する場合にセットします。
	protected String[] _notKeys;

	public void setNotKeys(String... notKeys) {
		_notKeys = notKeys;
	}

	// 可変カラムの型がMCNumberで値が0の場合に表示をnullにする場合はtrue,
	// そのまま0で表示する場合はfalseをセットする。デフォルトはtrue。
	protected boolean _dispNull = true;

	public void setDispNull(boolean b) {
		_dispNull = b;
	}

	// ReadOnlyにするカラムの集合
	protected Set<String> _readOnlyColSet = new HashSet<String>();

	/**
	 * 読み取り専用のカラムかを返します。
	 * @param i
	 * @return
	 */
	public boolean isReadOnlyCol(int i) {
		return _readOnlyColSet.contains(String.valueOf(i));
	}

	// 表示行を縦のリストに持たせるためのカラム名
	// 登録処理のある画面では、通信するコンテナと画面表示するコンテナの両方に「row_num」という
	// 名称のカラムを定義してください
	public final String ROW_NUM = "row_num";

	// 表示行自体が削除行であるかを判定するカラム名。通信するコンテナに「is_hdel」という名称のカラムを
	// 定義すると、setHV実行時に画面表示行が削除ステータスである場合はtrue、それ以外の場合はfalseが設定されます。
	protected final String IS_HDEL = "is_hdel";

	// 表示行自体が更新行であるかを判定するカラム名。通信するコンテナに「is_hupd」という名称のカラムを
	// 定義すると、setHV実行時に画面表示行が更新ステータスである場合はtrue、それ以外の場合はfalseが設定されます。
	protected final String IS_HUPD = "is_hupd";

	// HListの縦横変換対象カラム(col_00～col_??)の定義
	protected String[] _elmCols;// VListのcol_00～col_??のカラム名

	public String[] getElmCols() {
		return _elmCols;
	}

	// 横リストのcol_00～col_??に対応する、_elmColの値
	// 例１：_elmColが費目ＣＤの場合、費目ＣＤの値がセットされる。{100,101,102・・・}
	// 例２：_hValColが複数ある場合、{100,100,101,101・・・}のように_hValColのlength毎に同じ
	// 値が繰り返される。
	protected Comparable<?>[] _elmVals;

	public Comparable<?>[] getElmVals() {
		return _elmVals;
	}

	// 横展開した値の縦でのカラム名配列(=_hValColの繰り返し)
	protected String[] _elmValCols;

	// 縦と横のリストを紐付ける番号(row_num)
	protected int _recNum = 0;

	// _elmColに対応する値が必須の場合、true。画面上で値がnullの場合に縦のリストからは削除された状態になる。
	// 必須出ない場合、false。画面上で値がnullの場合、縦のリストにも値がnullで存在している状態になる。
	protected boolean _isElmColValReq = true;

	// _hValColが複数ある場合、最初の要素が合計であるかを表す
	protected boolean _isFirstElmTtl = false;

	public void setIsFirstElmTtl(boolean b) {
		_isFirstElmTtl = b;
	}

	// 可変カラムの表示制御を行う前に見えているカラム配列。
	protected MCColumnConfig[] confs;

	public MCColumnConfig[] getConfs() {
		return confs;
	}

	public void setConfs(MCColumnConfig[] confs) {
		this.confs = confs;
	}

	// 実装仕様書に定義するグループキー
	public static final String ELM = "ELM";

	public static final String HVAL = "HVAL";

	public static final String HKEY = "HKEY";

	public static final String OTHER = "OTHER";

	public MGUCP_VHConverter_MC() {

	}

	/**
	 * 非表示リストのRowでグルーピングされている項目の設定を行います。<BR>
	 * @param t 表示テーブル
	 * @param l 非表示リスト
	 */
	public void initColGroup(MCTable<H> t, MCList<V> l) {
		setDispTable(t);
		setVList(l);
		MCConstRow row = _vList.createRow();
		// 横展開する可変カラム名
		setElmCol(row.getKeys(ELM).get(0));
		// 横展開する可変カラム対して値を表示するカラム名
		setHValCol(row.getKeys(HVAL).toArray(new String[0]));
		// 横の１行を識別するキー
		setKeys(row.getKeys(HKEY).toArray(new String[0]));
		// 横に展開する固定カラム
		if (row.getExtGroups().contains(OTHER)) {
			setNotKeys(row.getKeys(OTHER).toArray(new String[0]));
		}
	}

	/**
	 * 縦横変換のカラム情報初期設定を行います。<BR>
	 * {@link #initColGroup}を呼び出した後に実行します。
	 * @param place 可変カラム名に使用する連番部分の桁数(ゼロ埋を考慮する)<BR>
	 *               例；col_00～col_99の場合「2」
	 * @param size 可変カラムのサイズ
	 * @param l 横展開キーのリスト
	 */
	public void initColInfo(int decPlace, int size, MCList<? extends MCRow> l, int start,
			int max) {
		String[] elmCol = new String[size];
		Comparable<?>[] elmVal = new Comparable<?>[size];
		String[] elmValCol = new String[size];
		for (int i = 0; i < size; i++) {
			// 横の可変カラム名col_00～
			elmCol[i] = createColumnNm(i, decPlace);
			// 横の可変カラムi番目に対応する横展開キーの値
			elmVal[i] = l.get(i / _hValCol.length).getValueNE(_elmCol);
			// 横の可変カラムi番目に対応する表示項目のカラム名
			elmValCol[i] = _hValCol[i % _hValCol.length];
		}
		setColInfo(elmCol, elmVal, elmValCol, size, start, max);
	}

	protected void setColInfo(String[] elmCol, Comparable<?>[] elmVal,
			String[] elmValCol, int size, int start, int max) {
		_elmCols = elmCol;
		_elmVals = elmVal;
		_elmValCols = elmValCol;
		_viewSize = size;
		_startPos = start;
		_maxPos = max;

	}

	/**
	 * 可変カラムのカラム名を返します。
	 * @param i 連番
	 * @param decPlace 連番の桁数
	 */
	protected String createColumnNm(int i, int decPlace) {
		return "col_" + lpad(String.valueOf(i), decPlace, "0");
	}

	/**
	 * キー項目と非キー項目（横展開キーを除く）を横のRowにセットします。<BR>
	 * @param tempHL
	 * @param vRow
	 * @param recGrpNum
	 */
	protected void copyValue(H tempR, V vR) {
		// キー項目のセット
		for (String key : _keys) {
			tempR.setValueNE(key, vR.getValueNE(key));
		}
		// 非キー項目のセット
		copyNotKeys(vR, tempR);
		// 縦と横を関連図けるキーをセット
		_recNum++;
		tempR.setNumberNE(ROW_NUM, _recNum);
	}

	/** 引数の項目名の変更前キーカラム名を返します。 */
	protected String getBeforeKeyColumn(String keyCol) {
		return keyCol + FXBAC_RLBase.getBkSuffix();
	}

	protected String elmValToElmCol(Comparable<?> elmVal, int offset) {
		for (int i = 0; i < _elmVals.length; i += _hValCol.length) {
			if (isSame(_elmVals[i], elmVal)) {
				return _elmCols[i + offset];
			}
		}
		return null;
	}

	/**
	 * elmValから、elmColを取得します。<br>
	 * 対応するカラムがない場合はnullが返ります。<br>
	 *
	 * @param elmVal
	 * @return elmCol
	 */
	protected String elmValToElmCol(Comparable<?> elmVal) {
		for (int i = 0; i < _elmVals.length; i++) {
			if (isSame(_elmVals[i], elmVal)) {
				return _elmCols[i];
			}
		}
		return null;
	}

	/**
	 * elmColから、elmValを取得します。<br>
	 * 対応するカラムがない場合はnullが返ります。<br>
	 *
	 * @param elmCol
	 * @return elmVal
	 */
	protected Comparable<?> elmColToElmVal(String elmCol) {
		for (int i = 0; i < _elmCols.length; i++) {
			if (isSame(_elmCols[i], elmCol)) {
				return _elmVals[i];
			}
		}
		return null;
	}

	/**
	 * 横の可変カラムcol_00～に対応した配列の添字を返します。<BR>
	 * 例：elmColが「col_05」の場合、「5」が返ります。
	 * 見つからない場合は-1を返します。
	 * @param elmCol 横の可変カラム名称
	 */
	public int getElmColPos(String elmCol) {
		for (int i = 0; i < _elmCols.length; i++) {
			if (isSame(_elmCols[i], elmCol)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 *
	 * 横の行に縦の行の値をセットします。
	 * @param tempHL
	 * @param vR
	 */
	protected void putElms(H tempR, V vR) {
		if (null == vR.getValueNE(_elmCol)) {
			// 費目がnullの場合は横に展開できない
			// (ヘッダのみで登録された場合にnullとなる)
			return;
		}
		String elmCol;
		for (int i = 0; i < _hValCol.length; i++) {
			elmCol = elmValToElmCol(vR.getValueNE(_elmCol), i);
			if (null != elmCol) {
				if (vR.getValueNE(_hValCol[i]) instanceof MCNumber
						&& ((MCNumber) vR.getValueNE(_hValCol[i])).isZero()) {
					// 費目に対して複数展開をするパターンで、先頭が合計の場合はそのまま0で表示
					if (_isFirstElmTtl && i == 0) {
						tempR.setValueNE(elmCol, MCNumber.ZERO);
					}
					else {
						// 指定された表示方法で表示する(0 or null)
						tempR.setValueNE(elmCol, _dispNull ? null : MCNumber.ZERO);
					}
				}
				else {
					tempR.setValueNE(elmCol, vR.getValueNE(_hValCol[i]));
				}
			}
		}

	}

	/**
	 * 縦のリストから横の表示用リストを作成します。
	 * @param vL 縦のリスト
	 * @param hL 横のリスト
	 */
	public void createHList(MCList<V> vL) {
		V prevVRow = null;
		MCIndexKey idx = vL.createIndex(_keys);
		getDispTable().clear();
		H tempR = getDispTable().getList().createRow();

		MCList<H> tempL = MCList.create(tempR);
		for (Iterator<V> i = vL.iterator(idx); i.hasNext();) {
			V vRow = i.next();
			// key変更無しの場合、既存の行に対して横展開する
			if (vRow.equalColumns(prevVRow, _keys)) {
				putElms(tempR, vRow);
				// 横の行と縦の行の関連を作成
				vRow.setValueNE(ROW_NUM, new MCNumber(_recNum));
			}
			else {
				// keyが変わった場合に新規行を作成、追加する
				tempR = (H) tempL.createRow();
				// 新しいkeyにする
				copyValue(tempR, vRow);
				putElms(tempR, vRow);
				tempL.add(tempR);
				// 横の行と縦の行の関連を作成
				vRow.setValueNE(ROW_NUM, new MCNumber(_recNum));

			}
			prevVRow = vRow;
		}
		getDispTable().getList().setAll((MCList<H>) tempL);
	}

	protected void copyKeyVal(H hR, MCList<V> vL) {
		for (V v : vL) {
			copyKeyVal(hR, v);
		}
	}

	protected void copyNotKeys(H hR, MCList<V> vL) {
		for (V v : vL) {
			copyNotKeys(hR, v);
		}
	}

	/**
	 * キー項目の値をhRからvRにコピーします。
	 * @param src コピー元
	 * @param dest コピー先
	 */
	protected void copyKeyVal(MCConstRow src, MCConstRow dest) {
		if (null != _keys) {
			for (String key : _keys) {
				dest.setValueNE(key, src.getValueNE(key));
			}
		}
	}

	/**
	 * 非キー項目の値をsrcからdestにコピーします。
	 * @param src コピー元
	 * @param dest コピー先
	 */
	protected void copyNotKeys(MCConstRow src, MCConstRow dest) {
		if (null != _notKeys) {
			for (String notKey : _notKeys) {
				dest.setValueNE(notKey, src.getValueNE(notKey));
			}
		}
	}

	/**
	 * 縦と横の行を紐付ける番号をセットします。
	 * @param h
	 */
	public void setRowNum(H h) {
		// 横の行に行NOが付与されていない場合
		if (isNull(h.getNumberNE(ROW_NUM)) || h.getNumberNE(ROW_NUM).lt(MCNumber.ZERO)) {
			h.setNumberNE(ROW_NUM, ++_recNum);
		}
	}

	/**
	 * キー項目と非キー項目の変更を画面表示行から縦のRowへコピーする。<BR>
	 * キー項目と非キー項目のどちらかに変更があった場合のステータスはMODIFYとなる。
	 * @param h 画面表示行
	 * @param v 縦のRow
	 */
	protected void setKeyAndOtherChanges(H h, V v) {
		// キー項目、非キー項目のチェック。変更があれば縦のRowにセットし、ステータスを変更。
		if (isKeyChanged(h, v)) {
			copyKeyVal(h, v);
			v.setStatus(Status.MODIFY);
		}
		if (isOthChanged(h, v)) {
			copyNotKeys(h, v);
			v.setStatus(Status.MODIFY);
		}
	}

	/**
	 * 画面表示行を通信用のコンテナにコピーします。
	 * @param hL 画面表示リスト
	 * @param vL 通信用リスト
	 */
	public void setHV(MCList<V> vL) {
		// 表示テーブルで変更された行の抽出
		MCList<H> changed = getDispTable().getList().statusChangedList();
		if (null == changed) {
			return;
		}
		for (H h : changed) {
			// 横の行が新規行の場合、true
			boolean isHCreate = isSame(Status.CREATE, h.getStatus()) ? true : false;
			// 表示テーブルで変更された行に対応する非表示リストの抽出
			MCList<V> sub = vL.subList(ROW_NUM, h.getNumber(ROW_NUM));
			// 表示行が削除であるかの初期値
			sub.setBooleanNE(IS_HDEL, false);
			sub.setBooleanNE(IS_HUPD, false);
			// 画面上で削除ステータスの場合、縦リストの該当行をすべて削除行とする
			if (isSame(Status.DELETE, h.getStatus())) {
				sub.setStatus(Status.DELETE);
				// 削除行が識別できるようにする。新規、更新の区別はしない。
				sub.setBooleanNE(IS_HDEL, true);

			}
			// 画面表示行自体が新規追加の場合
			else if (0 == sub.size()) {
				// 明細（可変カラム）に１つも値がなければtrue
				// 処理対象の画面表示行に明細が０件の場合、最後にヘッダの情報のみを縦のリストに追加する
				boolean isAllNull = true;
				// 縦横の関連に使うrow_numをセット
				setRowNum(h);
				for (int i = 0; i < _elmCols.length; i++) {
					// 集計カラム以外
					if (!isNull(h.getValueNE(_elmCols[i])) && null != _elmValCols[i]) {
						// 横展開キーに対して２項目以上を展開する場合も縦の行にまとめて値をセットする。
						// カウンタを展開する数だけ進める
						if (null != addNewVRow(vL, h, i) && _hValCol.length != 1) {
							i += _hValCol.length - 1;
						}
						isAllNull = false;
					}
				}
				// ヘッダのみ追加で明細がない場合
				if (isAllNull) {
					addNewHeader(vL, h);
				}

			}
			// 画面表示行自体が更新状態の場合
			else {
				// 既存の行の「更新」状態フラグをtrueにする。
				// ただし、以下の理由で横の行が新規の場合を除く。
				// 登録→エラー→再度登録の順で実行した場合、1度本メソッドが呼び出されているので新規行なのに非
				// 表示リストに存在する状態になっており、更新と判断されるのを防ぐ。
				if (!isHCreate) {
					sub.setBooleanNE(IS_HUPD, true);
				}
				// 明細（可変カラム）に１つでも値ががあればtrue
				// 処理対象の画面表示行に明細が０件の場合、最後にヘッダの情報のみを縦のリストに追加する
				boolean hasDtl = false;
				// 一つのキーで展開した数毎に処理を行う
				int inc = _hValCol.length;
				for (int i = 0; i < _elmCols.length; i += inc) {
					// 横展開キーがnullのカラムは対象外とする（表示のみのカラム等を考慮）
					// 継承先のクラスで_readOnlyColSet（読取専用カラム)がセットされている場合、そのカラムも対象外とする
					if (isNull(_elmVals[i])) {
						continue;
					}
					MCList<V> tgt = sub.subList(_elmCol, _elmVals[i]);

					// 縦リストに存在する横展開キー
					if (0 != tgt.size()) {
						hasDtl = true;
						for (V v : tgt) {
							// 縦のリストに存在する行で、横の行が編集されて値がnullとなった場合
							// 横展開キーの値が必須の場合は、DELETEステータスにする。
							// ただし、横の行が新規行の場合は縦のリストから削除する。
							if (isAllChangeToNull(h, v, i) && _isElmColValReq) {
								if (isHCreate) {
									vL.remove(v);
									continue;
								}
								setKeyAndOtherChanges(h, v);
								v.setStatus(Status.DELETE);
								continue;
							}
							setKeyAndOtherChanges(h, v);
							// 横展開カラムのチェック。変更があれば縦のRowにセットし、ステータスを変更。
							if (isHValColChanged(h, v, i)) {
								setHValColAll(h, v, i);
								v.setStatus(Status.MODIFY);
							}
							// １つでも変更があれば画面表示行から縦のリストに逆展開されているので関連を作成する
							if (isSame(v.getStatus(), Status.MODIFY)) {
								createRelation(h, v);
							}
							// 横の行が新規の場合は以下の理由でステータスをCREATEで上書きする。
							// 登録→エラー→再度登録の順で実行した場合、1度本メソッドが呼び出されているので新規行なのに非
							// 表示リストに存在する状態になっており、更新と判断されるのを防ぐ。
							if (isHCreate) {
								v.setStatus(Status.CREATE);
							}
						}
					}
					else if (isHValColNotNull(h, i)) {
						// 縦リストに無い新規の横展開キー
						addNewVRow(vL, h, i);
						// 追加した行に画面表示行のステータスを「更新」でセットする。
						// ただし、以下の理由で横の行が新規行の場合を除く。
						// 登録→エラー→再度登録の順で実行した場合、1度本メソッドが呼び出されているので新規行なのに非
						// 表示リストに存在する状態になっており、更新と判断されるのを防ぐ。
						if (!isHCreate) {
							vL.get(vL.size() - 1).setBooleanNE(IS_HUPD, true);
						}
						hasDtl = true;
					}

				}
				if (!hasDtl) {
					// 明細なし、ヘッダのみの更新
					for (V v : sub) {
						setKeyAndOtherChanges(h, v);
						// 横の行が新規の場合は以下の理由でステータスをCREATEで上書きする。
						// 登録→エラー→再度登録の順で実行した場合、1度本メソッドが呼び出されているので新規行なのに非
						// 表示リストに存在する状態になっており、更新と判断されるのを防ぐ。
						if (isHCreate) {
							v.setStatus(Status.CREATE);
						}
					}
				}
			}
		}
	}

	/**
	 * 横展開した値なしの部分（ヘッダ）で縦の行を作成する
	 * @param vL
	 * @param h
	 */
	protected void addNewHeader(MCList<V> vL, H h) {
		V v = createVrow(vL, h);
		vL.add(v);
	}

	protected void setInptVal(H h, int i, V v) {
		// 横展開キーをセット
		// 入力された値をセット
		v.setValueNE(_elmValCols[i], h.getValueNE(_elmCols[i]));
	}

	/**
	 * 一つの横展開キーに対して展開した項目のうち、どれか一つでも変更があればtrue.<BR>
	 * 一つの横展開キーに対して展開した項目のうち、先頭が合計カラムの場合、2番目の<BR>
	 * カラムからチェックの対象とします。
	 * @param h
	 * @param v
	 * @param i 
	 * @return
	 */
	protected boolean isHValColChanged(H h, V v, int i) {
		int pos = i;
		if (_isFirstElmTtl) {
			pos += 1;
		}
		for (int j = pos; j < i + _hValCol.length; j++) {
			if (!isSame(v.getValueNE(_elmValCols[j]), h.getValueNE(_elmCols[j]))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 一つの横展開キーに対して展開された値のうち、一つでもnull以外の値が存在すればtrue。<BR>
	 * 先頭が合計行の場合、先頭は対象外とします。
	 * @param h
	 * @param i
	 * @return
	 */
	protected boolean isHValColNotNull(H h, int i) {
		int pos = i;
		if (_isFirstElmTtl) {
			pos += 1;
		}
		for (int j = pos; j < i + _hValCol.length; j++) {
			if (!isNull(h.getValueNE(_elmCols[j]))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * １つの横展開キーで展開した項目の値がすべてnullの場合、false、
	 * １つでも値がある場合、trueを返す。
	 * @param h
	 * @param v
	 * @param i
	 * @return
	 */
	protected boolean isNotNullGroup(H h, V v, int i) {
		int pos = i;
		if (_isFirstElmTtl) {
			pos += 1;
		}
		for (int j = pos; j < i + _hValCol.length; j++) {
			if (!isNull(h.getValueNE(_elmCols[j]))) {
				return true;
			}
		}
		return false;
	}

	protected void setHValColAll(H h, V v, int i) {
		int pos = i;
		if (_isFirstElmTtl) {
			pos += 1;
		}
		for (int j = pos; j < i + _hValCol.length; j++) {
			v.setValueNE(_elmValCols[j], h.getValueNE(_elmCols[j]));
		}
	}

	/**
	 * 縦の行にセットする可変カラムの値がすべてnullに変更さたかをチェックします。<BR>
	 * @param h
	 * @param v
	 * @param i
	 * @return
	 */
	protected boolean isAllChangeToNull(H h, V v, int i) {
		boolean ans = false;
		int pos = i;
		if (_isFirstElmTtl) {
			pos += 1;
		}
		for (int j = pos; j < i + _hValCol.length; j++) {
			// 元の値、画面の値がnullの場合、戻り値はfalseをキープ
			if (isNull(v.getValueNE(_elmValCols[j])) && isNull(h.getValueNE(_elmCols[j]))) {
				continue;
			}
			// null以外があればfalseを返す
			if (!isNull(h.getValueNE(_elmCols[j]))) {
				return false;
			}
			// null以外からnullになったカラムがあれば、戻り値をtrueにセット
			// 他に値の入っているカラムがなければそのままtrueが返る。
			if (!isNull(v.getValueNE(_elmValCols[j]))
					&& isNull(h.getValueNE(_elmCols[j]))) {
				ans = true;
			}

		}
		return ans;
	}

	/**
	 * 一つの_elmColで展開された値のすべてがnullの場合、false
	 * それ以外はtrueを返す
	 * @param h
	 * @param i 横展開で_elmColに対して展開する項目の先頭インデックス
	 * @return
	 */
	protected boolean hasValue(H h, int i) {
		int pos = i;
		if (_isFirstElmTtl) {
			pos += 1;
		}
		for (int j = pos; j < i + _hValCol.length; j++) {
			if ((!isNull(h.getValueNE(_elmCols[j])))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 縦の行を作成する
	 * @param vL 縦のリスト
	 * @param h 横の行
	 * @return　縦の行
	 */
	protected V createVrow(MCList<V> vL, H h) {
		V v = vL.createRow();
		createRelation(h, v);
		copyKeyVal(h, v);
		copyNotKeys(h, v);
		// 行インデックスをセット
		v.setValueNE(ROW_NUM, h.getNumber(ROW_NUM));
		v.setStatus(Status.CREATE);
		return v;
	}

	protected void createRelation(H h, V v) {
		v.setGUIIndex(h.getGUIIndex());
		v.relateContainer(h);
	}

	/**
	* 縦のリストに新規の行を追加します。
	* @param vL 縦のリスト
	* @param h 横の行
	* @param i 編集されたカラムのインデックス
	* @return 追加された行。追加しなかった場合はnullを返します。
	*/
	protected V addNewVRow(MCList<V> vL, H h, int i) {
		if (null == _elmValCols[i]) {
			// 縦の行としては追加しない
			return null;
		}
		V v = createVrow(vL, h);
		v.setValueNE(_elmCol, _elmVals[i]);
		// 横展開したカラムに対する画面入力値をセット
		setHValColAll(h, v, i);
		vL.add(v);
		return v;
	}

	/**
	 * キー項目に変更があるかを返します。
	 * @param h 横の行
	 * @param v hのインデックスを持つ縦の行
	 * @return キー項目に変更があればtrue,それ以外はfalse
	 */
	protected boolean isKeyChanged(H h, V v) {
		boolean ans = false;
		for (String s : _keys) {
			if (!isSame(h.getValueNE(s), v.getValueNE(s))) {
				ans = true;
			}
		}
		return ans;
	}

	/**
	 * 非キー項目に変更があるかを返します。
	 * @param h 横の行
	 * @param v hのインデックスを持つ縦の行
	 * @return 非キー項目に変更があればtrue,それ以外はfalse
	 */
	protected boolean isOthChanged(H h, V v) {
		if (null == _notKeys) {
			// 非キー項目なし
			return false;
		}
		boolean ans = false;
		for (String s : _notKeys) {
			if (!isSame(h.getValueNE(s), v.getValueNE(s))) {
				ans = true;
			}
		}
		return ans;
	}

	/**
	 * 可変カラムの使用部分をReadOnlyステータスにします。<BR>
	 * 未使用の部分はInvisibleステータスにします。
	 */
	public void setReadOnlyStatus() {
		for (int i = 0; i < _viewSize; i++) {
			MCColumnConfig conf = confs[i + _startPos];
			conf.setMode(MCMode.READ_ONLY);
		}
		setInvisibleColumn();
	}

	/**
	 * 可変カラムの使用部分をEnableステータスにします。<BR>
	 * 未使用の部分はInvisibleステータスにします。
	 */
	public void setEnableStatus() {
		for (int i = 0; i < _viewSize; i++) {
			MCColumnConfig conf = confs[i + _startPos];
			conf.setMode(MCMode.ENABLE);
		}
		setInvisibleColumn();
	}

	/**
	 * 可変カラムの未使用部分をInvisibleステータスにします。
	 */
	public void setInvisibleColumn() {
		// 非表示部分の設定
		for (int i = _viewSize + _startPos; i < _startPos + _maxPos; i++) {
			MCColumnConfig conf = confs[i];
			conf.setMode(MCMode.INVISIBLE);
		}
	}

	/**
	 * 可変カラムをすべてInvisibleステータスにします。
	 */
	public void setInvisibleColumnAll() {
		for (int i = _startPos; i < _startPos + _maxPos; i++) {
			MCColumnConfig conf = confs[i];
			conf.setMode(MCMode.INVISIBLE);
		}
	}

	/**
	 * 可変カラムにラベル名とメッセージ用名称を設定します。
	 */
	public void setElmColsLabel(String[] elmLabels, String[] elmMsgs) {
		for (int i = 0; i < elmLabels.length; i++) {
			confs[i].setHeaderName(elmLabels[i]);
			confs[i].setMessageName(elmMsgs[i]);
		}
	}

	/**
	 * 可変カラムのラベル名とメッセージ用名称をクリアします。
	 */
	public void clearElmColsLabel() {
		for (MCColumnConfig c : confs) {
			c.setHeaderName("");
			c.setMessageName("");
		}
	}

	/**
	 * カラム名がnameに等しいMCColumConfigを返します。<BR>
	 * 一致するMCColumnConfigが存在しない場合、nullを返します。
	 * @param name
	 * @return
	 */
	public MCColumnConfig getConfByName(String name) {
		for (MCColumnConfig c : _dispTable.getColumnConfigs()) {
			if (getBaseName(c).equals(name)) {
				return c;
			}
		}
		return null;
	}

	/**
	 * 可変カラムの合計値をttlColにセットします。可変カラムの値がMCNumber型の場合のみ、使用可能です。
	 * @param h
	 * @param ttlCol
	 */
	public void calcElmColTtl(H h, String ttlCol) {
		MCNumber sum = MCNumber.ZERO;
		for (String s : _elmCols) {
			sum = MCNumber.sum(sum, (MCNumber) h.getValueNE(s));
		}

		h.setValueNE(ttlCol, sum == null ? MCNumber.ZERO : sum);
	}

	/**
	 * 全行の可変カラムの合計値をttlColにセットします。<BR>
	 * 可変カラムの値がMCNumber型の場合のみ、使用可能です。
	 * @param ttlCol
	 */
	public void calcElmColTtlAll(String ttlCol) {
		for (H h : _dispTable.getList()) {
			calcElmColTtl(h, ttlCol);
		}
	}

	/**
	 * ベース画面でのカラム名を取得します。
	 * @param c
	 * @return
	 */
	public String getBaseName(MCColumnConfig c) {
		String path = c.getAliasName(c.getBaseRootPanel()) == null ? c
				.getBaseRowColumnName() : c.getAliasName(c.getBaseRootPanel());
		if (null == path || path.indexOf('.') < 0) {
			return path;
		}
		return path.substring(path.lastIndexOf('.') + 1, path.length());
	}

	protected Set<MCColumnConfig> _variableColumn;

	/**
	 * 引数のMCEventBeansがMCColumnConfigのインスタンスで、可変カラムに含まれている場合にtrueを返します。
	 * @param b
	 * @return
	 */
	public boolean isVariableColumn(MCEventBeans b) {
		if (b instanceof MCColumnConfig) {
			if (null == _variableColumn) {
				createVariableColumnSet();
			}
			return _variableColumn.contains((MCColumnConfig) b);
		}
		return false;
	}

	protected void createVariableColumnSet() {
		_variableColumn = new HashSet<MCColumnConfig>();
		for (int i = _startPos; i < _startPos + _maxPos; i++) {
			_variableColumn.add(getConfs()[i]);
		}
	}

	/**
	 * すべての可変カラムのSetを返します。
	 * @return
	 */
	public Set<MCColumnConfig> getVariableColumn() {
		if (null == _variableColumn) {
			createVariableColumnSet();
		}
		return Collections.unmodifiableSet(_variableColumn);
	}

	/**
	 * ELM項目に年月を指定した場合に横展開キー(年月リスト)を返す</br>
	 * ELM項目が年月以外の場合は使用しないでください。
	 * @param fr 開始年月
	 * @param to 終了年月
	 * @return ELM項目に開始年月から終了年月までの年月を設定した縦リスト
	 */
	public MCList<V> createElmListForYM(MCDate fr, MCDate to) {

		MCList<V> ans = _vList.createInstance();
		if(isNullOr(fr, to) || to.ltDate(fr)) {
			return ans;
		}

		for (MCDate curYm = fr; curYm.lteDate(to); curYm = curYm.addMonth(1)) {
			V v = ans.createRow();
			v.setDate(_elmCol, curYm);
			ans.add(v);
			if(ans.size() >= _maxPos){
				break;
			}
		}
		return ans;
	}

	/**
	 * ELM項目に年月を指定した場合にカラムコンフィグとELM(年月)のマップを返す</br>
	 * ELM項目が年月以外の場合は使用しないでください。
	 * @param ymList ELM項目に年月が設定された縦リスト
	 * @return 可変カラムと年月のマッピング
	 */
	public Map<MCColumnConfig, MCDate> createColElmMapForYM(MCList<V> ymList) {
		Map<MCColumnConfig, MCDate> colYmMap = new HashMap<>();
		for (int i = 0; i < ymList.size(); i++) {
			colYmMap.put(getConfs()[i], ymList.get(i).getDate(_elmCol));
		}
		return colYmMap;
	}

	/**
	 * ELM項目に年月を指定した場合に可変カラムにラベル名とメッセージ用名称を設定します。
	 * @param ymList ELM項目に年月が設定された縦リスト
	 */
	public void setElmColsLabelForYM(MCList<V> ymList) {
		List<String> lbl = new ArrayList<>();
		List<String> msg = new ArrayList<>();
		ymList.forEach(r -> {
			lbl.add(toYMHeaderLabel((MAUDP_PanelBase)getDispTable().getBaseRootPanel(), r.getDate(_elmCol)));
			msg.add(toYMHeaderMessage((MAUDP_PanelBase)getDispTable().getBaseRootPanel(), r.getDate(_elmCol)));
			});

		setElmColsLabel(lbl.toArray(new String[0]), msg.toArray(new String[0]));
	}

}
