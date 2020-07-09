package com.josephwong.maestrofication.utils

import org.apache.avro.Schema
import org.apache.avro.io.DatumReader
import org.apache.avro.io.Decoder
import org.apache.avro.io.DecoderFactory
import org.apache.avro.specific.SpecificDatumReader
import org.apache.avro.specific.SpecificRecordBase
import java.io.IOException
import java.io.InputStream

class AvroUtil {
    fun decodeFromInputStream(
        schema: Schema?,
        inputStream: InputStream?
    ): SpecificRecordBase? {
        try {
            val reader: DatumReader<SpecificRecordBase?> = SpecificDatumReader(schema)
            val decoder: Decoder = DecoderFactory.get().binaryDecoder(inputStream, null)
            return reader.read(null, decoder)
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return null
    }
}
