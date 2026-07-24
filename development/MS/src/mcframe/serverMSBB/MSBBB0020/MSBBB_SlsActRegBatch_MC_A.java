package mcframe.serverMSBB.MSBBB0020;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSBBB_SlsActRegBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBB_SlsActRegBatch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBBB0020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBBB_SlsActRegBatch.SlsActReg_Ins01 aSlsActReg_Ins01;

	protected void initSlsActReg_Ins01() {
		this.info = PDef.MS_MSBBB0020_SlsActReg_Ins01_INFO;
		this.aSlsActReg_Ins01 = ((MSBBB_SlsActRegBatch)this).new SlsActReg_Ins01();
	}

	public static MSBBB_SlsActRegBatch.SlsActReg_Ins01 crtSlsActReg_Ins01() {
		MSBBB_SlsActRegBatch lgc = new MSBBB_SlsActRegBatch();
		lgc.initSlsActReg_Ins01();
		return lgc.aSlsActReg_Ins01;
	}

	protected void paramSlsActReg_Ins01(MCParam p) {
		if (this.aSlsActReg_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsActReg_Ins01.up0());
	}

	protected void doSlsActReg_Ins01() {
		aSlsActReg_Ins01.call();
	};

	/**
	 * SlsActReg_Ins01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins01_CndR createSlsActReg_Ins01_CndR(){
		return mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins01_CndR.create();
	}
	protected MSBBB_SlsActRegBatch.SlsActReg_Ins02 aSlsActReg_Ins02;

	protected void initSlsActReg_Ins02() {
		this.info = PDef.MS_MSBBB0020_SlsActReg_Ins02_INFO;
		this.aSlsActReg_Ins02 = ((MSBBB_SlsActRegBatch)this).new SlsActReg_Ins02();
	}

	public static MSBBB_SlsActRegBatch.SlsActReg_Ins02 crtSlsActReg_Ins02() {
		MSBBB_SlsActRegBatch lgc = new MSBBB_SlsActRegBatch();
		lgc.initSlsActReg_Ins02();
		return lgc.aSlsActReg_Ins02;
	}

	protected void paramSlsActReg_Ins02(MCParam p) {
		if (this.aSlsActReg_Ins02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsActReg_Ins02.up0());
		p.addDownBlock(aSlsActReg_Ins02.down0());
	}

	protected void doSlsActReg_Ins02() {
		aSlsActReg_Ins02.call();
	};

	/**
	 * SlsActReg_Ins02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins01_CndR createSlsActReg_Ins02_CndR(){
		return mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins01_CndR.create();
	}

	/**
	 * SlsActReg_Ins02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_RsltR createSlsActReg_Ins02_RsltR(){
		return mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_RsltR.create();
	}

	/**
	 * SlsActReg_Ins02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_DtlR createSlsActReg_Ins02_DtlR(){
		return mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_DtlR.create();
	}

	/**
	 * SlsActReg_Ins02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_DtlR> createSlsActReg_Ins02_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_DtlR.class);
	}

	/**
	 * SlsActReg_Ins02_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_IoR createSlsActReg_Ins02_IoR(){
		return mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_IoR.create();
	}

	/**
	 * SlsActReg_Ins02_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_IoR> createSlsActReg_Ins02_IoL(){
		return MCList.create(mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_IoR.class);
	}

	/**
	 * SlsActReg_Ins02_Calc01HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_Calc01HdrR createSlsActReg_Ins02_Calc01HdrR(){
		return mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_Calc01HdrR.create();
	}

	/**
	 * SlsActReg_Ins02_Calc01HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_Calc01HdrR> createSlsActReg_Ins02_Calc01HdrL(){
		return MCList.create(mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_Calc01HdrR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * SlsActReg_Ins01オペレーション.<p>
	 *
	 * 売上実績を一括登録する。<br>
	 */
	abstract public class SlsActReg_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsActReg_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins01_CndR up0;
		
		
		// コンストラクタ
		protected SlsActReg_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins01_CndR.create();

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBB_SlsActRegBatch)MSBBB_SlsActRegBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SlsActReg_Ins01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins01_CndR createSlsActReg_Ins01_CndR(){
			return mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt_not_ac_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_in_basis_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_partial_sls_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_purc_ddlv_flg</td></tr>
		 * 	<tr><td><br></td><td>non_prnt_dlv_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins01_CndR
		 */
		public mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBB_SlsActRegBatch)MSBBB_SlsActRegBatch_MC_A.this).info;
		}


	}
	/**
	 * SlsActReg_Ins02オペレーション.<p>
	 *
	 * マルチスレッドで売上実績を一括登録する。<br>
	 */
	abstract public class SlsActReg_Ins02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsActReg_Ins02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_RsltR down0;
		/** [SlsActReg_Ins02_Calc01Hdr]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_Calc01HdrR> aSlsActReg_Ins02_Calc01Hdr;
		/** [SlsActReg_Ins02_Dtl]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_DtlR> aSlsActReg_Ins02_Dtl;
		/** [SlsActReg_Ins02_Io]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_IoR> aSlsActReg_Ins02_Io;
		
		
		// コンストラクタ
		protected SlsActReg_Ins02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins01_CndR.create();
			down0 = mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_RsltR.create();
			aSlsActReg_Ins02_Calc01Hdr = MCList.create(mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_Calc01HdrR.class);
			aSlsActReg_Ins02_Dtl = MCList.create(mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_DtlR.class);
			aSlsActReg_Ins02_Io = MCList.create(mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_IoR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBB_SlsActRegBatch)MSBBB_SlsActRegBatch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SlsActReg_Ins02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins01_CndR createSlsActReg_Ins02_CndR(){
			return mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins01_CndR.create();
		}

		/**
		 * SlsActReg_Ins02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_RsltR createSlsActReg_Ins02_RsltR(){
			return mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_RsltR.create();
		}

		/**
		 * SlsActReg_Ins02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_DtlR createSlsActReg_Ins02_DtlR(){
			return mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_DtlR.create();
		}

		/**
		 * SlsActReg_Ins02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_DtlR> createSlsActReg_Ins02_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_DtlR.class);
		}

		/**
		 * SlsActReg_Ins02_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_IoR createSlsActReg_Ins02_IoR(){
			return mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_IoR.create();
		}

		/**
		 * SlsActReg_Ins02_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_IoR> createSlsActReg_Ins02_IoL(){
			return MCList.create(mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_IoR.class);
		}

		/**
		 * SlsActReg_Ins02_Calc01HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_Calc01HdrR createSlsActReg_Ins02_Calc01HdrR(){
			return mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_Calc01HdrR.create();
		}

		/**
		 * SlsActReg_Ins02_Calc01HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_Calc01HdrR> createSlsActReg_Ins02_Calc01HdrL(){
			return MCList.create(mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_Calc01HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt_not_ac_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_in_basis_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_partial_sls_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_purc_ddlv_flg</td></tr>
		 * 	<tr><td><br></td><td>non_prnt_dlv_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins01_CndR
		 */
		public mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>total_num</td></tr>
		 * 	<tr><td><br></td><td>ok_num</td></tr>
		 * 	<tr><td><br></td><td>err_num</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_RsltR
		 */
		public mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_RsltR down0() {
			return down0;
		}


		/**
		 * [SlsActReg_Ins02_Calc01Hdr]ブロックのコンテナaSlsActReg_Ins02_Calc01HdrLを返します。
		 *
		 * @return SlsActReg_Ins02_Calc01HdrL
		 */
		public MCList<mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_Calc01HdrR> SlsActReg_Ins02_Calc01Hdr() {
			return aSlsActReg_Ins02_Calc01Hdr;
		}

		/**
		 * [SlsActReg_Ins02_Dtl]ブロックのコンテナaSlsActReg_Ins02_DtlLを返します。
		 *
		 * @return SlsActReg_Ins02_DtlL
		 */
		public MCList<mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_DtlR> SlsActReg_Ins02_Dtl() {
			return aSlsActReg_Ins02_Dtl;
		}

		/**
		 * [SlsActReg_Ins02_Io]ブロックのコンテナaSlsActReg_Ins02_IoLを返します。
		 *
		 * @return SlsActReg_Ins02_IoL
		 */
		public MCList<mcframe.serverMSBB.MSBBB0020.SlsActReg_Ins02_IoR> SlsActReg_Ins02_Io() {
			return aSlsActReg_Ins02_Io;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBB_SlsActRegBatch)MSBBB_SlsActRegBatch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}