package mcframe.serverPFBZ.PFBZL9010;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.serverPF.dbc.*;
import static mcframe.commonPF.notice.PF_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverPF.dbc.PFFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.ArrayList;
import mcframe.commonCore.sys.MCFactory;
import mcframe.serverCore.mcjdbc.MCCursor;

import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys.*;
import mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil;
import static mcframe.serverCore.dbc.CoreFunction.*;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBZL_CodeConvert"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBZL_CodeConvert_MC extends PFBZL_CodeConvert_MC_A{
	//FMCB CUSTOM START
	/** 本クラス（スレッドセーフ対応用） */
	protected static final Class<PFBZL_CodeConvert> PFBZL_CodeConvert_CLAZZ = PFBZL_CodeConvert.class;

	/**
	 * IF送信テーブルのDBCナのインスタンスを生成します
	 * 
	 * @param clazz	IF送信テーブルのDBCのクラス
	 * @return		IF送信テーブルのDBCのインスタンス
	 */
	public static <R extends MCDBContainer> IfDBContainer<R>
			crtSendIfDBContainer(Class<R> clazz) {
		return object(PFBZL_CodeConvert_CLAZZ)._createIfDBContainer(clazz, true);
	}

	/**
	 * IF受信テーブルのDBCナのインスタンスを生成します
	 * 
	 * @param clazz	IF受信テーブルのDBCのクラス
	 * @return		IF受信テーブルのDBCのインスタンス
	 */
	public static <R extends MCDBContainer> IfDBContainer<R>
			crtRecvIfDBContainer(Class<R> clazz) {
		return object(PFBZL_CodeConvert_CLAZZ)._createIfDBContainer(clazz, false);
	}

	public StringBuilder sbItmCnv;

	/**
	 * IF送受信テーブルのDBCのインスタンスを生成します
	 * 
	 * @param clazz		IF送受信テーブルのDBCのクラス
	 * @param isSend	送信／受信かのフラグ
	 * @return			IF送受信テーブルのDBCのインスタンス
	 */
	protected <R extends MCDBContainer> IfDBContainer<R>
			_createIfDBContainer(Class<R> clazz, boolean isSend) {
		return new IfDBContainer<R>(clazz, isSend);
	}

	/**
	 * IF送受信テーブル用のDBCを扱うクラスです
	 *
	 * @param <R>	IF送受信テーブルのDBCのインスタンスを生成するRowクラス
	 */
	public class IfDBContainer<R extends MCDBContainer> {
		/**
		 * IF時に項目変換を行う項目を管理するクラスです 
		 */
		public class CnvColumnInf {
			/**
			 * IFテーブルの変換元項目の名称
			 */
			private String _frCol;
			public String getFrCol() {
				return _frCol;
			}
			
			/**
			 * IFテーブルの変換元項目の名称(品目用)
			 */
			private String _frItmCol;
			private String _frItmSub1Col;
			private String _frItmSub2Col;
			private String _frItmSub3Col;
			public String getFrItmCol() {
				return _frItmCol;
			}
			public String getFrItmSub1Col() {
				return _frItmSub1Col;
			}
			public String getFrItmSub2Col() {
				return _frItmSub2Col;
			}
			public String getFrItmSub3Col() {
				return _frItmSub3Col;
			}

			/**
			 * IFテーブルの変換先項目の名称<br>
			 * （通常、”IF_”から始まる）<br>
			 * システム内の名称は "if_" + _frCol で表現される
			 */
			private String _toCol;
			public String getToCol() {
				return _toCol;
			}

			/**
			 * IFテーブルの変換先項目の名称(品目用)<br>
			 * （通常、”IF_”から始まる）<br>
			 * システム内の名称は "if_" + _frCol で表現される
			 */
			private String _toItmCol;
			private String _toItmSub1Col;
			private String _toItmSub2Col;
			private String _toItmSub3Col;
			public String getToItmCol() {
				return _toItmCol;
			}
			public String getToItmSub1Col() {
				return _toItmSub1Col;
			}
			public String getToItmSub2Col() {
				return _toItmSub2Col;
			}
			public String getToItmSub3Col() {
				return _toItmSub3Col;
			}

			/**
			 * 変換後の名称<br>
			 * （SQL実行時のエイリアス（一時カラムで表現される））<br>
			 * システム内の名称は _frCol + "_cnv" で表現される
			 */
			private String _cnvCol;
			public String getCnvCol() {
				return _cnvCol;
			}
			/**
			 * 変換後の名称(取引先なし)<br>
			 * （SQL実行時のエイリアス（一時カラムで表現される））<br>
			 * システム内の名称は _frCol + "_cnvNoBp" で表現される
			 */
			private String _cnvNoBpCol;
			public String getCnvNoBpCol() {
				return _cnvNoBpCol;
			}

			/**
			 * 変換後の名称(品目用)<br>
			 * （SQL実行時のエイリアス（一時カラムで表現される））<br>
			 * システム内の名称は _frCol + "_cnv" で表現される
			 */
			private String _cnvItmCol;
			private String _cnvItmSub1Col;
			private String _cnvItmSub2Col;
			private String _cnvItmSub3Col;
			public String getCnvItmCol() {
				return _cnvItmCol;
			}
			public String getCnvItmSub1Col() {
				return _cnvItmSub1Col;
			}
			public String getCnvItmSub2Col() {
				return _cnvItmSub2Col;
			}
			public String getCnvItmSub3Col() {
				return _cnvItmSub3Col;
			}
			
			/**
			 * 変換後の名称(品目用)(取引先なし)<br>
			 * （SQL実行時のエイリアス（一時カラムで表現される））<br>
			 * システム内の名称は _frCol + "_cnvNoBp" で表現される
			 */
			private String _cnvItmNoBpCol;
			private String _cnvItmSub1NoBpCol;
			private String _cnvItmSub2NoBpCol;
			private String _cnvItmSub3NoBpCol;
			public String getCnvItmNoBpCol() {
				return _cnvItmNoBpCol;
			}
			public String getCnvItmSub1NoBpCol() {
				return _cnvItmSub1NoBpCol;
			}
			public String getCnvItmSub2NoBpCol() {
				return _cnvItmSub2NoBpCol;
			}
			public String getCnvItmSub3NoBpCol() {
				return _cnvItmSub3NoBpCol;
			}

			/**
			 * 変換後項目のSelect句<br>
			 * 通常、変換後のカラムはMAM_IF_CD_X.conv_cdが使用されるが<br>
			 * 当該項目が設定されている場合、代わりにこの項目がSelect句に追加される
			 */
			private MCSubQuery _cnvSelectSubQuery;
			
			/**
			 * 変換時に使用されるIF項目区分の名称（変換項目ごとに定義される）
			 * （SQL実行時のエイリアス（一時カラムで表現される））<br>
			 */
			private MAC_IF_COL_TYP _ifColTyp;
			public MAC_IF_COL_TYP getIfColTyp() {
				return _ifColTyp;
			}
			
			/**
			 * 変換時の扱いに関するパラメータの名称<br>
			 * （SQL実行時のエイリアス（一時カラムで表現される））<br>
			 * MAM_IF_CD_RULEから取得<br>
			 * システム内での名称は  _frCol + "_proc" で表現される
			 */
			private String _colConvTyp;
			public String getColConvTyp() {
				return _colConvTyp;
			}

			/**
			 * 変換先項目の値がnullの時のみ、変換後の値を設定するフラグ
			 * 
			 */
			private boolean _isNvl = false;
			public boolean isNvl() {
				return _isNvl;
			}
			
			/**
			 * 同一の変換先項目の存在を示すフラグ<br>
			 * trueが設定されている変換対象は、他と比べて以下の点で異なる<br>
			 * ・変換チェックエラーの対象外
			 * ・更新時のSQLから除外される
			 * 
			 */
			private boolean _fakeInf = false;
			public boolean isFakeInf() {
				return _fakeInf;
			}

			/**
			 * 複数の変換処理をグルーピングするキー
			 */
			private int _cnvGroup = 0;

			
			/**
			 * コンストラクタ
			 * 
			 * @param frCol		変換元の名称
			 * @param ifColTyp	IF項目区分
			 */
			public CnvColumnInf(String frCol, MAC_IF_COL_TYP ifColTyp) {
				this(frCol, "if_" + frCol, ifColTyp, false);
			}
			
			/**
			 * コンストラクタ
			 * 
			 * @param frCol		変換元の名称
			 * @param toCol		変換先の名称
			 * @param ifColTyp	IF項目区分
			 * @param isToColNullOnly 変換先がnullの時のみ変換後の値を設定するか
			 */
			public CnvColumnInf(String frCol, String toCol, MAC_IF_COL_TYP ifColTyp, boolean isToColNullOnly) {
				this(frCol, toCol, frCol + "_cnv", frCol + "_cnvNoBp", ifColTyp, frCol + "_proc", isToColNullOnly);
			}
			
			/**
			 * コンストラクタ
			 * 
			 * @param frCol		変換元の名称
			 * @param toCol		変換先の名称
			 * @param cnvCol	変換時の名称
			 * @param cnvNoBpCol	変換時の名称(取引先なし)
			 * @param ifColTyp	IF項目区分の名称
			 * @param colConvTyp	IF変換区分の名称
			 * @param isNvl 	変換先がnullの時のみ変換後の値を設定するか
			 */
			public CnvColumnInf(String frCol, String toCol, String cnvCol,
					String cnvNoBpCol, MAC_IF_COL_TYP ifColTyp, String colConvTyp,
					boolean isNvl) {
				
				_frCol     =  frCol;
				_cnvCol    =  cnvCol;
				_cnvNoBpCol	= cnvNoBpCol;
				_toCol     =  toCol;
				_ifColTyp   = ifColTyp;
				_colConvTyp = colConvTyp;
				_isNvl = isNvl;
			}
			
			/**
			 * 品目用のコンストラクタ
			 * 
			 * @param frItmCol		変換元の品目の名称
			 * @param frItmSub1Col	変換元の枝番１の名称
			 * @param frItmSub2Col	変換元の枝番２の名称
			 * @param frItmSub3Col	変換元の枝番３の名称
			 */
			public CnvColumnInf(String frItmCol, String frItmSub1Col, String frItmSub2Col,
					String frItmSub3Col) {

				this(frItmCol, frItmSub1Col, frItmSub2Col, frItmSub3Col, "if_" + frItmCol,
						"if_" + frItmSub1Col, "if_" + frItmSub2Col, "if_" + frItmSub3Col,
						false);
			}
			
			/**
			 * 品目用のコンストラクタ
			 * 
			 * @param frItmCol		変換元の品目の名称
			 * @param frItmSub1Col	変換元の枝番１の名称
			 * @param frItmSub2Col	変換元の枝番２の名称
			 * @param frItmSub3Col	変換元の枝番３の名称
			 * @param toItmCol		変換先の品目の名称
			 * @param toItmSub1Col	変換先の枝番１の名称
			 * @param toItmSub2Col	変換先の枝番２の名称
			 * @param toItmSub3Col	変換先の枝番３の名称
			 * @param isToColNullOnly 変換先がnullの時のみ変換後の値を設定するか
			 */
			public CnvColumnInf(String frItmCol, String frItmSub1Col, String frItmSub2Col,
					String frItmSub3Col, String toItmCol, String toItmSub1Col,
					String toItmSub2Col, String toItmSub3Col, boolean isToColNullOnly) {

				this(frItmCol, frItmSub1Col, frItmSub2Col, frItmSub3Col, toItmCol,
						toItmSub1Col, toItmSub2Col, toItmSub3Col, frItmCol + "_cnv",
						frItmSub1Col + "_cnv", frItmSub2Col + "_cnv",
						frItmSub3Col + "_cnv", frItmCol + "_cnvNoBp",
						frItmSub1Col + "_cnvNoBp", frItmSub2Col + "_cnvNoBp",
						frItmSub3Col + "_cnvNoBp", frItmCol + "_proc", isToColNullOnly);
			}
			
			/**
			 * 品目用のコンストラクタ
			 * 
			 * @param frItmCol		変換元の品目の名称
			 * @param frItmSub1Col	変換元の枝番１の名称
			 * @param frItmSub2Col	変換元の枝番２の名称
			 * @param frItmSub3Col	変換元の枝番３の名称
			 * @param toItmCol		変換先の品目の名称
			 * @param toItmSub1Col	変換先の枝番１の名称
			 * @param toItmSub2Col	変換先の枝番２の名称
			 * @param toItmSub3Col	変換先の枝番３の名称
			 * @param cnvItmCol		変換時の品目の名称
			 * @param cnvItmSub1Col	変換時の枝番１の名称
			 * @param cnvItmSub2Col	変換時の枝番２の名称
			 * @param cnvItmSub3Col	変換時の枝番３の名称
			 * @param cnvItmNoBpCol	変換時の品目の名称(取引先なし)
			 * @param cnvItmSub1NoBpCol	変換時の枝番１の名称(取引先なし)
			 * @param cnvItmSub2NoBpCol	変換時の枝番２の名称(取引先なし)
			 * @param cnvItmSub3NoBpCol	変換時の枝番３の名称(取引先なし)
			 * @param colConvTyp	IF変換区分の名称
			 * @param isNvl			変換先がnullの時のみ変換後の値を設定するか
			 */
			public CnvColumnInf(String frItmCol, String frItmSub1Col, String frItmSub2Col,
					String frItmSub3Col, String toItmCol, String toItmSub1Col,
					String toItmSub2Col, String toItmSub3Col, String cnvItmCol,
					String cnvItmSub1Col, String cnvItmSub2Col, String cnvItmSub3Col,
					String cnvItmNoBpCol, String cnvItmSub1NoBpCol,
					String cnvItmSub2NoBpCol, String cnvItmSub3NoBpCol, String colConvTyp,
					boolean isNvl) {

				_frItmCol = frItmCol;
				_frItmSub1Col = frItmSub1Col;
				_frItmSub2Col = frItmSub2Col;
				_frItmSub3Col = frItmSub3Col;
				_toItmCol = toItmCol;
				_toItmSub1Col = toItmSub1Col;
				_toItmSub2Col = toItmSub2Col;
				_toItmSub3Col = toItmSub3Col;
				_cnvItmCol = cnvItmCol;
				_cnvItmSub1Col = cnvItmSub1Col;
				_cnvItmSub2Col = cnvItmSub2Col;
				_cnvItmSub3Col = cnvItmSub3Col;
				_cnvItmNoBpCol = cnvItmNoBpCol;
				_cnvItmSub1NoBpCol = cnvItmSub1NoBpCol;
				_cnvItmSub2NoBpCol = cnvItmSub2NoBpCol;
				_cnvItmSub3NoBpCol = cnvItmSub3NoBpCol;
				_ifColTyp = MAC_IF_COL_TYP.ITM;
				_colConvTyp = colConvTyp;
				_isNvl = isNvl;
			}
		}

		/**
		 * SQL Builder
		 */
		protected MCQueryApiBuilder _builder;
		
		/**
		 * DBコンテナ
		 */
		protected R _dbc;
		
		/**
		 * IF送受信テーブルのクラス
		 * 
		 */
		protected Class<R> _classL;

		/**
		 * コード変換処理の実行単位となるキー項目を管理
		 */
		protected String[] _cnvKeys;

		/**
		 * ＩＦテーブルの検索結果
		 */
		protected MCList<R> _ifL;
		
		/**
		 * ＩＦテーブルの検査結果退避用
		 */
		protected MCList<R> _allIfL;
		
		/**
		 * 項目変換できなかったデータを格納するDBC
		 */
		protected MCList<R> _exIfL;
		
		/**
		 * 項目変換できたデータを格納するDBC
		 */
		protected MCList<R> _successIfL;
		
		protected MCList<R> _ignoreConvIfL;
		
		/**
		 * 項目変換を行う項目を管理
		 */
		protected ArrayList<CnvColumnInf> _cnvCols = new ArrayList<>();

		/**
		 * 項目変換時のメッセージを管理
		 */
		protected MCMessageList _msgL = new MCMessageList();
		
		/**
		 * 項目変換時のメッセージをメッセージプールに追加するか判定するフラグ
		 */
		protected boolean _isAddMsgPool = true;

		/**
		 * 送信／受信かのフラグ<br>
		 * true：送信 ／ false：受信
		 * 
		 */
		protected boolean _isSend = true;
		
		/**
		 * 送受信テーブルの累積検索結果にレコードを追加するか判定するフラグ<br>
		 * true：追加する ／ false：追加しない
		 * 
		 */
		protected boolean _isAddAllIfL = false;
		/**
		 * 変換処理を実行する際に変換マスタ取得要素として利用する取引先のリスト
		 * 
		 * リストがブランクの場合は、取引先を変換マスタ取得時のキーとして使用しない
		 * 
		 */
		protected java.util.List<String> _cnvBpList = null;
		protected java.util.Map<String, String> _cnvBpMap = new java.util.HashMap<>();
		public java.util.Map<String, String> getCnvBpMap() {
			return _cnvBpMap;
		}
		
		protected String _coCd = null;
		public void setCoCd(String coCd) {
			_coCd = coCd;
			return;
		}

		/**
		 * コンストラクタ
		 * 
		 * @param rowc	DBCのインスタンスを生成するRowクラス
		 */
		public IfDBContainer(Class<R> clazz) {
			this(clazz, true);
		}
		
		/**
		 * コンストラクタ
		 * 
		 * @param clazz		DBCのインスタンスを生成するRowクラス
		 * @param isSend	送信／受信かのフラグ
		 */
		@SuppressWarnings("unchecked")  // invokeStaticのキャスト
		public IfDBContainer(Class<R> clazz, boolean isSend) {
			_ifL   = MCList.create(clazz);
			_allIfL = MCList.create(clazz);
			_exIfL = MCList.create(clazz);
			_successIfL = MCList.create(clazz);
			_ignoreConvIfL = MCList.create(clazz);
			_isSend = isSend;
			_classL = clazz;
			_dbc = (R)MCFactory.invokeStatic(clazz, "create", new Class[]{String.class}, new Object[]{"T1"});
			_builder = MCQueryApiBuilder.create(_dbc);
		}
		
		/**
		 * DBCのテーブル名を生成します
		 * 
		 * @return		テーブルの名称
		 */
		protected String getTblName() {
			return _dbc.tableName();
		}
		
		/**
		 * 変換対象の項目を追加します<br>
		 * 変換先の名称は "if_"+frCol になります
		 * 
		 * @param frCol		変換元の名称
		 * @param ifColTyp	IF項目区分の名称
		 */
		public void addCnvCol(String frCol, MAC_IF_COL_TYP ifColTyp) {
			addCnvCol(new CnvColumnInf(frCol, ifColTyp));
		}
		
		/**
		 * 変換対象の項目を追加します
		 * 
		 * @param frCol		変換元の名称
		 * @param toCol		変換先の名称
		 * @param ifColTyp	IF項目区分の名称
		 */
		public void addCnvCol(String frCol, String toCol, MAC_IF_COL_TYP ifColTyp) {
			addCnvCol(new CnvColumnInf(frCol, toCol, ifColTyp, false));
		}
		
		/**
		 * 変換対象の項目を追加します
		 * 
		 * @param frCol		変換元の名称
		 * @param toCol		変換先の名称
		 * @param ifColTyp	IF項目区分の名称
		 * @param isToColNullOnly	変換先の値がnullの時のみ、変換後の値を設定するか
		 */
		public void addCnvCol(String frCol, String toCol, MAC_IF_COL_TYP ifColTyp, boolean isToColNullOnly) {
			addCnvCol(new CnvColumnInf(frCol, toCol, ifColTyp, isToColNullOnly));
		}
		
		/**
		 * 変換対象の項目を追加します
		 * 
		 * @param frCol		変換元の名称
		 * @param toCol		変換先の名称
		 * @param ifColTyp	IF項目区分の名称
		 * @param isToColNullOnly	変換先の値がnullの時のみ、変換後の値を設定するか
		 * @param cnvSelect	変換後項目を取得するSelect句
		 */
		public void addCnvCol(String frCol, String toCol, MAC_IF_COL_TYP ifColTyp, boolean isToColNullOnly, MCSubQuery cnvSelect) {
			CnvColumnInf inf = new CnvColumnInf(frCol, toCol, ifColTyp, isToColNullOnly);
			inf._cnvSelectSubQuery = cnvSelect;
			addCnvCol(inf);
		}
		
		/**
		 * 変換対象の項目を追加します
		 * 
		 * @param frCol		変換元の名称
		 * @param toCol		変換先の名称
		 * @param ifColTyp	IF項目区分の名称
		 * @param isToColNullOnly	変換先の値がnullの時のみ、変換後の値を設定するか
		 * @param cnvSelect	変換後項目を取得するSelect句
		 * @param chkGroup	複数の変換処理をグルーピングするキー
		 */
		public void addCnvCol(
			String frCol, String toCol, MAC_IF_COL_TYP ifColTyp, boolean isToColNullOnly, MCSubQuery cnvSelect, int cnvGroup) {
			CnvColumnInf inf = new CnvColumnInf(frCol, toCol, ifColTyp, isToColNullOnly);
			inf._cnvSelectSubQuery = cnvSelect;
			inf._cnvGroup = cnvGroup;
			addCnvCol(inf);
		}
		
		/**
		 * 変換対象の項目を追加します(品目用)<br>
		 * 変換先の名称は "if_"+frCol になります
		 * 
		 * @param frItmCol		変換元の品目の名称
		 * @param frItmSub1Col	変換元の枝番１の名称
		 * @param frItmSub2Col	変換元の枝番２の名称
		 * @param frItmSub3Col	変換元の枝番３の名称
		 */
		public void addCnvItmCol(String frItmCol, String frItmSub1Col,
				String frItmSub2Col, String frItmSub3Col) {
			addCnvCol(
					new CnvColumnInf(frItmCol, frItmSub1Col, frItmSub2Col, frItmSub3Col));
		}
		
		/**
		 * 変換対象の項目を追加します(品目用)
		 * 
		 * @param frItmCol		変換元の品目の名称
		 * @param frItmSub1Col	変換元の枝番１の名称
		 * @param frItmSub2Col	変換元の枝番２の名称
		 * @param frItmSub3Col	変換元の枝番３の名称
		 * @param toItmCol		変換先の品目の名称
		 * @param toItmSub1Col	変換先の枝番１の名称
		 * @param toItmSub2Col	変換先の枝番２の名称
		 * @param toItmSub3Col	変換先の枝番３の名称
		 */
		public void addCnvItmCol(String frItmCol, String frItmSub1Col,
				String frItmSub2Col, String frItmSub3Col, String toItmCol,
				String toItmSub1Col, String toItmSub2Col, String toItmSub3Col) {
			addCnvCol(new CnvColumnInf(frItmCol, frItmSub1Col, frItmSub2Col, frItmSub3Col,
					toItmCol, toItmSub1Col, toItmSub2Col, toItmSub3Col, false));
		}
		
		/**
		 * 変換対象の項目を追加します(品目用)
		 * 
		 * @param frItmCol		変換元の品目の名称
		 * @param frItmSub1Col	変換元の枝番１の名称
		 * @param frItmSub2Col	変換元の枝番２の名称
		 * @param frItmSub3Col	変換元の枝番３の名称
		 * @param toItmCol		変換先の品目の名称
		 * @param toItmSub1Col	変換先の枝番１の名称
		 * @param toItmSub2Col	変換先の枝番２の名称
		 * @param toItmSub3Col	変換先の枝番３の名称
		 * @param isToColNullOnly	変換先の値がnullの時のみ、変換後の値を設定するか
		 */
		public void addCnvItmCol(String frItmCol, String frItmSub1Col, String frItmSub2Col,
				String frItmSub3Col, String toItmCol, String toItmSub1Col,
				String toItmSub2Col, String toItmSub3Col, boolean isToColNullOnly) {
			addCnvCol(new CnvColumnInf(frItmCol, frItmSub1Col, frItmSub2Col, frItmSub3Col,
					toItmCol, toItmSub1Col, toItmSub2Col, toItmSub3Col, isToColNullOnly));
		}
		
		/**
		 * 変換対象の項目を追加します(品目用)
		 * 
		 * @param frItmCol		変換元の品目の名称
		 * @param frItmSub1Col	変換元の枝番１の名称
		 * @param frItmSub2Col	変換元の枝番２の名称
		 * @param frItmSub3Col	変換元の枝番３の名称
		 * @param toItmCol		変換先の品目の名称
		 * @param toItmSub1Col	変換先の枝番１の名称
		 * @param toItmSub2Col	変換先の枝番２の名称
		 * @param toItmSub3Col	変換先の枝番３の名称
		 * @param isToColNullOnly	変換先の値がnullの時のみ、変換後の値を設定するか
		 * @param cnvGroup	複数の変換処理をグルーピングするキー
		 */
		public void addCnvItmCol(String frItmCol, String frItmSub1Col,
				String frItmSub2Col, String frItmSub3Col, String toItmCol,
				String toItmSub1Col, String toItmSub2Col, String toItmSub3Col,
				boolean isToColNullOnly, int cnvGroup) {
			CnvColumnInf inf = new CnvColumnInf(frItmCol, frItmSub1Col, frItmSub2Col,
					frItmSub3Col, toItmCol, toItmSub1Col, toItmSub2Col, toItmSub3Col,
					isToColNullOnly);
			inf._cnvGroup = cnvGroup;
			addCnvCol(inf);
		}

		/**
		 * 変換対象の項目を追加します
		 * 
		 * @param inf
		 */
		protected void addCnvCol(CnvColumnInf inf) {
			checkFake(inf);
			_cnvCols.add(inf);
		}

		/**
		 * 引数の変換先項目がすでに設定されている場合、<br>
		 * 設定済みの変換対象の_fakeInfにtrueを設定します
		 * 
		 * @param inf
		 */
		protected void checkFake(CnvColumnInf inf) {
			if (!_cnvCols.isEmpty()) {
				CnvColumnInf o = _cnvCols.get(_cnvCols.size() - 1);
				
				if (MAC_IF_COL_TYP.isITM(inf.getIfColTyp())) {
					if (o._cnvGroup == inf._cnvGroup
							&& isSame(o._toItmCol, inf._toItmCol)) {
						o._fakeInf = true;
						return;
					}
				}
				else {
					if (o._cnvGroup == inf._cnvGroup && isSame(o._toCol, inf._toCol)) {
						o._fakeInf = true;
						return;
					}
				}
			}
		}
		
		/**
		 * 変換先項目（_fakeInfがfalseのみ）を取得します
		 * 
		 * @return
		 */
		protected String[] getToCols() {
			ArrayList<String> arr = new ArrayList<>();
			for (CnvColumnInf inf : _cnvCols) {
				if (MAC_IF_COL_TYP.isITM(inf.getIfColTyp())) {
					if (!arr.contains(inf._toItmCol)) {
						arr.add(inf._toItmCol);
					}					
					if (!arr.contains(inf._toItmSub1Col)) {
						arr.add(inf._toItmSub1Col);
					}					
					if (!arr.contains(inf._toItmSub2Col)) {
						arr.add(inf._toItmSub2Col);
					}					
					if (!arr.contains(inf._toItmSub3Col)) {
						arr.add(inf._toItmSub3Col);
					}
				}
				else {
					if (!arr.contains(inf._toCol)) {
						arr.add(inf._toCol);
					}
				}
			}
			return arr.toArray(new String[arr.size()]);
		}
		
		
		
		/**
		 * IF送受信対象のデータが存在するかチェックします
		 * 
		 */
		public void checkIfL() {
			PFW_SDRV_IF_R W1 = PFW_SDRV_IF_R.create("W1");
			MCRow r = MCRow.create();
			sql(createSqlId(LOGIC_ID, W1, "S02"))
			.mainQuery()
			.select(MAUCL_DbUtil.COUNT_COL)
			.from(_dbc
					.innerJoin(W1).on(W1.data_no.eq((MCNumberPermColumn)_dbc.getColumn$("data_no"))))
			.executeQuery(r);
			
			MCNumber n = r.getNumber(MAUCL_DbUtil.COUNT_NAME);
			if (n.lte(0)) {
				throw new MCAppException(PFBZL0004, _dbc.tableName());
			}
		}

		/**
		 * IF送受信テーブルのSQLBuilderを取得します
		 * @return SQLBuilder
		 */
		public MCQueryApiBuilder getBuilder() {
			return _builder;
		}

		/**
		 * IF送受信テーブルの検索結果を取得します
		 * 
		 * @return	ＩＦテーブル検索結果
		 */
		public MCList<R> getIfL() {
			return _ifL;
		}

		/**
		 * IF送受信テーブルの累積検索結果を取得します
		 * 
		 * @return	IF送受信データの累積検索結果
		 */
		public MCList<R> getAllIfL() {
			return _allIfL;
		}
		
		/**
		 *  IF送受信テーブルの累積検索結果にレコードを追加するかのフラグを設定します
		 */
		public void setAddAllIfLFlg(boolean isAdd) {
			_isAddAllIfL = isAdd;
		}
		
		/**
		 * 変換対象の項目を変換します<br>
		 * 
		 * @param cnvBpValue	変換後の取引先ＣＤ
		 */
		public void execCnvIfCols(String cnvBpValue) {
			R bkR = null;
			MCNumber errLno = null;	// 直近でエラーのあった行NO
			String[] toCols = getToCols();
			MCCursor<R> cur = null;
			try {
				// 対象のデータはワークテーブルに書かれているので、ここでは引数を使用しない
				MCRow bind = _builder.getMergeBind();
				bind.addStringColumn("cnvBpValue", cnvBpValue);
				cur = _builder.buildSelect(createSqlId(LOGIC_ID, _dbc, "S03")).openCursor(bind, _classL);
				String ifCoCdCol = MAC_IF_PROC_TYP.co_recv_co_col(getPfwSdrvIfL().get(0).if_proc_typ());
				
				if (cur.dbFetch() <= 0) {
					throw new MCAppException(PFBZL0012, getTblName());
				}
				do {
					MCList<R> fetchList = cur.getList();
					for (R ifR : fetchList) {
						if (isSame(errLno, ifR.getNumber(_$data_lno))) {
							continue;	// エラー扱い済みは対象外
						}
						if (cnvIfCols(ifR, bkR, cnvBpValue)
						 || !rowValidate(ifR, toCols)) {
							_exIfL.add(ifR);
							errLno = ifR.getNumber(_$data_lno);
						}
						else if (!isNull(_coCd) && !ifR.getStringNE(ifCoCdCol).equals(_coCd)) {
							_ignoreConvIfL.add(ifR);
						}
						bkR = ifR;
					}
					_ifL.setAll(fetchList);
					setExeStsTyp();
					if (!isNull(_coCd)) {
						_ifL = _ifL.subList(ifCoCdCol, _coCd);
					}
					dbUpdateKey(createSqlId(LOGIC_ID, _dbc, "U01"), _ifL, _builder);
					//処理毎の変換済みデータを_allIfLに収集
					if (_isAddAllIfL) {
						_allIfL.addAll(_ifL);
					}
				} while (cur.dbFetch() > 0);
			}
			finally {
				if (cur != null) {
					cur.dbCloseCur();
				}
				if (_isAddMsgPool) {
					MCMessagePool.addAll(_msgL);
					_msgL.clear();
				}
			}
		}
		
		/**
		 * ＰＧ実行状況区分を設定します
		 */
		protected void setExeStsTyp() {
			MCIndexKey idx1 = _ifL.createIndex(_$data_no),
					   idx2 = _exIfL.createIndex(_$data_no),
					   idx3 = _successIfL.createIndex(_$data_no);
			
			MCList<R> successErrL = _successIfL.createInstance();

			for (R grpR : _ifL.groupBy(_$data_no)) {
				MCNumber no = grpR.getNumber(_$data_no);

				String typ = MAC_EXE_STS_TYP.NOT_EXE.value();
				if (!isNull(_exIfL.getFirst(idx2, no))) {
					typ = MAC_EXE_STS_TYP.ERR.value();
					
					if (!_successIfL.isEmpty()) {
						MCList<R> successIfL = (MCList<R>)_successIfL.subList(idx3, no);
						successErrL.addAll(successIfL);
					}
				}

				MCList<R> ifL = (MCList<R>)_ifL.subList(idx1, no);
				if (!_isSend) {
					// 未処理→取込対象FLG=ON
					ifL.setBoolean(_$imp_flg, MAC_EXE_STS_TYP.isNOT_EXE(typ));
				}
				ifL.setString(_$exe_sts_typ, typ);
			}
			
			if (!successErrL.isEmpty()) {
				if (!_isSend) {
					successErrL.setBoolean(_$imp_flg, false);
				}
				successErrL.setString(_$exe_sts_typ, MAC_EXE_STS_TYP.ERR.value());
				_ifL.addAll(successErrL);
				_successIfL.removeAll(successErrL);
			}
			MCList<R> successAllL = _ifL.subList(_$exe_sts_typ, MAC_EXE_STS_TYP.NOT_EXE.value());
			_successIfL.addAll(successAllL);
		}

		/**
		 * 変換対象の項目を変換します
		 * 
		 * @param ifR	変換対象のデータ
		 * @param bkR	１つ前の変換対象のデータ
		 * @param cnvBpValue	変換後の取引先ＣＤ
		 * @return		true：変換エラーあり
		 * 				false：変換エラーなし
		 */
		protected boolean cnvIfCols(R ifR, R bkR, String cnvBpValue) {
			boolean err = false;
			String errToCol = null;
			for (CnvColumnInf inf : _cnvCols) {
				if (err && isSame(nvl(inf._toCol, inf._toItmCol), errToCol)) {
					// 同一の変換後カラムにエラーがあった場合は、以降は変換しない
					continue;
				}
				if (isChkCnvIfCol(inf, ifR, bkR) && chkCnvIfCol(inf, ifR, bkR, cnvBpValue)) {
					err = true;
					errToCol = nvl(inf._toCol, inf._toItmCol);
				}
				cnvIfCol(inf, ifR, isSame(nvl(inf._toCol, inf._toItmCol), errToCol));
			}
			return err;
		}
		/**
		 * 変換対象の項目を判定します
		 * 
		 * @param inf	変換対象
		 * @param ifR	変換対象のデータ
		 * @param bkR	１つ前の変換対象のデータ
		 * @return		true：変換対象
		 * 				false：変換対象外
		 */
		protected boolean isChkCnvIfCol(CnvColumnInf inf, R ifR, R bkR) {
			// 変換先に対して変換対象が複数ある場合の最後の変換対象の場合のみ変換チェックを行う
			if (inf._fakeInf) {
				return false;
			}
			return true;
		}
		
		/**
		 * 変換対象の項目をチェックします
		 * 
		 * @param inf	変換対象
		 * @param ifR	変換対象のデータ
		 * @param bkR	１つ前の変換対象のデータ
		 * @param cnvBpValue	変換後の取引先ＣＤ
		 * @return		true：変換エラーあり
		 * 				false：変換エラーなし
		 */
		protected boolean chkCnvIfCol(CnvColumnInf inf, R ifR, R bkR, String cnvBpValue) {

			if (MAC_IF_COL_TYP.isITM(inf.getIfColTyp())) {
				// 変換先が取得できなかった
				if ((!inf.isNvl() || isNull(ifR.getStringNE(inf._toItmCol)))
						&& MAC_COL_CONV_TYP
								.isCONV_ERR(ifR.getStringNE(inf.getColConvTyp()))
						&& !isNull(ifR.getStringNE(inf._frItmCol))
						&& isNull(ifR.getStringNE(inf._cnvItmCol))
						&& isNull(ifR.getStringNE(inf._cnvItmNoBpCol))) {
					
					if (_isSend) {
						_msgL.add(new MCMessage(ifR, null, PFBZL0501,
								ifR.getNumber(_$data_no), ifR.getNumber(_$data_lno),
								ifR.getString(_$ext_sys_cd), cnvBpValue,
								getLabel(inf._frItmCol), inf._frItmCol,
								inf._ifColTyp.value(),
								toDispItm(ifR.getStringNE(inf._frItmCol),
										ifR.getStringNE(inf._frItmSub1Col),
										ifR.getStringNE(inf._frItmSub2Col),
										ifR.getStringNE(inf._frItmSub3Col)),
								null, null, null, null,
								ifR.getStringNE(inf._frItmCol),
								nvl(ifR.getStringNE(inf._frItmSub1Col), MAC_STR.NULL_VAL.value()),
								nvl(ifR.getStringNE(inf._frItmSub2Col), MAC_STR.NULL_VAL.value()),
								nvl(ifR.getStringNE(inf._frItmSub3Col), MAC_STR.NULL_VAL.value())));
					}
					else {
						_msgL.add(new MCMessage(ifR, null, PFBZL0501,
								ifR.getNumber(_$data_no), ifR.getNumber(_$data_lno),
								ifR.getString(_$ext_sys_cd), cnvBpValue,
								getLabel(inf._frItmCol), inf._frItmCol,
								inf._ifColTyp.value(), null,
								ifR.getStringNE(inf._frItmCol),
								ifR.getStringNE(inf._frItmSub1Col),
								ifR.getStringNE(inf._frItmSub2Col),
								ifR.getStringNE(inf._frItmSub3Col),
								null, null, null, null));
					}
					return true;
				}
				// 変換対象が複数あり
				else if (!isNull(bkR)
						&& isSame(ifR.getNumber(_$data_lno), bkR.getNumber(_$data_lno))
						&& (!isSame(ifR.getStringNE(inf._cnvItmCol),
								bkR.getStringNE(inf._cnvItmCol))
								|| !isSame(ifR.getStringNE(inf._cnvItmNoBpCol),
										bkR.getStringNE(inf._cnvItmNoBpCol)))) {
					if (_isSend) {
						_msgL.add(new MCMessage(ifR, null, PFBZL0502,
								ifR.getNumber(_$data_no), ifR.getNumber(_$data_lno),
								ifR.getString(_$ext_sys_cd), cnvBpValue,
								getLabel(inf._frItmCol), inf._frItmCol,
								inf._ifColTyp.value(),
								toDispItm(ifR.getStringNE(inf._frItmCol),
										ifR.getStringNE(inf._frItmSub1Col),
										ifR.getStringNE(inf._frItmSub2Col),
										ifR.getStringNE(inf._frItmSub3Col)),
								null, null, null, null));
					}
					else {
						_msgL.add(new MCMessage(ifR, null, PFBZL0502,
								ifR.getNumber(_$data_no), ifR.getNumber(_$data_lno),
								ifR.getString(_$ext_sys_cd), cnvBpValue,
								getLabel(inf._frItmCol), inf._frItmCol,
								inf._ifColTyp.value(), null,
								ifR.getStringNE(inf._frItmCol),
								ifR.getStringNE(inf._frItmSub1Col),
								ifR.getStringNE(inf._frItmSub2Col),
								ifR.getStringNE(inf._frItmSub3Col)));
					}
					bkR.setStringNE(inf._toItmCol, null);
					return true;
				}
			}
			else {
				// 変換先が取得できなかった
				if ((!inf.isNvl() || isNull(ifR.getStringNE(inf._toCol)))
						&& MAC_COL_CONV_TYP
								.isCONV_ERR(ifR.getStringNE(inf.getColConvTyp()))
						&& !isNullOrNullVal(ifR.getStringNE(inf._frCol))
						&& isNull(ifR.getStringNE(inf._cnvCol))
						&& isNull(ifR.getStringNE(inf._cnvNoBpCol))) {
					if (_isSend) {
						_msgL.add(
								new MCMessage(
									ifR, null, PFBZL0001,
									ifR.getNumber(_$data_no),
									ifR.getNumber(_$data_lno),
									ifR.getString(_$ext_sys_cd),
									cnvBpValue,
									getLabel(inf._frCol), inf._frCol,
									inf._ifColTyp.value(), ifR.getStringNE(inf._frCol), null));
					}
					else {
						_msgL.add(
								new MCMessage(
									ifR, null, PFBZL0001,
									ifR.getNumber(_$data_no),
									ifR.getNumber(_$data_lno),
									ifR.getString(_$ext_sys_cd),
									cnvBpValue,
									getLabel(inf._frCol), inf._frCol,
									inf._ifColTyp.value(), null, ifR.getStringNE(inf._frCol)));
					}
					return true;
				}
				// 変換対象が複数あり
				else if (!isNull(bkR)
						&& isSame(ifR.getNumber(_$data_lno), bkR.getNumber(_$data_lno))
						&& (!isSame(ifR.getStringNE(inf._cnvCol),
								bkR.getStringNE(inf._cnvCol))
								|| !isSame(ifR.getStringNE(inf._cnvNoBpCol),
										bkR.getStringNE(inf._cnvNoBpCol)))) {
					if (_isSend) {
						_msgL.add(
								new MCMessage(
								ifR, null, PFBZL0007,
								ifR.getNumber(_$data_no),
								ifR.getNumber(_$data_lno),
								ifR.getString(_$ext_sys_cd),
								cnvBpValue,
								getLabel(inf._frCol), inf._frCol,
								inf._ifColTyp.value(), ifR.getStringNE(inf._frCol), null));						
					}
					else {
						_msgL.add(
								new MCMessage(
								ifR, null, PFBZL0007,
								ifR.getNumber(_$data_no),
								ifR.getNumber(_$data_lno),
								ifR.getString(_$ext_sys_cd),
								cnvBpValue,
								getLabel(inf._frCol), inf._frCol,
								inf._ifColTyp.value(), null, ifR.getStringNE(inf._frCol)));
					}
					bkR.setStringNE(inf._toCol, null);
					return true;
				}
			}
			return false;
		}

		/**
		 * 変換対象の項目を変換します
		 * 
		 * @param inf	変換対象
		 * @param ifR	変換対象のデータ
		 * @param	chkErr	変換エラーありか
		 */
		protected void cnvIfCol(CnvColumnInf inf, R ifR, boolean chkErr) {

			String colConvTyp = ifR.getStringNE(inf.getColConvTyp());

			// 変換エラーがあった場合はnullを設定
			// ＩＦコードルールマスタが未登録の場合、ＩＦ変換区分値がNONの場合、変換結果がNULLの場合は
			// コード変換をせず、そのままの値を設定する
			if (MAC_IF_COL_TYP.isITM(inf.getIfColTyp())) {
				if(!isNull(ifR.getStringNE(inf.getToItmCol()))  && inf.isNvl()) {
					return;
				}
				String toItmValue = nvl(ifR.getStringNE(inf.getCnvItmCol()),
						ifR.getStringNE(inf.getCnvItmNoBpCol()));
				String toItmSub1Value = !isNull(ifR.getStringNE(inf.getCnvItmCol()))
						? ifR.getStringNE(inf.getCnvItmSub1Col())
						: ifR.getStringNE(inf.getCnvItmSub1NoBpCol());
				String toItmSub2Value = !isNull(ifR.getStringNE(inf.getCnvItmCol()))
						? ifR.getStringNE(inf.getCnvItmSub2Col())
						: ifR.getStringNE(inf.getCnvItmSub2NoBpCol());
				String toItmSub3Value = !isNull(ifR.getStringNE(inf.getCnvItmCol()))
						? ifR.getStringNE(inf.getCnvItmSub3Col())
						: ifR.getStringNE(inf.getCnvItmSub3NoBpCol());
				
				if (chkErr) {
					toItmValue = null;
					toItmSub1Value = null;
					toItmSub2Value = null;
					toItmSub3Value = null;
				}
				else if (isNull(colConvTyp)
					  || MAC_COL_CONV_TYP.isNON(colConvTyp)
					  || isNull(toItmValue)) {
					toItmValue = ifR.getStringNE(inf.getFrItmCol());
					toItmSub1Value = ifR.getStringNE(inf.getFrItmSub1Col());
					toItmSub2Value = ifR.getStringNE(inf.getFrItmSub2Col());
					toItmSub3Value = ifR.getStringNE(inf.getFrItmSub3Col());
				}
				ifR.setStringNE(inf.getToItmCol(), toItmValue);
				ifR.setStringNE(inf.getToItmSub1Col(), toItmSub1Value);
				ifR.setStringNE(inf.getToItmSub2Col(), toItmSub2Value);
				ifR.setStringNE(inf.getToItmSub3Col(), toItmSub3Value);
			}
			else {
				if(!isNull(ifR.getStringNE(inf.getToCol()))  && inf.isNvl()) {
					return;
				}
				String toValue = nvl(ifR.getStringNE(inf.getCnvCol()),
						ifR.getStringNE(inf.getCnvNoBpCol()));
				if (chkErr) {
					toValue = null;
				}
				else if (isNull(colConvTyp)
					  || MAC_COL_CONV_TYP.isNON(colConvTyp)
					  || isNull(toValue)) {
					toValue = ifR.getStringNE(inf.getFrCol());
				}
				ifR.setStringNE(inf.getToCol(), toValue);
			}
		}


		/**
		 * Rowに対してメタ定義が妥当かを判定します
		 * 
		 * @param ifR
		 * @param cols
		 * @return
		 */
		protected boolean rowValidate(R ifR, String... cols) {
		
			int msgCnt = _msgL.size();
			for (String col :cols) {
				MCMessageList msgL = ifR.validate(col);
				if (!msgL.isEmpty()) {
					_msgL.add(
						new MCMessage(
					 		ifR, null, PFBZL0006,
					 		ifR.getNumber(_$data_no),
					 		ifR.getNumber(_$data_lno),
					 		getLabel(col), col, ifR.getValue(col)));
					_msgL.addAll(msgL);
					
					// エラーの箇所はクリアする
					for (MCMessage msg : msgL) {
						if (msg.getCauseColumn() != null) {
							ifR.setValue(msg.getCauseColumn(), null);
						}
					}
				}
			}
			return msgCnt == _msgL.size();	
		}

		/**
		 * IF送受信テーブルのDBCを初期化します<br>
		 * 
		 * <br>
		 * 初期化で行うこと
		 * 	<li>SELECT文にIF送受信テーブルの全項目を追加します
		 * 	<li>FOR UPDATE対象のテーブルを指定
		 * 	<li>検索条件（PFW_SDRV_IFとJOIN）を追加
		 *  
		 */
		public void initSelect() {
			_builder = MCQueryApiBuilder.create(_dbc);

			PFW_SDRV_IF_R w1 = PFW_SDRV_IF_R.create("W1");
			_builder.setSelectAll();
			_builder.addSelect(w1.if_proc_typ, w1.data_no, w1.ext_sys_cd);
			_builder.addLockTable(_dbc.getColumn$("data_no"));
			_builder.addInnerJoin(w1, w1.data_no.eq((MCNumberPermColumn)_dbc.getColumn$("data_no")));

			// 戻り値用
			_exIfL.addStringColumn(_$if_proc_typ);
		}

		/**
		 * ORDER BY句を追加します
		 * 
		 */
		public void setOrderBy() {
			_builder.setOrderByAsc(_dbc.getColumn$("data_lno"), _dbc.getColumn$("data_no"));
		}

		/**
		 * SELECT文に変換対象の項目を追加します<br>
		 * <br>
		 * 変換対象の項目はMAM_IF_Xで表現されます。
		 * 
		 * @param cnvBpKey : 元データに指定する取引先
		 * @param cnvBpValue : 変換キーに指定する取引先
		 * @param cnvBpCol : 変換キー項目
		 * 
		 * 
		 * ＳＱＬの違いについてまとめ
		 *  ・変換対象項目　　　　：　品目orその他(会社も一部特殊）
		 *  ・変換マスタキー項目　：　取引先を含むor含まない
		 *  ・送受信の差異対応　：　受信時の取引先は、変換後の値をバインドする
		 *                  (setCnvBpList参照）
		 */
		public void addSelectIfCnvColumns(String cnvBpKey, String cnvBpValue, String cnvBpCol) {
			String[] alias = {"CNV", "", "", "", "", ""};
			String ifCol       = _isSend ? "if_col_cd" : "conv_cd";
			String ifColItm    = _isSend ? "if_itm_cd" : "conv_cd";
			String ifColSub1   = _isSend ? "if_itm_sub1" : "conv_itm_sub1";
			String ifColSub2   = _isSend ? "if_itm_sub2" : "conv_itm_sub2";
			String ifColSub3   = _isSend ? "if_itm_sub3" : "conv_itm_sub3";

			String cnvCol      = _isSend ? "conv_cd"       : "if_col_cd";
			String cnvColItm   = _isSend ? "conv_cd"       : "if_itm_cd";
			String cnvColSub1  = _isSend ? "conv_itm_sub1" : "if_itm_sub1";
			String cnvColSub2  = _isSend ? "conv_itm_sub2" : "if_itm_sub2";
			String cnvColSub3  = _isSend ? "conv_itm_sub3" : "if_itm_sub3";
			String frCol = "";
			String frColSub1 = "";
			String frColSub2 = "";
			String frColSub3 = "";
			PFW_SDRV_IF_R w1 = PFW_SDRV_IF_R.create("W1");
			
			for (CnvColumnInf inf : _cnvCols) {
				alias[1] = nvl(inf._frCol, inf._frItmCol) + "_X";	//alias[0] + ++n;
				alias[2] = nvl(inf._frCol, inf._frItmCol) + "_R";	//alias[0] + ++n;
				alias[3] = nvl(inf._frCol, inf._frItmCol) + "_X_NOBP";	//alias[0] + ++n;
				alias[4] = nvl(inf._frCol, inf._frItmCol) + "_X_TMP";	//alias[0] + ++n;
				alias[5] = nvl(inf._frCol, inf._frItmCol) + "_R_BP";	//alias[0] + ++n;

				if (inf._cnvSelectSubQuery == null) {
					frCol = inf._frCol;
					// 変換元項目の追加
					// CO_CDはDBCにないので、個別に設定する
					if (MAC_IF_COL_TYP.isCO(inf._ifColTyp)) {
						frCol = null;  // 文字列でファンクション実行できないため、誤使用されないように初期化しておく。
						_builder.addSelect(FCPA_CONTEXT$F_GET_CO_CD().as(inf._frCol));
					}
					// 品目は枝番も設定する
					else if (MAC_IF_COL_TYP.isITM(inf._ifColTyp)) {
						frCol = inf._frItmCol;
						_builder.addSelect(frCol, _dbc.getColumn$(frCol));

						frColSub1 = inf._frItmSub1Col;
						frColSub2 = inf._frItmSub2Col;
						frColSub3 = inf._frItmSub3Col;
						_builder.addSelect(frColSub1, _dbc.getColumn$(frColSub1));
						_builder.addSelect(frColSub2, _dbc.getColumn$(frColSub2));
						_builder.addSelect(frColSub3, _dbc.getColumn$(frColSub3));
					}
					else {
						_builder.addSelect(inf._frCol, _dbc.getColumn$(frCol));
					}
					
					MAM_IF_X_R alias1 = MAM_IF_X_R.create(alias[1]);
					MAM_IF_X_R alias3 = MAM_IF_X_R.create(alias[3]);
					MAM_IF_X_R alias4 = MAM_IF_X_R.create(alias[4]);

					// 変換結果項目の追加
					if(!MAC_IF_COL_TYP.isITM(inf._ifColTyp)) {
						{//変数スコープ確認用
						MCPredicate subWhere = value(0).eq(value(0));
						
						if (MAC_IF_COL_TYP.isCO(inf._ifColTyp)) {
							MCStringPermColumn col = (MCStringPermColumn)alias1.getColumn$(ifCol);
							subWhere = subWhere.and(col.eq(FCPA_CONTEXT$F_GET_CO_CD()));
						}
						else {
							MCStringPermColumn col1 = (MCStringPermColumn)alias1.getColumn$(ifCol);
							MCStringPermColumn col2 = (MCStringPermColumn)_dbc.getColumn$(frCol);
							subWhere = subWhere.and(col1.eq(col2));
						}
						subWhere = subWhere.and(alias1.if_col_typ.eq(value(inf._ifColTyp.value())));
						
						subWhere = subWhere.and(alias1.ext_sys_cd.eq(w1.ext_sys_cd))
							.and(alias1.if_itm_cd.isNull())
							.and(alias1.if_itm_sub1.isNull())
							.and(alias1.if_itm_sub2.isNull())
							.and(alias1.if_itm_sub3.isNull());
						
						//ＩＦコード変換マスタを結合する際に取引先を結合条件に加えるか否かの判定
						if(!isNull(cnvBpValue)) {
							// ＩＦ項目区分がBPのとき、ＩＦコード変換マスタのbp_cdは一意性を確保のため非必須となるケースがある。
							// このケースでは、bp_cdがブランクでも　= if_col_cd
							// AND NVL(bp_cd, if_col_cd) = 'cnvBpValue'
							if(MAC_IF_COL_TYP.isBP(inf._ifColTyp)) {
								
								if (!_isSend && isSame(inf._cnvCol, "if_cst_cd_cnv")) {
									subWhere = subWhere.and(alias1.bp_cd.isNull()).and(alias1.if_col_cd.eq(bind("cnvBpValue")));
								}
								else {
									subWhere = subWhere.and(alias1.bp_cd.eq(bind("cnvBpValue")));
								}
							}
							else {
								subWhere = subWhere.and(alias1.bp_cd.eq(bind("cnvBpValue")));
							}
						}
						else {	
							subWhere = subWhere.and(alias1.bp_cd.isNull());
						}
						MCSubQuery subQuery = subQuery().select(alias1.getColumn$(cnvCol)).from(alias1).where(subWhere);
						_builder.addSelect(subQuery.as(inf._cnvCol));
						}//変数スコープ確認用

						if(!isNull(cnvBpValue)) {
							MCPredicate subWhere = value(0).eq(value(0));
							if (MAC_IF_COL_TYP.isCO(inf._ifColTyp)) {
								MCStringPermColumn col1 = (MCStringPermColumn)alias3.getColumn$(ifCol);
								subWhere = subWhere.and(col1.eq(FCPA_CONTEXT$F_GET_CO_CD()));
							}
							else {
								MCStringPermColumn col1 = (MCStringPermColumn)alias3.getColumn$(ifCol);
								MCStringPermColumn col2 = (MCStringPermColumn)_dbc.getColumn$(frCol);
								subWhere = subWhere.and(col1.eq(col2));
							}
							
							subWhere = subWhere.and(alias3.if_itm_cd.isNull())
							.and(alias3.if_itm_sub1.isNull())
							.and(alias3.if_itm_sub2.isNull())
							.and(alias3.if_itm_sub3.isNull());
							
							subWhere = subWhere.and(alias3.if_col_typ.eq(value(inf._ifColTyp.value())))
							.and(alias3.ext_sys_cd.eq(w1.ext_sys_cd))
							.and(alias3.bp_cd.isNull());
							
							
							MCSubQuery subQuery2 = subQuery().select(value(1)).from(alias4);
							MCPredicate subWhere2 = value(0).eq(value(0));
							
							if (MAC_IF_COL_TYP.isCO(inf._ifColTyp)) {
								MCStringPermColumn col1 = (MCStringPermColumn)alias4.getColumn$(ifCol);
								subWhere2 = subWhere2.and(col1.eq(FCPA_CONTEXT$F_GET_CO_CD()));
							}
							else {
								MCStringPermColumn col1 = (MCStringPermColumn)alias4.getColumn$(ifCol);
								MCStringPermColumn col2 = (MCStringPermColumn)_dbc.getColumn$(frCol);
								subWhere2 = subWhere2.and(col1.eq(col2));
							}
						
							subWhere2 = subWhere2.and(alias4.bp_cd.eq(bind("cnvBpValue")))
									.and(alias4.if_col_typ.eq(value(inf._ifColTyp.value())))
									.and(alias4.ext_sys_cd.eq(w1.ext_sys_cd));
							
							subWhere = subWhere.and(notExists(subQuery2.where(subWhere2)));
														
							MCSubQuery subQuery = subQuery().select(alias3.getColumn$(cnvCol)).from(alias3).where(subWhere);
							_builder.addSelect(subQuery.as(inf._cnvNoBpCol));
						}
					}
					else {
						_builder.addSelect(inf._cnvItmCol, alias1.getColumn$(cnvColItm))
						.addSelect(inf._cnvItmSub1Col, alias1.getColumn$(cnvColSub1))
						.addSelect(inf._cnvItmSub2Col, alias1.getColumn$(cnvColSub2))
						.addSelect(inf._cnvItmSub3Col, alias1.getColumn$(cnvColSub3));

						if(!isNull(cnvBpValue)) {
							_builder.addSelect(inf._cnvItmNoBpCol, alias3.getColumn$(cnvColItm))
							.addSelect(inf._cnvItmSub1NoBpCol, alias3.getColumn$(cnvColSub1))
							.addSelect(inf._cnvItmSub2NoBpCol, alias3.getColumn$(cnvColSub2))
							.addSelect(inf._cnvItmSub3NoBpCol, alias3.getColumn$(cnvColSub3));
						}
					}

					// ＩＦ項目区分が品目の場合に追加
					if(MAC_IF_COL_TYP.isITM(inf._ifColTyp)) {
						
						//ＩＦコード変換マスタの結合条件
						MCPredicate join = 
							nvl((MCStringPermColumn)alias1.getColumn$(ifColItm), value(MAC_STR.NULL_VAL.value())).eq(nvl((MCStringPermColumn)_dbc.getColumn$(frCol), value(MAC_STR.NULL_VAL.value())))
							.and(nvl((MCStringPermColumn)alias1.getColumn$(ifColSub1), value(MAC_STR.NULL_VAL.value())).eq(nvl((MCStringPermColumn)_dbc.getColumn$(frColSub1), value(MAC_STR.NULL_VAL.value()))))
							.and(nvl((MCStringPermColumn)alias1.getColumn$(ifColSub2), value(MAC_STR.NULL_VAL.value())).eq(nvl((MCStringPermColumn)_dbc.getColumn$(frColSub2), value(MAC_STR.NULL_VAL.value()))))
							.and(nvl((MCStringPermColumn)alias1.getColumn$(ifColSub3), value(MAC_STR.NULL_VAL.value())).eq(nvl((MCStringPermColumn)_dbc.getColumn$(frColSub3), value(MAC_STR.NULL_VAL.value()))))
							.and(alias1.if_col_typ.eq(value(inf._ifColTyp.value())))
							.and(alias1.ext_sys_cd.eq(w1.ext_sys_cd));
						
						//ＩＦコード変換マスタを結合する際に取引先を結合条件に加えるか否かの判定
						if(!isNull(cnvBpValue)) {
							// ＩＦ項目区分がBPのとき、ＩＦコード変換マスタのbp_cdは一意性を確保のため非必須となるケースがある。
							// このケースでは、bp_cdがブランクでも　= if_col_cd
							// AND NVL(bp_cd, if_col_cd) = 'cnvBpValue'
							if(MAC_IF_COL_TYP.isBP(inf._ifColTyp)) {
								join = join.and(nvl(alias1.bp_cd, alias1.if_col_cd).eq(bind("cnvBpValue")));
							}
							else {
								join = join.and(alias1.bp_cd.eq(bind("cnvBpValue")));
							}
						}
						else {
							join = join.and(alias1.bp_cd.isNull());
						}
						_builder.addLeftOuterJoin(alias1, join);
					}
					
					// 取引先指定の場合は、取引先未指定のマスタも対象とする
					if (!isNull(cnvBpValue)) {
						
						// ＩＦ項目区分が品目の場合に追加
						if(MAC_IF_COL_TYP.isITM(inf._ifColTyp)) {
							MCPredicate join = 
								nvl((MCStringPermColumn)alias3.getColumn$(ifColItm), value(MAC_STR.NULL_VAL.value())).eq(nvl((MCStringPermColumn)_dbc.getColumn$(frCol), value(MAC_STR.NULL_VAL.value())))
								.and(nvl((MCStringPermColumn)alias3.getColumn$(ifColSub1), value(MAC_STR.NULL_VAL.value())).eq(nvl((MCStringPermColumn)_dbc.getColumn$(frColSub1), value(MAC_STR.NULL_VAL.value()))))
								.and(nvl((MCStringPermColumn)alias3.getColumn$(ifColSub2), value(MAC_STR.NULL_VAL.value())).eq(nvl((MCStringPermColumn)_dbc.getColumn$(frColSub2), value(MAC_STR.NULL_VAL.value()))))
								.and(nvl((MCStringPermColumn)alias3.getColumn$(ifColSub3), value(MAC_STR.NULL_VAL.value())).eq(nvl((MCStringPermColumn)_dbc.getColumn$(frColSub3), value(MAC_STR.NULL_VAL.value()))))
								.and(alias3.if_col_typ.eq(value(inf._ifColTyp.value())))
								.and(alias3.ext_sys_cd.eq(w1.ext_sys_cd))
								.and(alias3.bp_cd.isNull());
							
							MCPredicate subWhere2 = value(0).eq(value(0));
							subWhere2 = subWhere2.and(nvl((MCStringPermColumn)alias4.getColumn$(ifColItm), value(MAC_STR.NULL_VAL.value())).eq(nvl((MCStringPermColumn)_dbc.getColumn$(frCol), value(MAC_STR.NULL_VAL.value()))))
							.and(nvl((MCStringPermColumn)alias4.getColumn$(ifColSub1), value(MAC_STR.NULL_VAL.value())).eq(nvl((MCStringPermColumn)_dbc.getColumn$(frColSub1), value(MAC_STR.NULL_VAL.value()))))
							.and(nvl((MCStringPermColumn)alias4.getColumn$(ifColSub2), value(MAC_STR.NULL_VAL.value())).eq(nvl((MCStringPermColumn)_dbc.getColumn$(frColSub2), value(MAC_STR.NULL_VAL.value()))))
							.and(nvl((MCStringPermColumn)alias4.getColumn$(ifColSub3), value(MAC_STR.NULL_VAL.value())).eq(nvl((MCStringPermColumn)_dbc.getColumn$(frColSub3), value(MAC_STR.NULL_VAL.value()))));
							
							subWhere2 = subWhere2.and(alias4.bp_cd.eq(bind("cnvBpValue")))
									.and(alias4.if_col_typ.eq(value(inf._ifColTyp.value())))
									.and(alias4.ext_sys_cd.eq(w1.ext_sys_cd));
							
							join = join.and(notExists(subQuery().select(value(1)).from(alias4).where(subWhere2)));

							_builder.addLeftOuterJoin(alias3, join);
						}
					}
				}
				else {
					_builder.addSelect(inf._cnvSelectSubQuery.as(inf._cnvCol));
				}
				
				MAM_IF_CD_RULE_R r1 = MAM_IF_CD_RULE_R.create("R1");
				MAM_IF_CD_RULE_R r2 = MAM_IF_CD_RULE_R.create("R2");
				MCSubQuery subQuery = subQuery().select(r1.col_conv_typ).from(r1);
				MCPredicate subWhere = value(0).eq(value(0));
				subWhere = subWhere.and(r1.if_col_typ.eq(value(inf._ifColTyp.value())))
					.and(r1.ext_sys_cd.eq(w1.ext_sys_cd))
					.and(r1.bp_cd.eq(cases().when(
							exists(
							subQuery().select(value(1)).from(r2)
								.where(
									value(0).eq(value(0))
									.and(r2.if_col_typ.eq(value(inf._ifColTyp.value()))
									.and(r2.ext_sys_cd.eq(w1.ext_sys_cd)))
									.and(r2.bp_cd.eq(bind("cnvBpValue")))
									)
							))
							.then(bind("cnvBpValue"))
							.otherwise(value(MAC_STR.NULL_VAL.value()))
							));
				_builder.addSelect(subQuery.where(subWhere).as(inf._colConvTyp));

			}
			if (!isNull(cnvBpKey)) {
				_builder.addWhereWithAnd(((MCStringPermColumn)_dbc.getColumn$(cnvBpCol)).eq(bind("1")), cnvBpKey);
			}
		}

		public void addWhereIfWrite() {
			// ４：スキップ以外対象
			_builder.addWhereWithAnd(((MCStringPermColumn)_dbc.getColumn$("exe_sts_typ")).neq(value(MAC_EXE_STS_TYP.SKP.value())));
		}

		/**
		 * 送信・受信制御テーブルの項目をSQL文に追加します
		 */
		public void addSelectIfCtrlColumns() {
			PFT_SDRV_IF_R t2 = PFT_SDRV_IF_R.create("T2");
			PFW_SDRV_IF_R w1 = PFW_SDRV_IF_R.create("W1");
			
			_builder.addSelect(t2.batch_log_no, t2.log_sub_key1, t2.log_sub_key2);
			_builder.addInnerJoin(t2, t2.if_proc_typ.eq(w1.if_proc_typ).and(t2.ext_sys_cd.eq(w1.ext_sys_cd).and(t2.data_no.eq(w1.data_no))));
		}

		public void addWhereIfConv() {
			// ４：スキップ以外対象
			_builder.addWhereWithAnd(((MCStringPermColumn)_dbc.getColumn$("exe_sts_typ")).neq(value(MAC_EXE_STS_TYP.SKP.value())));
		}
		
		/**
		 * UPDATEのSQLに変換対象の項目を追加します
		 * 
		 */
		public void addSetIfColumns() {
			_builder.setSet(_dbc.getColumn$(_$data_no));
			String[] cols = getToCols();
			for (String col : cols) {
				_builder.addSet(_dbc.getColumn$(col));
			}
			_builder.addSet(_dbc.getColumn$(_$exe_sts_typ));

			if (!_isSend) {
				_builder.addSet(_dbc.getColumn$(_$imp_flg));
			}
		}

		/**
		 * 処理対象のＩＦ処理区分と外部システムＣＤを取得します。
		 */
		public MCList<PFW_SDRV_IF_R> getPfwSdrvIfL() {
			PFW_SDRV_IF_R wk = PFW_SDRV_IF_R.create("WK");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(wk);
			builder.setSelectAll();
			builder.setOrderByAsc(wk.data_no);
			MCList<PFW_SDRV_IF_R> l = MCList.create(PFW_SDRV_IF_R.class);
			dbSelect(createSqlId(LOGIC_ID, wk, "S05"), l, builder);
			return l;
		}

		/**
		 * ＩＦテーブルに存在する変換キーとして指定された取引先のリストを取得します<br>
		 * 
		 * @param cnvBpCol　変換キー項目
		 * @param ifProcTyp ＩＦ処理区分
		 * @param extSysCd 外部システムＣＤ
		 * 
		 */
		public void setCnvBpList(String cnvBpCol, String extSysCd) {
			PFW_SDRV_IF_R pfw = PFW_SDRV_IF_R.create("PFW");
			_builder = MCQueryApiBuilder.create(_dbc);
			_builder.setDistinct().setSelect(_dbc.getColumn$(cnvBpCol));
			addWhereIfConv();
			_builder.addWhereWithAnd(((MCStringPermColumn)_dbc.getColumn$(cnvBpCol)).isNotNull());
			_builder.addInnerJoin(pfw, pfw.data_no.eq((MCNumberPermColumn)_dbc.getColumn$("data_no")));
			dbSelect(createSqlId(LOGIC_ID, _dbc, "S04"), _ifL, _builder);

			_cnvBpList = _ifL.getStringNE(cnvBpCol);

			// 受信の場合は、コード変換マスタにより変換キーを自社の値に変換する
			if(!_isSend) {
				MCList<MAM_IF_X_R> xL = MCList.create(MAM_IF_X_R.class);
				MAM_IF_X_R x = MAM_IF_X_R.create("T");
				MAW_IF_X_KEY_R w1 = MAW_IF_X_KEY_R.create("W1");
				MCQueryApiBuilder builder_ = MCQueryApiBuilder.create(x);
				builder_.setSelect(x.conv_cd, x.if_col_cd);
				builder_.addInnerJoin(w1, w1.if_col_cd.eq(x.conv_cd));
				builder_.addWhereWithAnd(x.bp_cd.isNull());
				builder_.addWhereWithAnd(x.if_col_typ.eq(value(MAC_IF_COL_TYP.BP.value())));
				builder_.addWhereWithAnd(x.ext_sys_cd.eq(bind("1")), extSysCd);
				
				MCList<MAM_IF_X_R> ifXWkL = MCList.create(MAM_IF_X_R.class);
				// conv_cdとif_col_cdのメタの桁数は同じである。if_col_cdで代用して問題ない。
				_cnvBpList.forEach(s -> ifXWkL.add().if_col_cd(s));
				
				MCQueryApiBuilder ifXWkL_bldr = MCQueryApiBuilder.create(MAM_IF_X_R.create("T"));
				dbWkDelete(createSqlId(LOGIC_ID, w1, "D01"), ifXWkL_bldr.getBaseDbc());
				dbWkInsert(createSqlId(LOGIC_ID, w1, "I01"), ifXWkL, ifXWkL_bldr.getBaseDbc());
				
				dbSelect(createSqlId(LOGIC_ID, x, "S01"), xL, builder_);
				
				dbWkDelete(createSqlId(LOGIC_ID, w1, "D02"), ifXWkL_bldr.getBaseDbc());
				
				MCIndexKey xLIndexKey = xL.createIndex(MAM_IF_X_R.$conv_cd);
				for (String bfBpCd : _cnvBpList) {
					MAM_IF_X_R xR = xL.getFirst(xLIndexKey, bfBpCd);
					if (isNull(xR)) {
						_cnvBpMap.put(bfBpCd, bfBpCd);
					}
					else {
						_cnvBpMap.put(bfBpCd, xR.if_col_cd());
					}
				}
			}
			else {
				for (String bfBpCd : _cnvBpList) {
					_cnvBpMap.put(bfBpCd, bfBpCd);
				}
			}
		}
		
		/**
		 * 項目変換時のメッセージをメッセージプールに追加するかのフラグを設定します
		 * 
		 * @param boo
		 */
		public void setAddMsgPool(boolean boo) {
			_isAddMsgPool = boo;
		}
		
		/**
		 * 項目変換時のメッセージをメッセージプールに追加するかのフラグを取得します
		 * 
		 * @return
		 */
		public boolean getAddMsgPool() {
			return _isAddMsgPool;
		}
		
		/**
		 * 項目変換できなかったデータを格納するDBCを取得します
		 * 
		 * @return
		 */
		public MCList<R> getExIfL() {
			return _exIfL;
		}
		
		public MCList<R> getIgnoredConvIfL() {
			return _ignoreConvIfL;
		}
		
		/**
		 * 項目変換時のメッセージを取得します
		 * 
		 * @return
		 */
		public MCMessageList getMsgL() {
			return _msgL;
		}
		
		/**
		 * 帳票項目のラベル名を取得します
		 * 
		 * @param colPath
		 * @return
		 */
		protected String getLabel(String nm) {
			String[] arr = _classL.getName().split("\\.");	// [mcframe][serverC][db][CVT_ACCPT_SEND_IF_L]
			String tbl = arr[arr.length - 1];				// CVT_ACCPT_SEND_IF_L
			tbl = tbl.substring(0, tbl.length() - 2);		// CVT_ACCPT_SEND_IF

			return getDbLabel(tbl, nm);
		}
	}
	//FMCB CUSTOM END
}