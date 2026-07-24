package mcframe.serverMSBE.MSBEL5080;

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
 * "MSBEL_InptStkRplService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_InptStkRplService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBEL5080";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_InptStkRplService.InptStkRpl_Ins01 aInptStkRpl_Ins01;

	protected void initInptStkRpl_Ins01() {
		this.info = PDef.MS_MSBEL5080_InptStkRpl_Ins01_INFO;
		this.aInptStkRpl_Ins01 = ((MSBEL_InptStkRplService)this).new InptStkRpl_Ins01();
	}

	public static MSBEL_InptStkRplService.InptStkRpl_Ins01 crtInptStkRpl_Ins01() {
		MSBEL_InptStkRplService lgc = new MSBEL_InptStkRplService();
		lgc.initInptStkRpl_Ins01();
		return lgc.aInptStkRpl_Ins01;
	}

	protected void paramInptStkRpl_Ins01(MCParam p) {
		if (this.aInptStkRpl_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInptStkRpl_Ins01.up0());
		p.addUpBlock(aInptStkRpl_Ins01.up1());
		p.addDownBlock(aInptStkRpl_Ins01.down0());
	}

	protected void doInptStkRpl_Ins01() {
		aInptStkRpl_Ins01.call();
	};

	/**
	 * InptStkRpl_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR createInptStkRpl_CndR(){
		return mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR.create();
	}

	/**
	 * InptStkRpl_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR createInptStkRpl_DtlR(){
		return mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR.create();
	}

	/**
	 * InptStkRpl_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR> createInptStkRpl_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR.class);
	}

	/**
	 * InptStkRpl_CntブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR createInptStkRpl_CntR(){
		return mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR.create();
	}
	protected MSBEL_InptStkRplService.InptStkRpl_Ins02 aInptStkRpl_Ins02;

	protected void initInptStkRpl_Ins02() {
		this.info = PDef.MS_MSBEL5080_InptStkRpl_Ins02_INFO;
		this.aInptStkRpl_Ins02 = ((MSBEL_InptStkRplService)this).new InptStkRpl_Ins02();
	}

	public static MSBEL_InptStkRplService.InptStkRpl_Ins02 crtInptStkRpl_Ins02() {
		MSBEL_InptStkRplService lgc = new MSBEL_InptStkRplService();
		lgc.initInptStkRpl_Ins02();
		return lgc.aInptStkRpl_Ins02;
	}

	protected void paramInptStkRpl_Ins02(MCParam p) {
		if (this.aInptStkRpl_Ins02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInptStkRpl_Ins02.up0());
		p.addUpBlock(aInptStkRpl_Ins02.up1());
		p.addDownBlock(aInptStkRpl_Ins02.down0());
	}

	protected void doInptStkRpl_Ins02() {
		aInptStkRpl_Ins02.call();
	};
	protected MSBEL_InptStkRplService.InptStkRpl_Ins03 aInptStkRpl_Ins03;

	protected void initInptStkRpl_Ins03() {
		this.info = PDef.MS_MSBEL5080_InptStkRpl_Ins03_INFO;
		this.aInptStkRpl_Ins03 = ((MSBEL_InptStkRplService)this).new InptStkRpl_Ins03();
	}

	public static MSBEL_InptStkRplService.InptStkRpl_Ins03 crtInptStkRpl_Ins03() {
		MSBEL_InptStkRplService lgc = new MSBEL_InptStkRplService();
		lgc.initInptStkRpl_Ins03();
		return lgc.aInptStkRpl_Ins03;
	}

	protected void paramInptStkRpl_Ins03(MCParam p) {
		if (this.aInptStkRpl_Ins03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInptStkRpl_Ins03.up0());
		p.addUpBlock(aInptStkRpl_Ins03.up1());
		p.addDownBlock(aInptStkRpl_Ins03.down0());
	}

	protected void doInptStkRpl_Ins03() {
		aInptStkRpl_Ins03.call();
	};

	/**
	 * InptStkRpl_LstブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR createInptStkRpl_LstR(){
		return mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR.create();
	}

	/**
	 * InptStkRpl_LstブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR> createInptStkRpl_LstL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR.class);
	}
	protected MSBEL_InptStkRplService.InptStkRpl_Del01 aInptStkRpl_Del01;

	protected void initInptStkRpl_Del01() {
		this.info = PDef.MS_MSBEL5080_InptStkRpl_Del01_INFO;
		this.aInptStkRpl_Del01 = ((MSBEL_InptStkRplService)this).new InptStkRpl_Del01();
	}

	public static MSBEL_InptStkRplService.InptStkRpl_Del01 crtInptStkRpl_Del01() {
		MSBEL_InptStkRplService lgc = new MSBEL_InptStkRplService();
		lgc.initInptStkRpl_Del01();
		return lgc.aInptStkRpl_Del01;
	}

	protected void paramInptStkRpl_Del01(MCParam p) {
		if (this.aInptStkRpl_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInptStkRpl_Del01.up0());
		p.addUpBlock(aInptStkRpl_Del01.up1());
		p.addDownBlock(aInptStkRpl_Del01.down0());
	}

	protected void doInptStkRpl_Del01() {
		aInptStkRpl_Del01.call();
	};
	protected MSBEL_InptStkRplService.InptStkRpl_LstIns01 aInptStkRpl_LstIns01;

	protected void initInptStkRpl_LstIns01() {
		this.info = PDef.MS_MSBEL5080_InptStkRpl_LstIns01_INFO;
		this.aInptStkRpl_LstIns01 = ((MSBEL_InptStkRplService)this).new InptStkRpl_LstIns01();
	}

	public static MSBEL_InptStkRplService.InptStkRpl_LstIns01 crtInptStkRpl_LstIns01() {
		MSBEL_InptStkRplService lgc = new MSBEL_InptStkRplService();
		lgc.initInptStkRpl_LstIns01();
		return lgc.aInptStkRpl_LstIns01;
	}

	protected void paramInptStkRpl_LstIns01(MCParam p) {
		if (this.aInptStkRpl_LstIns01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInptStkRpl_LstIns01.up0());
		p.addUpBlock(aInptStkRpl_LstIns01.up1());
		p.addDownBlock(aInptStkRpl_LstIns01.down0());
		p.addDownBlock(aInptStkRpl_LstIns01.down1());
	}

	protected void doInptStkRpl_LstIns01() {
		aInptStkRpl_LstIns01.call();
	};
	protected MSBEL_InptStkRplService.InptStkRpl_XfrIns01 aInptStkRpl_XfrIns01;

	protected void initInptStkRpl_XfrIns01() {
		this.info = PDef.MS_MSBEL5080_InptStkRpl_XfrIns01_INFO;
		this.aInptStkRpl_XfrIns01 = ((MSBEL_InptStkRplService)this).new InptStkRpl_XfrIns01();
	}

	public static MSBEL_InptStkRplService.InptStkRpl_XfrIns01 crtInptStkRpl_XfrIns01() {
		MSBEL_InptStkRplService lgc = new MSBEL_InptStkRplService();
		lgc.initInptStkRpl_XfrIns01();
		return lgc.aInptStkRpl_XfrIns01;
	}

	protected void paramInptStkRpl_XfrIns01(MCParam p) {
		if (this.aInptStkRpl_XfrIns01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInptStkRpl_XfrIns01.up0());
		p.addUpBlock(aInptStkRpl_XfrIns01.up1());
		p.addDownBlock(aInptStkRpl_XfrIns01.down0());
		p.addDownBlock(aInptStkRpl_XfrIns01.down1());
	}

	protected void doInptStkRpl_XfrIns01() {
		aInptStkRpl_XfrIns01.call();
	};
	protected MSBEL_InptStkRplService.InptStkRpl_LstDel01 aInptStkRpl_LstDel01;

	protected void initInptStkRpl_LstDel01() {
		this.info = PDef.MS_MSBEL5080_InptStkRpl_LstDel01_INFO;
		this.aInptStkRpl_LstDel01 = ((MSBEL_InptStkRplService)this).new InptStkRpl_LstDel01();
	}

	public static MSBEL_InptStkRplService.InptStkRpl_LstDel01 crtInptStkRpl_LstDel01() {
		MSBEL_InptStkRplService lgc = new MSBEL_InptStkRplService();
		lgc.initInptStkRpl_LstDel01();
		return lgc.aInptStkRpl_LstDel01;
	}

	protected void paramInptStkRpl_LstDel01(MCParam p) {
		if (this.aInptStkRpl_LstDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInptStkRpl_LstDel01.up0());
		p.addDownBlock(aInptStkRpl_LstDel01.down0());
	}

	protected void doInptStkRpl_LstDel01() {
		aInptStkRpl_LstDel01.call();
	};
	protected MSBEL_InptStkRplService.InptStkRpl_XfrDel01 aInptStkRpl_XfrDel01;

	protected void initInptStkRpl_XfrDel01() {
		this.info = PDef.MS_MSBEL5080_InptStkRpl_XfrDel01_INFO;
		this.aInptStkRpl_XfrDel01 = ((MSBEL_InptStkRplService)this).new InptStkRpl_XfrDel01();
	}

	public static MSBEL_InptStkRplService.InptStkRpl_XfrDel01 crtInptStkRpl_XfrDel01() {
		MSBEL_InptStkRplService lgc = new MSBEL_InptStkRplService();
		lgc.initInptStkRpl_XfrDel01();
		return lgc.aInptStkRpl_XfrDel01;
	}

	protected void paramInptStkRpl_XfrDel01(MCParam p) {
		if (this.aInptStkRpl_XfrDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInptStkRpl_XfrDel01.up0());
		p.addUpBlock(aInptStkRpl_XfrDel01.up1());
		p.addDownBlock(aInptStkRpl_XfrDel01.down0());
	}

	protected void doInptStkRpl_XfrDel01() {
		aInptStkRpl_XfrDel01.call();
	};

	/**
	 * InptStkRpl_XfrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5080.InptStkRpl_XfrR createInptStkRpl_XfrR(){
		return mcframe.serverMSBE.MSBEL5080.InptStkRpl_XfrR.create();
	}

	/**
	 * InptStkRpl_XfrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_XfrR> createInptStkRpl_XfrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5080.InptStkRpl_XfrR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * InptStkRpl_Ins01オペレーション.<p>
	 *
	 */
	abstract public class InptStkRpl_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InptStkRpl_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR down0;
		
		
		// コンストラクタ
		protected InptStkRpl_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR.class);
			down0 = mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR.create();

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_InptStkRplService)MSBEL_InptStkRplService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InptStkRpl_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR createInptStkRpl_CndR(){
			return mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR.create();
		}

		/**
		 * InptStkRpl_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR createInptStkRpl_DtlR(){
			return mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR.create();
		}

		/**
		 * InptStkRpl_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR> createInptStkRpl_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR.class);
		}

		/**
		 * InptStkRpl_CntブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR createInptStkRpl_CntR(){
			return mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xfr_schd_del_flg</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_crt_flg</td></tr>
		 * 	<tr><td><br></td><td>opn_flg</td></tr>
		 * 	<tr><td><br></td><td>ord_sav_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>schd_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_sav_flg</td></tr>
		 * 	<tr><td><br></td><td>ord_flg</td></tr>
		 * 	<tr><td><br></td><td>stt_flg</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * 	<tr><td><br></td><td>batch_log_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lst_del_cnt</td></tr>
		 * 	<tr><td><br></td><td>xfr_del_cnt</td></tr>
		 * 	<tr><td><br></td><td>inpt_io_schd_cnt</td></tr>
		 * 	<tr><td><br></td><td>lst_crt_cnt</td></tr>
		 * 	<tr><td><br></td><td>lst_del_of_xfr_crt_cnt</td></tr>
		 * 	<tr><td><br></td><td>xfr_crt_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>xfr_crt_error_cnt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_InptStkRplService)MSBEL_InptStkRplService_MC_A.this).info;
		}


	}
	/**
	 * InptStkRpl_Ins02オペレーション.<p>
	 *
	 */
	abstract public class InptStkRpl_Ins02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InptStkRpl_Ins02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR down0;
		
		
		// コンストラクタ
		protected InptStkRpl_Ins02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR.class);
			down0 = mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR.create();

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_InptStkRplService)MSBEL_InptStkRplService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InptStkRpl_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR createInptStkRpl_CndR(){
			return mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR.create();
		}

		/**
		 * InptStkRpl_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR createInptStkRpl_DtlR(){
			return mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR.create();
		}

		/**
		 * InptStkRpl_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR> createInptStkRpl_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR.class);
		}

		/**
		 * InptStkRpl_CntブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR createInptStkRpl_CntR(){
			return mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xfr_schd_del_flg</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_crt_flg</td></tr>
		 * 	<tr><td><br></td><td>opn_flg</td></tr>
		 * 	<tr><td><br></td><td>ord_sav_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>schd_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_sav_flg</td></tr>
		 * 	<tr><td><br></td><td>ord_flg</td></tr>
		 * 	<tr><td><br></td><td>stt_flg</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * 	<tr><td><br></td><td>batch_log_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xfr_del_cnt</td></tr>
		 * 	<tr><td><br></td><td>inpt_io_schd_cnt</td></tr>
		 * 	<tr><td><br></td><td>lst_crt_cnt</td></tr>
		 * 	<tr><td><br></td><td>lst_del_of_xfr_crt_cnt</td></tr>
		 * 	<tr><td><br></td><td>xfr_crt_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>xfr_crt_error_cnt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_InptStkRplService)MSBEL_InptStkRplService_MC_A.this).info;
		}


	}
	/**
	 * InptStkRpl_Ins03オペレーション.<p>
	 *
	 */
	abstract public class InptStkRpl_Ins03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InptStkRpl_Ins03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR> down0;
		
		
		// コンストラクタ
		protected InptStkRpl_Ins03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR.class);

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_InptStkRplService)MSBEL_InptStkRplService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InptStkRpl_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR createInptStkRpl_CndR(){
			return mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR.create();
		}

		/**
		 * InptStkRpl_LstブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR createInptStkRpl_LstR(){
			return mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR.create();
		}

		/**
		 * InptStkRpl_LstブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR> createInptStkRpl_LstL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>screen_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rl.batch_data_no</td></tr>
		 * 	<tr><td><br></td><td>rl.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rl.batch_data_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_InptStkRplService)MSBEL_InptStkRplService_MC_A.this).info;
		}


	}
	/**
	 * InptStkRpl_Del01オペレーション.<p>
	 *
	 */
	abstract public class InptStkRpl_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InptStkRpl_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR down0;
		
		
		// コンストラクタ
		protected InptStkRpl_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR.class);
			down0 = mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR.create();

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_InptStkRplService)MSBEL_InptStkRplService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InptStkRpl_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR createInptStkRpl_CndR(){
			return mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR.create();
		}

		/**
		 * InptStkRpl_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR createInptStkRpl_DtlR(){
			return mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR.create();
		}

		/**
		 * InptStkRpl_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR> createInptStkRpl_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR.class);
		}

		/**
		 * InptStkRpl_CntブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR createInptStkRpl_CntR(){
			return mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_stk_rpl_lst_del_flg</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_del_flg</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lst_del_cnt</td></tr>
		 * 	<tr><td><br></td><td>xfr_del_cnt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_InptStkRplService)MSBEL_InptStkRplService_MC_A.this).info;
		}


	}
	/**
	 * InptStkRpl_LstIns01オペレーション.<p>
	 *
	 */
	abstract public class InptStkRpl_LstIns01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InptStkRpl_LstIns01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR down1;
		
		
		// コンストラクタ
		protected InptStkRpl_LstIns01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR.class);
			down1 = mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR.create();

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_InptStkRplService)MSBEL_InptStkRplService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * InptStkRpl_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR createInptStkRpl_CndR(){
			return mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR.create();
		}

		/**
		 * InptStkRpl_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR createInptStkRpl_DtlR(){
			return mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR.create();
		}

		/**
		 * InptStkRpl_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR> createInptStkRpl_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR.class);
		}

		/**
		 * InptStkRpl_LstブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR createInptStkRpl_LstR(){
			return mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR.create();
		}

		/**
		 * InptStkRpl_LstブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR> createInptStkRpl_LstL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR.class);
		}

		/**
		 * InptStkRpl_CntブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR createInptStkRpl_CntR(){
			return mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>opn_flg</td></tr>
		 * 	<tr><td><br></td><td>ord_sav_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>schd_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_sav_flg</td></tr>
		 * 	<tr><td><br></td><td>ord_flg</td></tr>
		 * 	<tr><td><br></td><td>stt_flg</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * 	<tr><td><br></td><td>batch_log_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rl.batch_data_no</td></tr>
		 * 	<tr><td><br></td><td>rl.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rl.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>rl.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rl.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>rl.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>rl.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>rl.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>rl.schd_dt</td></tr>
		 * 	<tr><td><br></td><td>rl.alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>rl.alt_grp_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_io_schd_cnt</td></tr>
		 * 	<tr><td><br></td><td>lst_crt_cnt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_InptStkRplService)MSBEL_InptStkRplService_MC_A.this).info;
		}


	}
	/**
	 * InptStkRpl_XfrIns01オペレーション.<p>
	 *
	 */
	abstract public class InptStkRpl_XfrIns01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InptStkRpl_XfrIns01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR down1;
		
		
		// コンストラクタ
		protected InptStkRpl_XfrIns01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR.class);
			down1 = mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR.create();

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_InptStkRplService)MSBEL_InptStkRplService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * InptStkRpl_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR createInptStkRpl_CndR(){
			return mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR.create();
		}

		/**
		 * InptStkRpl_LstブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR createInptStkRpl_LstR(){
			return mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR.create();
		}

		/**
		 * InptStkRpl_LstブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR> createInptStkRpl_LstL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR.class);
		}

		/**
		 * InptStkRpl_CntブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR createInptStkRpl_CntR(){
			return mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>screen_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rl.batch_data_no</td></tr>
		 * 	<tr><td><br></td><td>rl.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rl.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>rl.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rl.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>rl.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>rl.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>rl.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>rl.schd_dt</td></tr>
		 * 	<tr><td><br></td><td>rl.alt_grp_id</td></tr>
		 * 	<tr><td><br></td><td>rl.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rl.batch_data_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_LstR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lst_del_of_xfr_crt_cnt</td></tr>
		 * 	<tr><td><br></td><td>xfr_crt_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>xfr_crt_error_cnt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_InptStkRplService)MSBEL_InptStkRplService_MC_A.this).info;
		}


	}
	/**
	 * InptStkRpl_LstDel01オペレーション.<p>
	 *
	 */
	abstract public class InptStkRpl_LstDel01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InptStkRpl_LstDel01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR down0;
		
		
		// コンストラクタ
		protected InptStkRpl_LstDel01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR.class);
			down0 = mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR.create();

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
			invoke((MSBEL_InptStkRplService)MSBEL_InptStkRplService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InptStkRpl_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR createInptStkRpl_DtlR(){
			return mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR.create();
		}

		/**
		 * InptStkRpl_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR> createInptStkRpl_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR.class);
		}

		/**
		 * InptStkRpl_CntブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR createInptStkRpl_CntR(){
			return mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lst_del_cnt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_InptStkRplService)MSBEL_InptStkRplService_MC_A.this).info;
		}


	}
	/**
	 * InptStkRpl_XfrDel01オペレーション.<p>
	 *
	 */
	abstract public class InptStkRpl_XfrDel01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InptStkRpl_XfrDel01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR down0;
		/** [InptStkRpl_Xfr]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_XfrR> aInptStkRpl_Xfr;
		
		
		// コンストラクタ
		protected InptStkRpl_XfrDel01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR.class);
			down0 = mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR.create();
			aInptStkRpl_Xfr = MCList.create(mcframe.serverMSBE.MSBEL5080.InptStkRpl_XfrR.class);

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_InptStkRplService)MSBEL_InptStkRplService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InptStkRpl_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR createInptStkRpl_CndR(){
			return mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR.create();
		}

		/**
		 * InptStkRpl_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR createInptStkRpl_DtlR(){
			return mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR.create();
		}

		/**
		 * InptStkRpl_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR> createInptStkRpl_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR.class);
		}

		/**
		 * InptStkRpl_XfrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_XfrR createInptStkRpl_XfrR(){
			return mcframe.serverMSBE.MSBEL5080.InptStkRpl_XfrR.create();
		}

		/**
		 * InptStkRpl_XfrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_XfrR> createInptStkRpl_XfrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5080.InptStkRpl_XfrR.class);
		}

		/**
		 * InptStkRpl_CntブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR createInptStkRpl_CntR(){
			return mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xfr_del_cnt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR
		 */
		public mcframe.serverMSBE.MSBEL5080.InptStkRpl_CntR down0() {
			return down0;
		}


		/**
		 * [InptStkRpl_Xfr]ブロックのコンテナaInptStkRpl_XfrLを返します。
		 *
		 * @return InptStkRpl_XfrL
		 */
		public MCList<mcframe.serverMSBE.MSBEL5080.InptStkRpl_XfrR> InptStkRpl_Xfr() {
			return aInptStkRpl_Xfr;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_InptStkRplService)MSBEL_InptStkRplService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}