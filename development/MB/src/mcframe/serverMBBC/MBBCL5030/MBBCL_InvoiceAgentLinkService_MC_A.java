package mcframe.serverMBBC.MBBCL5030;

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
 * "MBBCL_InvoiceAgentLinkService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBCL_InvoiceAgentLinkService_MC_A extends mcframe.serverMBUD.MBUDL5010.MBUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MB";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MBBC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MBBCL5030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MBBCL_InvoiceAgentLinkService.IALink_Srch01 aIALink_Srch01;

	protected void initIALink_Srch01() {
		this.info = PDef.MB_MBBCL5030_IALink_Srch01_INFO;
		this.aIALink_Srch01 = ((MBBCL_InvoiceAgentLinkService)this).new IALink_Srch01();
	}

	public static MBBCL_InvoiceAgentLinkService.IALink_Srch01 crtIALink_Srch01() {
		MBBCL_InvoiceAgentLinkService lgc = new MBBCL_InvoiceAgentLinkService();
		lgc.initIALink_Srch01();
		return lgc.aIALink_Srch01;
	}

	protected void paramIALink_Srch01(MCParam p) {
		if (this.aIALink_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIALink_Srch01.up0());
		p.addDownBlock(aIALink_Srch01.down0());
	}

	protected void doIALink_Srch01() {
		aIALink_Srch01.call();
	};

	/**
	 * IALink_Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBC.MBBCL5030.IALink_Srch01_CndR createIALink_Srch01_CndR(){
		return mcframe.serverMBBC.MBBCL5030.IALink_Srch01_CndR.create();
	}

	/**
	 * IALink_Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBC.MBBCL5030.IALink_Srch01_RsltR createIALink_Srch01_RsltR(){
		return mcframe.serverMBBC.MBBCL5030.IALink_Srch01_RsltR.create();
	}

	/**
	 * IALink_Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBC.MBBCL5030.IALink_Srch01_RsltR> createIALink_Srch01_RsltL(){
		return MCList.create(mcframe.serverMBBC.MBBCL5030.IALink_Srch01_RsltR.class);
	}
	protected MBBCL_InvoiceAgentLinkService.IALink_Copy01 aIALink_Copy01;

	protected void initIALink_Copy01() {
		this.info = PDef.MB_MBBCL5030_IALink_Copy01_INFO;
		this.aIALink_Copy01 = ((MBBCL_InvoiceAgentLinkService)this).new IALink_Copy01();
	}

	public static MBBCL_InvoiceAgentLinkService.IALink_Copy01 crtIALink_Copy01() {
		MBBCL_InvoiceAgentLinkService lgc = new MBBCL_InvoiceAgentLinkService();
		lgc.initIALink_Copy01();
		return lgc.aIALink_Copy01;
	}

	protected void paramIALink_Copy01(MCParam p) {
		if (this.aIALink_Copy01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIALink_Copy01.up0());
		p.addDownBlock(aIALink_Copy01.down0());
	}

	protected void doIALink_Copy01() {
		aIALink_Copy01.call();
	};

	/**
	 * IALink_Copy01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBC.MBBCL5030.IALink_Copy01_DtlR createIALink_Copy01_DtlR(){
		return mcframe.serverMBBC.MBBCL5030.IALink_Copy01_DtlR.create();
	}

	/**
	 * IALink_Copy01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBC.MBBCL5030.IALink_Copy01_DtlR> createIALink_Copy01_DtlL(){
		return MCList.create(mcframe.serverMBBC.MBBCL5030.IALink_Copy01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * IALink_Srch01オペレーション.<p>
	 *
	 * invoiceAgentのフォルダやファイルを検索します。<br>
	 */
	abstract public class IALink_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "IALink_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBC.MBBCL5030.IALink_Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBC.MBBCL5030.IALink_Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected IALink_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBC.MBBCL5030.IALink_Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMBBC.MBBCL5030.IALink_Srch01_RsltR.class);

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
			invoke((MBBCL_InvoiceAgentLinkService)MBBCL_InvoiceAgentLinkService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * IALink_Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBC.MBBCL5030.IALink_Srch01_CndR createIALink_Srch01_CndR(){
			return mcframe.serverMBBC.MBBCL5030.IALink_Srch01_CndR.create();
		}

		/**
		 * IALink_Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBC.MBBCL5030.IALink_Srch01_RsltR createIALink_Srch01_RsltR(){
			return mcframe.serverMBBC.MBBCL5030.IALink_Srch01_RsltR.create();
		}

		/**
		 * IALink_Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBC.MBBCL5030.IALink_Srch01_RsltR> createIALink_Srch01_RsltL(){
			return MCList.create(mcframe.serverMBBC.MBBCL5030.IALink_Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>dir</td></tr>
		 * 	<tr><td><br></td><td>inc_file_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBC.MBBCL5030.IALink_Srch01_CndR
		 */
		public mcframe.serverMBBC.MBBCL5030.IALink_Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>id</td></tr>
		 * 	<tr><td><br></td><td>name</td></tr>
		 * 	<tr><td><br></td><td>type</td></tr>
		 * 	<tr><td><br></td><td>updatedate</td></tr>
		 * 	<tr><td><br></td><td>filesize</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBC.MBBCL5030.IALink_Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBCL_InvoiceAgentLinkService)MBBCL_InvoiceAgentLinkService_MC_A.this).info;
		}


	}
	/**
	 * IALink_Copy01オペレーション.<p>
	 *
	 * invoiceAgentにアーカイブします。<br>
	 */
	abstract public class IALink_Copy01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "IALink_Copy01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBC.MBBCL5030.IALink_Copy01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBC.MBBCL5030.IALink_Copy01_DtlR> down0;
		
		
		// コンストラクタ
		protected IALink_Copy01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBC.MBBCL5030.IALink_Copy01_DtlR.class);
			down0 = MCList.create(mcframe.serverMBBC.MBBCL5030.IALink_Copy01_DtlR.class);

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
			invoke((MBBCL_InvoiceAgentLinkService)MBBCL_InvoiceAgentLinkService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * IALink_Copy01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBC.MBBCL5030.IALink_Copy01_DtlR createIALink_Copy01_DtlR(){
			return mcframe.serverMBBC.MBBCL5030.IALink_Copy01_DtlR.create();
		}

		/**
		 * IALink_Copy01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBC.MBBCL5030.IALink_Copy01_DtlR> createIALink_Copy01_DtlL(){
			return MCList.create(mcframe.serverMBBC.MBBCL5030.IALink_Copy01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>src_file</td></tr>
		 * 	<tr><td><br></td><td>file_path</td></tr>
		 * 	<tr><td><br></td><td>file_name</td></tr>
		 * 	<tr><td><br></td><td>overwrite_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBC.MBBCL5030.IALink_Copy01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>file_name</td></tr>
		 * 	<tr><td><br></td><td>id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBC.MBBCL5030.IALink_Copy01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBCL_InvoiceAgentLinkService)MBBCL_InvoiceAgentLinkService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}