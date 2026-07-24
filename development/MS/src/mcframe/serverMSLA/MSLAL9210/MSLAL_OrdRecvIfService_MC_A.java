package mcframe.serverMSLA.MSLAL9210;

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
 * "MSLAL_OrdRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_OrdRecvIfService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSLA";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSLAL9210";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_OrdRecvIfService.OrdRecvIf_Chk01 aOrdRecvIf_Chk01;

	protected void initOrdRecvIf_Chk01() {
		this.info = PDef.MS_MSLAL9210_OrdRecvIf_Chk01_INFO;
		this.aOrdRecvIf_Chk01 = ((MSLAL_OrdRecvIfService)this).new OrdRecvIf_Chk01();
	}

	public static MSLAL_OrdRecvIfService.OrdRecvIf_Chk01 crtOrdRecvIf_Chk01() {
		MSLAL_OrdRecvIfService lgc = new MSLAL_OrdRecvIfService();
		lgc.initOrdRecvIf_Chk01();
		return lgc.aOrdRecvIf_Chk01;
	}

	protected void paramOrdRecvIf_Chk01(MCParam p) {
		if (this.aOrdRecvIf_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrdRecvIf_Chk01.up0());
		p.addDownBlock(aOrdRecvIf_Chk01.down0());
		p.addDownBlock(aOrdRecvIf_Chk01.down1());
		p.addDownBlock(aOrdRecvIf_Chk01.down2());
	}

	protected void doOrdRecvIf_Chk01() {
		aOrdRecvIf_Chk01.call();
	};

	/**
	 * OrdRecvIf_Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Chk01_CndR createOrdRecvIf_Chk01_CndR(){
		return mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Chk01_CndR.create();
	}

	/**
	 * OrdRecvIf_Chk01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Chk01_CndR> createOrdRecvIf_Chk01_CndL(){
		return MCList.create(mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Chk01_CndR.class);
	}

	/**
	 * OrdRecvIf_Chk01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R createOrdRecvIf_Chk01_Dtl1R(){
		return mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.create();
	}

	/**
	 * OrdRecvIf_Chk01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> createOrdRecvIf_Chk01_Dtl1L(){
		return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.class);
	}

	/**
	 * OrdRecvIf_Chk01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R createOrdRecvIf_Chk01_Dtl2R(){
		return mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R.create();
	}

	/**
	 * OrdRecvIf_Chk01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R> createOrdRecvIf_Chk01_Dtl2L(){
		return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R.class);
	}
	protected MSLAL_OrdRecvIfService.OrdRecvIf_Upd01 aOrdRecvIf_Upd01;

	protected void initOrdRecvIf_Upd01() {
		this.info = PDef.MS_MSLAL9210_OrdRecvIf_Upd01_INFO;
		this.aOrdRecvIf_Upd01 = ((MSLAL_OrdRecvIfService)this).new OrdRecvIf_Upd01();
	}

	public static MSLAL_OrdRecvIfService.OrdRecvIf_Upd01 crtOrdRecvIf_Upd01() {
		MSLAL_OrdRecvIfService lgc = new MSLAL_OrdRecvIfService();
		lgc.initOrdRecvIf_Upd01();
		return lgc.aOrdRecvIf_Upd01;
	}

	protected void paramOrdRecvIf_Upd01(MCParam p) {
		if (this.aOrdRecvIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrdRecvIf_Upd01.up0());
	}

	protected void doOrdRecvIf_Upd01() {
		aOrdRecvIf_Upd01.call();
	};

	/**
	 * OrdRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createOrdRecvIf_Upd01_DtlR(){
		return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
	}

	/**
	 * OrdRecvIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createOrdRecvIf_Upd01_DtlL(){
		return MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);
	}
	protected MSLAL_OrdRecvIfService.OrdRecvIf_Upd02 aOrdRecvIf_Upd02;

	protected void initOrdRecvIf_Upd02() {
		this.info = PDef.MS_MSLAL9210_OrdRecvIf_Upd02_INFO;
		this.aOrdRecvIf_Upd02 = ((MSLAL_OrdRecvIfService)this).new OrdRecvIf_Upd02();
	}

	public static MSLAL_OrdRecvIfService.OrdRecvIf_Upd02 crtOrdRecvIf_Upd02() {
		MSLAL_OrdRecvIfService lgc = new MSLAL_OrdRecvIfService();
		lgc.initOrdRecvIf_Upd02();
		return lgc.aOrdRecvIf_Upd02;
	}

	protected void paramOrdRecvIf_Upd02(MCParam p) {
		if (this.aOrdRecvIf_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrdRecvIf_Upd02.up0());
		p.addUpBlock(aOrdRecvIf_Upd02.up1());
		p.addUpBlock(aOrdRecvIf_Upd02.up2());
		p.addDownBlock(aOrdRecvIf_Upd02.down0());
	}

	protected void doOrdRecvIf_Upd02() {
		aOrdRecvIf_Upd02.call();
	};

	/**
	 * OrdRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createOrdRecvIf_Upd01_DtlR_0(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
	}

	/**
	 * OrdRecvIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createOrdRecvIf_Upd01_DtlL_0(){
		return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
	}

	/**
	 * OrdRecvIf_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createOrdRecvIf_Upd02_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}

	/**
	 * OrdRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createOrdRecvIf_Upd02_RsltR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
	}

	/**
	 * OrdRecvIf_Upd02_OrdRepCndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd02_OrdRepCndR createOrdRecvIf_Upd02_OrdRepCndR(){
		return mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd02_OrdRepCndR.create();
	}
	protected MSLAL_OrdRecvIfService.OrdRecvIf_Upd03 aOrdRecvIf_Upd03;

	protected void initOrdRecvIf_Upd03() {
		this.info = PDef.MS_MSLAL9210_OrdRecvIf_Upd03_INFO;
		this.aOrdRecvIf_Upd03 = ((MSLAL_OrdRecvIfService)this).new OrdRecvIf_Upd03();
	}

	public static MSLAL_OrdRecvIfService.OrdRecvIf_Upd03 crtOrdRecvIf_Upd03() {
		MSLAL_OrdRecvIfService lgc = new MSLAL_OrdRecvIfService();
		lgc.initOrdRecvIf_Upd03();
		return lgc.aOrdRecvIf_Upd03;
	}

	protected void paramOrdRecvIf_Upd03(MCParam p) {
		if (this.aOrdRecvIf_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrdRecvIf_Upd03.up0());
		p.addDownBlock(aOrdRecvIf_Upd03.down0());
	}

	protected void doOrdRecvIf_Upd03() {
		aOrdRecvIf_Upd03.call();
	};

	/**
	 * OrdRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd03_DtlR createOrdRecvIf_Upd03_DtlR(){
		return mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd03_DtlR.create();
	}

	/**
	 * OrdRecvIf_Upd03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd03_DtlR> createOrdRecvIf_Upd03_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd03_DtlR.class);
	}

	/**
	 * OrdRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createOrdRecvIf_Upd03_RsltR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
	}
	protected MSLAL_OrdRecvIfService.OrdRecvIf_Upd04 aOrdRecvIf_Upd04;

	protected void initOrdRecvIf_Upd04() {
		this.info = PDef.MS_MSLAL9210_OrdRecvIf_Upd04_INFO;
		this.aOrdRecvIf_Upd04 = ((MSLAL_OrdRecvIfService)this).new OrdRecvIf_Upd04();
	}

	public static MSLAL_OrdRecvIfService.OrdRecvIf_Upd04 crtOrdRecvIf_Upd04() {
		MSLAL_OrdRecvIfService lgc = new MSLAL_OrdRecvIfService();
		lgc.initOrdRecvIf_Upd04();
		return lgc.aOrdRecvIf_Upd04;
	}

	protected void paramOrdRecvIf_Upd04(MCParam p) {
		if (this.aOrdRecvIf_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrdRecvIf_Upd04.up0());
		p.addDownBlock(aOrdRecvIf_Upd04.down0());
		p.addDownBlock(aOrdRecvIf_Upd04.down1());
	}

	protected void doOrdRecvIf_Upd04() {
		aOrdRecvIf_Upd04.call();
	};

	/**
	 * OrdRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd04_DtlR createOrdRecvIf_Upd04_DtlR(){
		return mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd04_DtlR.create();
	}

	/**
	 * OrdRecvIf_Upd04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd04_DtlR> createOrdRecvIf_Upd04_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd04_DtlR.class);
	}

	/**
	 * RcvRecvIf_Upd04_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createRcvRecvIf_Upd04_RsltR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * OrdRecvIf_Chk01オペレーション.<p>
	 *
	 * オーダ受信ＩＦ取込を行う前のチェック処理<br>
	 */
	abstract public class OrdRecvIf_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OrdRecvIf_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Chk01_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Chk01_CndR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R> down2;
		
		
		// コンストラクタ
		protected OrdRecvIf_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Chk01_CndR.class);
			down0 = MCList.create(mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Chk01_CndR.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.class);
			down2 = MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R.class);

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
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_OrdRecvIfService)MSLAL_OrdRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * OrdRecvIf_Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Chk01_CndR createOrdRecvIf_Chk01_CndR(){
			return mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Chk01_CndR.create();
		}

		/**
		 * OrdRecvIf_Chk01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Chk01_CndR> createOrdRecvIf_Chk01_CndL(){
			return MCList.create(mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Chk01_CndR.class);
		}

		/**
		 * OrdRecvIf_Chk01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R createOrdRecvIf_Chk01_Dtl1R(){
			return mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.create();
		}

		/**
		 * OrdRecvIf_Chk01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> createOrdRecvIf_Chk01_Dtl1L(){
			return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R.class);
		}

		/**
		 * OrdRecvIf_Chk01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R createOrdRecvIf_Chk01_Dtl2R(){
			return mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R.create();
		}

		/**
		 * OrdRecvIf_Chk01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R> createOrdRecvIf_Chk01_Dtl2L(){
			return MCList.create(mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ordif.data_lno</td></tr>
		 * 	<tr><td><br></td><td>ordif.data_no</td></tr>
		 * 	<tr><td><br></td><td>ordif.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ordif.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ordif.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ordif.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>ordif.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>ordif.data_make_dt</td></tr>
		 * 	<tr><td><br></td><td>ordif.imp_flg</td></tr>
		 * 	<tr><td><br></td><td>ordif.recv_dt</td></tr>
		 * 	<tr><td><br></td><td>ordif.ext_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ordif.ext_oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ordif.itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>ordif.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ordif.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ordif.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ordif.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ordif.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ordif.ver_no</td></tr>
		 * 	<tr><td><br></td><td>ordif.strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ordif.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ordif.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>ordif.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>ordif.inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ordif.yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>ordif.po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ordif.mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ordif.mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ordif.strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ordif.accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ordif.insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ordif.insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ordif.avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ordif.master_dt</td></tr>
		 * 	<tr><td><br></td><td>ordif.sno1</td></tr>
		 * 	<tr><td><br></td><td>ordif.sno2</td></tr>
		 * 	<tr><td><br></td><td>ordif.sno3</td></tr>
		 * 	<tr><td><br></td><td>ordif.sno4</td></tr>
		 * 	<tr><td><br></td><td>ordif.inst_po_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ordif.itm_ord_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ordif.itm_ord_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ordif.itm_ord_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ordif.itm_ord_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ordif.st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ordif.end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ordif.oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>ordif.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>ordif.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>ordif.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>ordif.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ordif.oper_rsrc</td></tr>
		 * 	<tr><td><br></td><td>ordif.oper_ord_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ordif.oper_ord_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ordif.oper_ord_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ordif.oper_ord_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>if_scheduler_typ</td></tr>
		 * 	<tr><td><br></td><td>ordif.scheduler_frozen_flg</td></tr>
		 * 	<tr><td><br></td><td>allow_outsrc_schd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Chk01_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Chk01_CndR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mrp_typ</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>a_itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>b_itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_pr_flg</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_gnrt_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ord.ver_no</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.mst_mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.nmr_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.dnm_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.fxd_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.fix_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_purc_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.purc_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_mfg_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.xfr_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.accpt_insp_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_offst</td></tr>
		 * 	<tr><td><br></td><td>ord.avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mrp_avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.master_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.sno1</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ1</td></tr>
		 * 	<tr><td><br></td><td>ord.sno2</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ2</td></tr>
		 * 	<tr><td><br></td><td>ord.sno3</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ3</td></tr>
		 * 	<tr><td><br></td><td>ord.sno4</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ4</td></tr>
		 * 	<tr><td><br></td><td>ord.lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.not_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_fix_pd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqmt_no</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_po_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ord.sim_mrp_no</td></tr>
		 * 	<tr><td><br></td><td>ord.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ord.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ord.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ord.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ord.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_snd_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.ext_itm_ord_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no_d</td></tr>
		 * 	<tr><td><br></td><td>oord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_lt</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_offst</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>oord.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>oord.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.yield_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_rsrc</td></tr>
		 * 	<tr><td><br></td><td>oord.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>oord.ext_oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.scheduler_frozen_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_OrdRecvIfService)MSLAL_OrdRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * OrdRecvIf_Upd01オペレーション.<p>
	 *
	 * オーダ受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	abstract public class OrdRecvIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverPFUD.PFUDL0040.IfPFUDL_ESBRecvIf_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OrdRecvIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected OrdRecvIf_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);

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
			invoke((MSLAL_OrdRecvIfService)MSLAL_OrdRecvIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * OrdRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createOrdRecvIf_Upd01_DtlR(){
			return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
		}

		/**
		 * OrdRecvIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createOrdRecvIf_Upd01_DtlL(){
			return MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_OrdRecvIfService)MSLAL_OrdRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * OrdRecvIf_Upd02オペレーション.<p>
	 *
	 * オーダ受信ＩＦ取込を行う。（ＩＦデータ確認、およびオーダ受信ＩＦ取込バッチから呼び出される）<br>
	 */
	abstract public class OrdRecvIf_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMBBE.MBBEL5010.IfMBBEL_IfDataImpService_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OrdRecvIf_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd02_OrdRepCndR up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0;
		
		
		// コンストラクタ
		protected OrdRecvIf_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
			up1 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
			up2 = mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd02_OrdRepCndR.create();
			down0 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();

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
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_OrdRecvIfService)MSLAL_OrdRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OrdRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createOrdRecvIf_Upd01_DtlR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
		}

		/**
		 * OrdRecvIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createOrdRecvIf_Upd01_DtlL(){
			return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
		}

		/**
		 * OrdRecvIf_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createOrdRecvIf_Upd02_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		/**
		 * OrdRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createOrdRecvIf_Upd02_RsltR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
		}

		/**
		 * OrdRecvIf_Upd02_OrdRepCndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd02_OrdRepCndR createOrdRecvIf_Upd02_OrdRepCndR(){
			return mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd02_OrdRepCndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>exe_unit_lump_flg</td></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>src_actlumprecv_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ord_rep_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>if_scheduler_typ</td></tr>
		 * 	<tr><td><br></td><td>allow_outsrc_schd_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd02_OrdRepCndR
		 */
		public mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd02_OrdRepCndR up2() {
			return up2;
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
		 * 	<tr><td><br></td><td>skip_num</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_OrdRecvIfService)MSLAL_OrdRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * OrdRecvIf_Upd03オペレーション.<p>
	 *
	 * オーダ受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	abstract public class OrdRecvIf_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OrdRecvIf_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd03_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0;
		
		
		// コンストラクタ
		protected OrdRecvIf_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd03_DtlR.class);
			down0 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();

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
			invoke((MSLAL_OrdRecvIfService)MSLAL_OrdRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OrdRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd03_DtlR createOrdRecvIf_Upd03_DtlR(){
			return mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd03_DtlR.create();
		}

		/**
		 * OrdRecvIf_Upd03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd03_DtlR> createOrdRecvIf_Upd03_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd03_DtlR.class);
		}

		/**
		 * OrdRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createOrdRecvIf_Upd03_RsltR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ordif.data_lno</td></tr>
		 * 	<tr><td><br></td><td>ordif.data_no</td></tr>
		 * 	<tr><td><br></td><td>ordif.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ordif.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>ordif.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>ordif.ext_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ordif.ext_oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>if_scheduler_typ</td></tr>
		 * 	<tr><td><br></td><td>allow_outsrc_schd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd03_DtlR> up0() {
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
		 * 	<tr><td><br></td><td>skip_num</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_OrdRecvIfService)MSLAL_OrdRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * OrdRecvIf_Upd04オペレーション.<p>
	 *
	 * オーダ受信ＩＦ取込を行う。(オーダ受信ＩＦサービスを呼び出す本処理）<br>
	 */
	abstract public class OrdRecvIf_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OrdRecvIf_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd04_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd04_DtlR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down1;
		
		
		// コンストラクタ
		protected OrdRecvIf_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd04_DtlR.class);
			down0 = MCList.create(mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd04_DtlR.class);
			down1 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();

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
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_OrdRecvIfService)MSLAL_OrdRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * OrdRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd04_DtlR createOrdRecvIf_Upd04_DtlR(){
			return mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd04_DtlR.create();
		}

		/**
		 * OrdRecvIf_Upd04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd04_DtlR> createOrdRecvIf_Upd04_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd04_DtlR.class);
		}

		/**
		 * RcvRecvIf_Upd04_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createRcvRecvIf_Upd04_RsltR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ordif.data_lno</td></tr>
		 * 	<tr><td><br></td><td>ordif.data_no</td></tr>
		 * 	<tr><td><br></td><td>ordif.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ordif.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>ordif.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>ordif.ext_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ordif.ext_oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>if_scheduler_typ</td></tr>
		 * 	<tr><td><br></td><td>allow_outsrc_schd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd04_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ordif.data_lno</td></tr>
		 * 	<tr><td><br></td><td>ordif.data_no</td></tr>
		 * 	<tr><td><br></td><td>ordif.exe_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9210.OrdRecvIf_Upd04_DtlR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>total_num</td></tr>
		 * 	<tr><td><br></td><td>ok_num</td></tr>
		 * 	<tr><td><br></td><td>err_num</td></tr>
		 * 	<tr><td><br></td><td>skip_num</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_OrdRecvIfService)MSLAL_OrdRecvIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}