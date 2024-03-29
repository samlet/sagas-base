package com.sagas.storage;/*
 * MinIO Java SDK for Amazon S3 Compatible Cloud Storage, (C) 2015 MinIO, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.List;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidKeyException;

import org.xmlpull.v1.XmlPullParserException;

import io.minio.MinioClient;
import io.minio.errors.MinioException;
import io.minio.messages.Bucket;

public class ListBuckets {
  /**
   * MinioClient.listBuckets() example.
   */
  public static void main(String[] args)
    throws IOException, NoSuchAlgorithmException, InvalidKeyException, XmlPullParserException {
    try {
      /* play.min.io for test and development. */
      // MinioClient minioClient = new MinioClient("https://play.min.io:9000", "Q3AM3UQ867SPQQA43P2F",
      //                                          "zuf+tfteSlswRu7BJ86wekitnifILbZam1KYY3TG");

      /* Amazon S3: */
      // MinioClient minioClient = new MinioClient("https://s3.amazonaws.com", "YOUR-ACCESSKEYID",
      //                                           "YOUR-SECRETACCESSKEY");

      MinioClient minioClient = new MinioClient("http://localhost:9001", "minio",
                                                        "minio123");

      // List buckets we have atleast read access.
      List<Bucket> bucketList = minioClient.listBuckets();
      for (Bucket bucket : bucketList) {
        System.out.println(bucket.creationDate() + ", " + bucket.name());
      }
    } catch (MinioException e) {
      System.out.println("Error occurred: " + e);
    }
  }
}
