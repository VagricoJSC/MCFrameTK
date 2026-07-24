package mcframe.serverMSBG.MSBGL5100;

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
 * "MSBGL_ArDtlApplService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGL_ArDtlApplService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBG";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBGL5100";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBGL_ArDtlApplService.ArDtlAppl_Chk01 aArDtlAppl_Chk01;

	protected void initArDtlAppl_Chk01() {
		this.info = PDef.MS_MSBGL5100_ArDtlAppl_Chk01_INFO;
		this.aArDtlAppl_Chk01 = ((MSBGL_ArDtlApplService)this).new ArDtlAppl_Chk01();
	}

	public static MSBGL_ArDtlApplService.ArDtlAppl_Chk01 crtArDtlAppl_Chk01() {
		MSBGL_ArDtlApplService lgc = new MSBGL_ArDtlApplService();
		lgc.initArDtlAppl_Chk01();
		return lgc.aArDtlAppl_Chk01;
	}

	protected void paramArDtlAppl_Chk01(MCParam p) {
		if (this.aArDtlAppl_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArDtlAppl_Chk01.up0());
		p.addDownBlock(aArDtlAppl_Chk01.down0());
	}

	protected void doArDtlAppl_Chk01() {
		aArDtlAppl_Chk01.call();
	};

	/**
	 * ArDtlAppl_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR createArDtlAppl_Chk01_DtlR(){
		return mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR.create();
	}

	/**
	 * ArDtlAppl_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR> createArDtlAppl_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR.class);
	}
	protected MSBGL_ArDtlApplService.ArDtlAppl_Upd01 aArDtlAppl_Upd01;

	protected void initArDtlAppl_Upd01() {
		this.info = PDef.MS_MSBGL5100_ArDtlAppl_Upd01_INFO;
		this.aArDtlAppl_Upd01 = ((MSBGL_ArDtlApplService)this).new ArDtlAppl_Upd01();
	}

	public static MSBGL_ArDtlApplService.ArDtlAppl_Upd01 crtArDtlAppl_Upd01() {
		MSBGL_ArDtlApplService lgc = new MSBGL_ArDtlApplService();
		lgc.initArDtlAppl_Upd01();
		return lgc.aArDtlAppl_Upd01;
	}

	protected void paramArDtlAppl_Upd01(MCParam p) {
		if (this.aArDtlAppl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArDtlAppl_Upd01.up0());
	}

	protected void doArDtlAppl_Upd01() {
		aArDtlAppl_Upd01.call();
	};

	/**
	 * ArDtlAppl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR createArDtlAppl_Upd01_DtlR(){
		return mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR.create();
	}

	/**
	 * ArDtlAppl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR> createArDtlAppl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR.class);
	}

	/**
	 * ArDtlAppl_Upd01_BillDApplBalブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Upd01_BillDApplBalR createArDtlAppl_Upd01_BillDApplBalR(){
		return mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Upd01_BillDApplBalR.create();
	}

	/**
	 * ArDtlAppl_Upd01_BillDApplBalブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Upd01_BillDApplBalR> createArDtlAppl_Upd01_BillDApplBalL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Upd01_BillDApplBalR.class);
	}
	protected MSBGL_ArDtlApplService.ArDtlAppl_Upd02 aArDtlAppl_Upd02;

	protected void initArDtlAppl_Upd02() {
		this.info = PDef.MS_MSBGL5100_ArDtlAppl_Upd02_INFO;
		this.aArDtlAppl_Upd02 = ((MSBGL_ArDtlApplService)this).new ArDtlAppl_Upd02();
	}

	public static MSBGL_ArDtlApplService.ArDtlAppl_Upd02 crtArDtlAppl_Upd02() {
		MSBGL_ArDtlApplService lgc = new MSBGL_ArDtlApplService();
		lgc.initArDtlAppl_Upd02();
		return lgc.aArDtlAppl_Upd02;
	}

	protected void paramArDtlAppl_Upd02(MCParam p) {
		if (this.aArDtlAppl_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArDtlAppl_Upd02.up0());
	}

	protected void doArDtlAppl_Upd02() {
		aArDtlAppl_Upd02.call();
	};

	/**
	 * ArDtlAppl_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Upd02_DtlR createArDtlAppl_Upd02_DtlR(){
		return mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Upd02_DtlR.create();
	}

	/**
	 * ArDtlAppl_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Upd02_DtlR> createArDtlAppl_Upd02_DtlL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Upd02_DtlR.class);
	}
	protected MSBGL_ArDtlApplService.ArDtlAppl_Upd03 aArDtlAppl_Upd03;

	protected void initArDtlAppl_Upd03() {
		this.info = PDef.MS_MSBGL5100_ArDtlAppl_Upd03_INFO;
		this.aArDtlAppl_Upd03 = ((MSBGL_ArDtlApplService)this).new ArDtlAppl_Upd03();
	}

	public static MSBGL_ArDtlApplService.ArDtlAppl_Upd03 crtArDtlAppl_Upd03() {
		MSBGL_ArDtlApplService lgc = new MSBGL_ArDtlApplService();
		lgc.initArDtlAppl_Upd03();
		return lgc.aArDtlAppl_Upd03;
	}

	protected void paramArDtlAppl_Upd03(MCParam p) {
		if (this.aArDtlAppl_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
	}

	protected void doArDtlAppl_Upd03() {
		aArDtlAppl_Upd03.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ArDtlAppl_Chk01オペレーション.<p>
	 *
	 * 消込処理用のチェックを行う<br>
	 */
	abstract public class ArDtlAppl_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArDtlAppl_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected ArDtlAppl_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR.class);

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
			invoke((MSBGL_ArDtlApplService)MSBGL_ArDtlApplService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ArDtlAppl_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR createArDtlAppl_Chk01_DtlR(){
			return mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR.create();
		}

		/**
		 * ArDtlAppl_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR> createArDtlAppl_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>bill_d_no</td></tr>
		 * 	<tr><td><br></td><td>parent_bill_d_no</td></tr>
		 * 	<tr><td><br></td><td>bill_mng_no</td></tr>
		 * 	<tr><td><br></td><td>appl_amt</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_seq</td></tr>
		 * 	<tr><td><br></td><td>ar_appl_flg</td></tr>
		 * 	<tr><td><br></td><td>un_dtl_appl_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>bill_d_no</td></tr>
		 * 	<tr><td><br></td><td>parent_bill_d_no</td></tr>
		 * 	<tr><td><br></td><td>bill_mng_no</td></tr>
		 * 	<tr><td><br></td><td>appl_amt</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_seq</td></tr>
		 * 	<tr><td><br></td><td>ar_appl_flg</td></tr>
		 * 	<tr><td><br></td><td>un_dtl_appl_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_ArDtlApplService)MSBGL_ArDtlApplService_MC_A.this).info;
		}


	}
	/**
	 * ArDtlAppl_Upd01オペレーション.<p>
	 *
	 * 売掛明細消込処理を行う<br>
	 */
	abstract public class ArDtlAppl_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArDtlAppl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR> up0;
		/** [ArDtlAppl_Upd01_BillDApplBal]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Upd01_BillDApplBalR> aArDtlAppl_Upd01_BillDApplBal;
		
		
		// コンストラクタ
		protected ArDtlAppl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR.class);
			aArDtlAppl_Upd01_BillDApplBal = MCList.create(mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Upd01_BillDApplBalR.class);

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
			invoke((MSBGL_ArDtlApplService)MSBGL_ArDtlApplService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ArDtlAppl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR createArDtlAppl_Upd01_DtlR(){
			return mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR.create();
		}

		/**
		 * ArDtlAppl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR> createArDtlAppl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR.class);
		}

		/**
		 * ArDtlAppl_Upd01_BillDApplBalブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Upd01_BillDApplBalR createArDtlAppl_Upd01_BillDApplBalR(){
			return mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Upd01_BillDApplBalR.create();
		}

		/**
		 * ArDtlAppl_Upd01_BillDApplBalブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Upd01_BillDApplBalR> createArDtlAppl_Upd01_BillDApplBalL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Upd01_BillDApplBalR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>bill_d_no</td></tr>
		 * 	<tr><td><br></td><td>parent_bill_d_no</td></tr>
		 * 	<tr><td><br></td><td>bill_mng_no</td></tr>
		 * 	<tr><td><br></td><td>appl_amt</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_seq</td></tr>
		 * 	<tr><td><br></td><td>ar_appl_flg</td></tr>
		 * 	<tr><td><br></td><td>un_dtl_appl_flg</td></tr>
		 * 	<tr><td><br></td><td>no_upd_ar_bal_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR> up0() {
			return up0;
		}



		/**
		 * [ArDtlAppl_Upd01_BillDApplBal]ブロックのコンテナaArDtlAppl_Upd01_BillDApplBalLを返します。
		 *
		 * @return ArDtlAppl_Upd01_BillDApplBalL
		 */
		public MCList<mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Upd01_BillDApplBalR> ArDtlAppl_Upd01_BillDApplBal() {
			return aArDtlAppl_Upd01_BillDApplBal;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_ArDtlApplService)MSBGL_ArDtlApplService_MC_A.this).info;
		}


	}
	/**
	 * ArDtlAppl_Upd02オペレーション.<p>
	 *
	 * 売掛明細の自動消込処理を行う<br>
	 */
	abstract public class ArDtlAppl_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArDtlAppl_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Upd02_DtlR> up0;
		
		
		// コンストラクタ
		protected ArDtlAppl_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Upd02_DtlR.class);

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
			invoke((MSBGL_ArDtlApplService)MSBGL_ArDtlApplService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ArDtlAppl_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Upd02_DtlR createArDtlAppl_Upd02_DtlR(){
			return mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Upd02_DtlR.create();
		}

		/**
		 * ArDtlAppl_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Upd02_DtlR> createArDtlAppl_Upd02_DtlL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Upd02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>appl_tgt_amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Upd02_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_ArDtlApplService)MSBGL_ArDtlApplService_MC_A.this).info;
		}


	}
	/**
	 * ArDtlAppl_Upd03オペレーション.<p>
	 *
	 * 売掛明細の自動消込処理を行う<br>
	 */
	abstract public class ArDtlAppl_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArDtlAppl_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		
		
		// コンストラクタ
		protected ArDtlAppl_Upd03() {
			
			// このオペレーションのコンテナ初期化

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
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGL_ArDtlApplService)MSBGL_ArDtlApplService_MC_A.this);
		}
		
		protected void clear() {
		}
		//-------------------------外部 I/F--------------------------



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_ArDtlApplService)MSBGL_ArDtlApplService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}