package mcframe.serverMSBH.MSBHL5080;

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
 * "MSBHL_ApSetoffService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHL_ApSetoffService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBH";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBHL5080";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBHL_ApSetoffService.ApSetoff_Srch01 aApSetoff_Srch01;

	protected void initApSetoff_Srch01() {
		this.info = PDef.MS_MSBHL5080_ApSetoff_Srch01_INFO;
		this.aApSetoff_Srch01 = ((MSBHL_ApSetoffService)this).new ApSetoff_Srch01();
	}

	public static MSBHL_ApSetoffService.ApSetoff_Srch01 crtApSetoff_Srch01() {
		MSBHL_ApSetoffService lgc = new MSBHL_ApSetoffService();
		lgc.initApSetoff_Srch01();
		return lgc.aApSetoff_Srch01;
	}

	protected void paramApSetoff_Srch01(MCParam p) {
		if (this.aApSetoff_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aApSetoff_Srch01.up0());
		p.addDownBlock(aApSetoff_Srch01.down0());
	}

	protected void doApSetoff_Srch01() {
		aApSetoff_Srch01.call();
	};

	/**
	 * ApSetoff_Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch01_CndR createApSetoff_Srch01_CndR(){
		return mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch01_CndR.create();
	}

	/**
	 * ApSetoff_Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch01_DtlR createApSetoff_Srch01_DtlR(){
		return mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch01_DtlR.create();
	}
	protected MSBHL_ApSetoffService.ApSetoff_Srch03 aApSetoff_Srch03;

	protected void initApSetoff_Srch03() {
		this.info = PDef.MS_MSBHL5080_ApSetoff_Srch03_INFO;
		this.aApSetoff_Srch03 = ((MSBHL_ApSetoffService)this).new ApSetoff_Srch03();
	}

	public static MSBHL_ApSetoffService.ApSetoff_Srch03 crtApSetoff_Srch03() {
		MSBHL_ApSetoffService lgc = new MSBHL_ApSetoffService();
		lgc.initApSetoff_Srch03();
		return lgc.aApSetoff_Srch03;
	}

	protected void paramApSetoff_Srch03(MCParam p) {
		if (this.aApSetoff_Srch03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aApSetoff_Srch03.up0());
		p.addDownBlock(aApSetoff_Srch03.down0());
	}

	protected void doApSetoff_Srch03() {
		aApSetoff_Srch03.call();
	};

	/**
	 * ApSetoff_Srch03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR createApSetoff_Srch03_DtlR(){
		return mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR.create();
	}

	/**
	 * ApSetoff_Srch03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR> createApSetoff_Srch03_DtlL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR.class);
	}
	protected MSBHL_ApSetoffService.ApSetoff_Srch04 aApSetoff_Srch04;

	protected void initApSetoff_Srch04() {
		this.info = PDef.MS_MSBHL5080_ApSetoff_Srch04_INFO;
		this.aApSetoff_Srch04 = ((MSBHL_ApSetoffService)this).new ApSetoff_Srch04();
	}

	public static MSBHL_ApSetoffService.ApSetoff_Srch04 crtApSetoff_Srch04() {
		MSBHL_ApSetoffService lgc = new MSBHL_ApSetoffService();
		lgc.initApSetoff_Srch04();
		return lgc.aApSetoff_Srch04;
	}

	protected void paramApSetoff_Srch04(MCParam p) {
		if (this.aApSetoff_Srch04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aApSetoff_Srch04.up0());
		p.addDownBlock(aApSetoff_Srch04.down0());
	}

	protected void doApSetoff_Srch04() {
		aApSetoff_Srch04.call();
	};

	/**
	 * ApSetoff_Srch04_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch04_CndR createApSetoff_Srch04_CndR(){
		return mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch04_CndR.create();
	}

	/**
	 * ApSetoff_Srch04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch04_DtlR createApSetoff_Srch04_DtlR(){
		return mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch04_DtlR.create();
	}

	/**
	 * ApSetoff_Srch04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch04_DtlR> createApSetoff_Srch04_DtlL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch04_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ApSetoff_Srch01オペレーション.<p>
	 *
	 * 月次売掛残高・入金・支払照合ヘッダ・支払予定から、指定した相殺先ＣＤ、相殺部門ＣＤ、取引通貨ＣＤの売掛金残高を取得する。<br>
	 */
	abstract public class ApSetoff_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ApSetoff_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch01_DtlR down0;
		
		
		// コンストラクタ
		protected ApSetoff_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch01_CndR.create();
			down0 = mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch01_DtlR.create();

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
			invoke((MSBHL_ApSetoffService)MSBHL_ApSetoffService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ApSetoff_Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch01_CndR createApSetoff_Srch01_CndR(){
			return mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch01_CndR.create();
		}

		/**
		 * ApSetoff_Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch01_DtlR createApSetoff_Srch01_DtlR(){
			return mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch01_DtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch01_CndR
		 */
		public mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ar_bal_amt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch01_DtlR
		 */
		public mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch01_DtlR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_ApSetoffService)MSBHL_ApSetoffService_MC_A.this).info;
		}


	}
	/**
	 * ApSetoff_Srch03オペレーション.<p>
	 *
	 * 買掛明細に投入された有償支給金額を取得する。<br>
	 */
	abstract public class ApSetoff_Srch03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ApSetoff_Srch03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR> down0;
		
		
		// コンストラクタ
		protected ApSetoff_Srch03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR.class);

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
			invoke((MSBHL_ApSetoffService)MSBHL_ApSetoffService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ApSetoff_Srch03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR createApSetoff_Srch03_DtlR(){
			return mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR.create();
		}

		/**
		 * ApSetoff_Srch03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR> createApSetoff_Srch03_DtlL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ap_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>onr_prov_bal</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_ApSetoffService)MSBHL_ApSetoffService_MC_A.this).info;
		}


	}
	/**
	 * ApSetoff_Srch04オペレーション.<p>
	 *
	 * 支給実績・支払実績、有償支給残高から指定した計上年月の有償支給情報を取得する<br>
	 */
	abstract public class ApSetoff_Srch04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ApSetoff_Srch04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch04_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch04_DtlR> down0;
		
		
		// コンストラクタ
		protected ApSetoff_Srch04() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch04_CndR.create();
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch04_DtlR.class);

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
			invoke((MSBHL_ApSetoffService)MSBHL_ApSetoffService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ApSetoff_Srch04_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch04_CndR createApSetoff_Srch04_CndR(){
			return mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch04_CndR.create();
		}

		/**
		 * ApSetoff_Srch04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch04_DtlR createApSetoff_Srch04_DtlR(){
			return mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch04_DtlR.create();
		}

		/**
		 * ApSetoff_Srch04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch04_DtlR> createApSetoff_Srch04_DtlL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch04_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ac_ym_to</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dac_vld_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_payschd_flg</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch04_CndR
		 */
		public mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch04_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>init_bal</td></tr>
		 * 	<tr><td><br></td><td>onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>onr_prov_ret_amt</td></tr>
		 * 	<tr><td><br></td><td>setoff_amt</td></tr>
		 * 	<tr><td><br></td><td>setoff_schd_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_amt</td></tr>
		 * 	<tr><td><br></td><td>end_bal</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_init_bal</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_ret_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_setoff_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_setoff_schd_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_end_bal</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch04_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_ApSetoffService)MSBHL_ApSetoffService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}