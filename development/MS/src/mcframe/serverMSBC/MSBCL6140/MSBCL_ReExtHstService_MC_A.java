package mcframe.serverMSBC.MSBCL6140;

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
 * "MSBCL_ReExtHstService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_ReExtHstService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBCL6140";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_ReExtHstService.ReExtHst_Chk01 aReExtHst_Chk01;

	protected void initReExtHst_Chk01() {
		this.info = PDef.MS_MSBCL6140_ReExtHst_Chk01_INFO;
		this.aReExtHst_Chk01 = ((MSBCL_ReExtHstService)this).new ReExtHst_Chk01();
	}

	public static MSBCL_ReExtHstService.ReExtHst_Chk01 crtReExtHst_Chk01() {
		MSBCL_ReExtHstService lgc = new MSBCL_ReExtHstService();
		lgc.initReExtHst_Chk01();
		return lgc.aReExtHst_Chk01;
	}

	protected void paramReExtHst_Chk01(MCParam p) {
		if (this.aReExtHst_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aReExtHst_Chk01.up0());
		p.addDownBlock(aReExtHst_Chk01.down0());
	}

	protected void doReExtHst_Chk01() {
		aReExtHst_Chk01.call();
	};

	/**
	 * ReExtHst_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6140.ReExtHst_Chk01_DtlR createReExtHst_Chk01_DtlR(){
		return mcframe.serverMSBC.MSBCL6140.ReExtHst_Chk01_DtlR.create();
	}

	/**
	 * ReExtHst_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6140.ReExtHst_Chk01_DtlR> createReExtHst_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6140.ReExtHst_Chk01_DtlR.class);
	}
	protected MSBCL_ReExtHstService.ReExtHst_Ins01 aReExtHst_Ins01;

	protected void initReExtHst_Ins01() {
		this.info = PDef.MS_MSBCL6140_ReExtHst_Ins01_INFO;
		this.aReExtHst_Ins01 = ((MSBCL_ReExtHstService)this).new ReExtHst_Ins01();
	}

	public static MSBCL_ReExtHstService.ReExtHst_Ins01 crtReExtHst_Ins01() {
		MSBCL_ReExtHstService lgc = new MSBCL_ReExtHstService();
		lgc.initReExtHst_Ins01();
		return lgc.aReExtHst_Ins01;
	}

	protected void paramReExtHst_Ins01(MCParam p) {
		if (this.aReExtHst_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aReExtHst_Ins01.up0());
	}

	protected void doReExtHst_Ins01() {
		aReExtHst_Ins01.call();
	};

	/**
	 * ReExtHst_Ins01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6140.ReExtHst_Ins01_DtlR createReExtHst_Ins01_DtlR(){
		return mcframe.serverMSBC.MSBCL6140.ReExtHst_Ins01_DtlR.create();
	}

	/**
	 * ReExtHst_Ins01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6140.ReExtHst_Ins01_DtlR> createReExtHst_Ins01_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6140.ReExtHst_Ins01_DtlR.class);
	}
	protected MSBCL_ReExtHstService.ReExtHst_Upd01 aReExtHst_Upd01;

	protected void initReExtHst_Upd01() {
		this.info = PDef.MS_MSBCL6140_ReExtHst_Upd01_INFO;
		this.aReExtHst_Upd01 = ((MSBCL_ReExtHstService)this).new ReExtHst_Upd01();
	}

	public static MSBCL_ReExtHstService.ReExtHst_Upd01 crtReExtHst_Upd01() {
		MSBCL_ReExtHstService lgc = new MSBCL_ReExtHstService();
		lgc.initReExtHst_Upd01();
		return lgc.aReExtHst_Upd01;
	}

	protected void paramReExtHst_Upd01(MCParam p) {
		if (this.aReExtHst_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aReExtHst_Upd01.up0());
	}

	protected void doReExtHst_Upd01() {
		aReExtHst_Upd01.call();
	};

	/**
	 * ReExtHst_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6140.ReExtHst_Upd01_DtlR createReExtHst_Upd01_DtlR(){
		return mcframe.serverMSBC.MSBCL6140.ReExtHst_Upd01_DtlR.create();
	}

	/**
	 * ReExtHst_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6140.ReExtHst_Upd01_DtlR> createReExtHst_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6140.ReExtHst_Upd01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ReExtHst_Chk01オペレーション.<p>
	 *
	 * Upd01更新オペレーションの実行前チェックを行う<br>
	 */
	abstract public class ReExtHst_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ReExtHst_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6140.ReExtHst_Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6140.ReExtHst_Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected ReExtHst_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6140.ReExtHst_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6140.ReExtHst_Chk01_DtlR.class);

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
			invoke((MSBCL_ReExtHstService)MSBCL_ReExtHstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ReExtHst_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6140.ReExtHst_Chk01_DtlR createReExtHst_Chk01_DtlR(){
			return mcframe.serverMSBC.MSBCL6140.ReExtHst_Chk01_DtlR.create();
		}

		/**
		 * ReExtHst_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6140.ReExtHst_Chk01_DtlR> createReExtHst_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6140.ReExtHst_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ref_ord</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6140.ReExtHst_Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6140.ReExtHst_Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_ReExtHstService)MSBCL_ReExtHstService_MC_A.this).info;
		}


	}
	/**
	 * ReExtHst_Ins01オペレーション.<p>
	 *
	 * 製造再展開履歴を新規登録する<br>
	 */
	abstract public class ReExtHst_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ReExtHst_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6140.ReExtHst_Ins01_DtlR> up0;
		
		
		// コンストラクタ
		protected ReExtHst_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6140.ReExtHst_Ins01_DtlR.class);

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
			invoke((MSBCL_ReExtHstService)MSBCL_ReExtHstService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ReExtHst_Ins01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6140.ReExtHst_Ins01_DtlR createReExtHst_Ins01_DtlR(){
			return mcframe.serverMSBC.MSBCL6140.ReExtHst_Ins01_DtlR.create();
		}

		/**
		 * ReExtHst_Ins01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6140.ReExtHst_Ins01_DtlR> createReExtHst_Ins01_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6140.ReExtHst_Ins01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>chng_no</td></tr>
		 * 	<tr><td><br></td><td>re_ext_typ</td></tr>
		 * 	<tr><td><br></td><td>ref_ord</td></tr>
		 * 	<tr><td><br></td><td>oper_chng_flg</td></tr>
		 * 	<tr><td><br></td><td>plm_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6140.ReExtHst_Ins01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_ReExtHstService)MSBCL_ReExtHstService_MC_A.this).info;
		}


	}
	/**
	 * ReExtHst_Upd01オペレーション.<p>
	 *
	 * 製造指図再展開履歴を更新する<br>
	 */
	abstract public class ReExtHst_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ReExtHst_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6140.ReExtHst_Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected ReExtHst_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6140.ReExtHst_Upd01_DtlR.class);

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
			invoke((MSBCL_ReExtHstService)MSBCL_ReExtHstService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ReExtHst_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6140.ReExtHst_Upd01_DtlR createReExtHst_Upd01_DtlR(){
			return mcframe.serverMSBC.MSBCL6140.ReExtHst_Upd01_DtlR.create();
		}

		/**
		 * ReExtHst_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6140.ReExtHst_Upd01_DtlR> createReExtHst_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6140.ReExtHst_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ref_ord</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>re_ext_typ</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6140.ReExtHst_Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_ReExtHstService)MSBCL_ReExtHstService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}